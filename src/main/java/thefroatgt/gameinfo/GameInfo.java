package thefroatgt.gameinfo;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import thefroatgt.gameinfo.apiresponse.Data;
import thefroatgt.gameinfo.apiresponse.Game;
import thefroatgt.gameinfo.apiresponse.Genre;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class GameInfo {

	static final List<String> PlatformList = Arrays.asList(
			"Sony Playstation 3", "Microsoft Xbox 360", "Nintendo Wii",
			"Sony Playstation 2", "Sony Playstation", "Nintendo DS", "PC",
			"Mac OS", "Sony Playstation 4",
			"Microsoft Xbox One","Nintendo Wii U", "Microsoft Xbox", 
			"Sony PSP", "Nintendo Game Boy Advance",
			"Android",
			"Nintendo 3DS",
			"iOS", 
			"Microsoft Xbox",
			"Nintendo 64",
			"Nintendo GameCube");
	
	

	static final Comparator<Date> datecomp = (p1, p2) -> p1.compareTo(p2);
	private static final SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");

	String name;
	List<String> Platforms;

	public int numGames;

	public List<String> platforms;

	public String error = "";

	public Date releaseDate;

	public String ESRB;

	public String Developer;

	public String Publisher;

	public GameInfo(String name) {
		this.name = name;
	}

	@SuppressWarnings("deprecation")
	public void Populate() {

		try {

			HttpClient client = HttpClientBuilder.create().build();
			URIBuilder uri = new URIBuilder("http://thegamesdb.net/api/GetGame.php");
			uri.addParameter("exactname", name);

			HttpGet request = new HttpGet(uri.build());

			HttpResponse response = client.execute(request);

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			JAXBContext jc = JAXBContext.newInstance(Data.class);
			Unmarshaller u = jc.createUnmarshaller();
			Data d = (Data) u.unmarshal(br);

			numGames = d.Games.size();

			platforms = d.Games.stream().map(Game::getPlatform).distinct().collect(Collectors.toList());

			Optional<Date> od = d.Games.stream()
					.map(Game::getReleaseDate)
					.filter(dd -> dd != null)
					.map(dd -> new Date(dd))
					.min(datecomp);
			
			if (od.isPresent()){
				releaseDate = od.get();
			}

			ESRB = d.Games.stream().map(Game::getESRB).filter(s -> s != null && !s.isEmpty()).distinct()
					.collect(Collectors.joining(","));


			Developer = d.Games.stream().map(Game::getDeveloper).filter(s -> s != null && s != "").distinct()
					.collect(Collectors.joining(","));

			Publisher = d.Games.stream().map(Game::getPublisher).filter(s -> s != null && s != "").distinct()
					.collect(Collectors.joining(","));

		} catch (Exception e) {
			error = e.getMessage();
			if (error == null)
				error = e.toString();
		}
	}

	private static void AddToTSV(StringBuilder sb, String s) {
		if (s != null) {
			sb.append(s);
		}
		sb.append("\t");
	}

	private static void AddToTSV(StringBuilder sb, boolean s) {
		AddToTSV(sb, Boolean.toString(s));
	}

	private static void AddToTSV(StringBuilder sb, int s) {
		AddToTSV(sb, Integer.toString(s));
	}

	private static void AddToTSV(StringBuilder sb, Date d) {
		if (d == null) {
			AddToTSV(sb, "");
		} else {
			AddToTSV(sb, ft.format(d));
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		AddToTSV(sb, name);
		AddToTSV(sb, error);
		AddToTSV(sb, numGames);

		for (String p : PlatformList) {
			AddToTSV(sb, platforms.stream().anyMatch(s -> s.equals(p)));
		}

		AddToTSV(sb, platforms.stream().filter(s -> !PlatformList.contains(s)).collect(Collectors.joining(",")));

		AddToTSV(sb, releaseDate);
		
		AddToTSV(sb, ESRB);
		
		AddToTSV(sb, Developer);
		
		AddToTSV(sb, Publisher);

		return sb.toString();
	}

	public static String headers() {
		StringBuilder sb = new StringBuilder();

		AddToTSV(sb, "name");
		AddToTSV(sb, "error");
		AddToTSV(sb, "count");
		for (String p : PlatformList) {
			AddToTSV(sb, p);
		}
		AddToTSV(sb, "otherPlatforms");
		AddToTSV(sb, "ReleaseDate");

		AddToTSV(sb, "ESRB");
		AddToTSV(sb, "Developer");
		AddToTSV(sb, "Publisher");

		return sb.toString();
	}

}
