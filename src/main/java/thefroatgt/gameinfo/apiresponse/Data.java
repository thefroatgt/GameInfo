package thefroatgt.gameinfo.apiresponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;



@XmlRootElement(name="Data")
public class Data {
	public String baseImgUrl;
	
	@XmlElement(name="Game")
	public List<Game> Games = new ArrayList<Game>();

}
