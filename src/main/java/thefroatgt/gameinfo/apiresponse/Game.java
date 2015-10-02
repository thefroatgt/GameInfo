package thefroatgt.gameinfo.apiresponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Game {

	public String Platform;
	public String ReleaseDate;

	public String ESRB;
	public String Developer;
	public String Publisher;

	
	public String getPlatform() {
		return Platform;
	}


	public String getReleaseDate() {
		return ReleaseDate;
	}


	public String getESRB() {
		return ESRB;
	}


	public String getDeveloper() {
		return Developer;
	}


	public String getPublisher() {
		return Publisher;
	}


	public List<Genre> getGenres() {
		return Genres;
	}

	public List<Genre> Genres = new ArrayList<Genre>();

}
