package thefroatgt.gameinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<GameInfo> games = getGames();
		
		for(GameInfo g: games)
		{
			g.Populate();
		}
		
		
		System.out.println(GameInfo.headers());
		for(GameInfo g : games)
		{
			System.out.println(g);
			
		}
	}

	private static List<GameInfo> getGames() {
		List<GameInfo> games = new ArrayList<GameInfo>();

		games.add(new GameInfo("007 Legends"));
		games.add(new GameInfo("007: Quantum of Solace"));
		games.add(new GameInfo("10 Minute Solution"));
		games.add(new GameInfo("Lalaloopsy"));
		games.add(new GameInfo("Cabela's Adventure Camp"));
		games.add(new GameInfo("Cabela's African Safari"));
		games.add(new GameInfo("Cabela's Alaskan Adventure"));
		games.add(new GameInfo("Cabela's Big Game Hunter (2008)"));
		games.add(new GameInfo("Cabela's Big Game Hunter 2010"));
		games.add(new GameInfo("Cabela's Big Game Hunter 2012"));
		games.add(new GameInfo("Barbie and The Three Musketeers"));
		games.add(new GameInfo("Cabela's Big Game Hunter: Hunting Party"));
		games.add(new GameInfo("Cabela's Big Game Hunter: Pro Hunts"));
		games.add(new GameInfo("NPPL Championship Paintball 2009"));
		games.add(new GameInfo("Cabela's Dangerous Hunts 2009"));
		games.add(new GameInfo("Family Guy: Back to the Multiverse"));
		games.add(new GameInfo("Cabela's Dangerous Hunts 2011"));
		games.add(new GameInfo("Cabela's Dangerous Hunts: Ultimate Challenge"));
		games.add(new GameInfo("Cabela's Legendary Adventures"));
		games.add(new GameInfo("Activision Hits: Remixed"));
		games.add(new GameInfo("Cabela's Monster Buck Hunter"));
		games.add(new GameInfo("Cabela's North American Adventures"));
		games.add(new GameInfo("Cabela's Survival: Shadows of Katmai"));
		games.add(new GameInfo("Cabela's Trophy Bucks"));
		games.add(new GameInfo("Call of Duty 2"));
		games.add(new GameInfo("Call of Duty 3"));
		games.add(new GameInfo("Call of Duty 4: Modern Warfare"));
		games.add(new GameInfo("Call of Duty Black Ops: Declassified"));
		games.add(new GameInfo("Call of Duty: Black Ops"));
		games.add(new GameInfo("Call of Duty: Black Ops II"));
		games.add(new GameInfo("Little League World Series Baseball 2008"));
		games.add(new GameInfo("Call of Duty: Ghosts"));
		games.add(new GameInfo("Bakugan Battle Brawlers: Defenders of the Core"));
		games.add(new GameInfo("Little League World Series Baseball 2009"));
		games.add(new GameInfo("Little League World Series Baseball 2010"));
		games.add(new GameInfo("Nascar Unleashed"));
		games.add(new GameInfo("Little League World Series Baseball: Double Play"));
		games.add(new GameInfo("Bakugan: Battle Brawlers"));
		games.add(new GameInfo("Call of Duty: Modern Warfare 2"));
		games.add(new GameInfo("Call of Duty: Modern Warfare 3"));
		games.add(new GameInfo("Bakugan: Battle Trainer"));
		games.add(new GameInfo("Bakugan: Rise of the Resistance"));
		games.add(new GameInfo("Call of Duty: Modern Warfare 3: Defiance"));
		games.add(new GameInfo("Call of Duty: Modern Warfare: Mobilized"));
		games.add(new GameInfo("Call of Duty: Modern Warfare: Reflex Edition"));
		games.add(new GameInfo("Call of Duty: Roads to Victory"));
		games.add(new GameInfo("Call of Duty: The War Collection"));
		games.add(new GameInfo("Band Hero"));
		games.add(new GameInfo("Call of Duty: World at War"));
		games.add(new GameInfo("Barbie Fashion Show: An Eye for Style"));
		games.add(new GameInfo("Barbie Horse Adventures: Riding Camp"));
		games.add(new GameInfo("Barbie as The Island Princess"));
		games.add(new GameInfo("Barbie in The 12 Dancing Princesses"));
		games.add(new GameInfo("Angry Birds Star Wars"));
		games.add(new GameInfo("Dancing with the Stars: We Dance!"));
		games.add(new GameInfo("Angry Birds Trilogy"));
		games.add(new GameInfo("Animal Planet: Emergency Vets"));
		games.add(new GameInfo("Animal Planet: Vet Collection"));
		games.add(new GameInfo("Animal Planet: Vet Life"));
		games.add(new GameInfo("Apache: Air Assault"));
		games.add(new GameInfo("Arcade Zone"));
		games.add(new GameInfo("Bee Movie Game"));
		games.add(new GameInfo("Dreamworks Madagascar Kartz"));
		games.add(new GameInfo("DreamWorks Super Star Kartz"));
		games.add(new GameInfo("Mountain Sports"));
		games.add(new GameInfo("MTX Mototrax"));
		games.add(new GameInfo("Big League Sports"));
		games.add(new GameInfo("Big League Sports: Summer"));
		games.add(new GameInfo("Over the Hedge"));
		games.add(new GameInfo("Over the Hedge: Hammy Goes Nuts!"));
		games.add(new GameInfo("NASCAR 2011: The Game"));
		games.add(new GameInfo("NASCAR The Game: Inside Line"));
		games.add(new GameInfo("Monkey Mischief! Party Time"));
		games.add(new GameInfo("Block Party"));
		games.add(new GameInfo("Blood Drive"));
		games.add(new GameInfo("Guitar Hero: On Tour"));
		games.add(new GameInfo("Blur"));
		games.add(new GameInfo("Percy Jackson and the Olympians: The Lightning Thief"));
		games.add(new GameInfo("History Channel: Battle for the Pacific"));
		games.add(new GameInfo("Monster Jam"));
		games.add(new GameInfo("Monster Jam: Path of Destruction"));
		games.add(new GameInfo("Monster Jam: Urban Assault"));
		games.add(new GameInfo("Monsters vs. Aliens"));
		games.add(new GameInfo("Moshi Monsters: Katsuma Unleashed"));
		games.add(new GameInfo("Moshi Monsters: Moshling Zoo"));
		games.add(new GameInfo("Moshi Monsters: Moshlings Theme Park"));
		games.add(new GameInfo("Enemy Territory: Quake Wars"));
		games.add(new GameInfo("X-Men Legends II: Rise of Apocalypse"));
		games.add(new GameInfo("X-Men Origins: Wolverine"));
		games.add(new GameInfo("X-Men Origins: Wolverine - Uncaged Edition"));
		games.add(new GameInfo("TransFormers Animated: The Game"));
		games.add(new GameInfo("X-Men: Destiny"));
		games.add(new GameInfo("Transformers Prime"));
		games.add(new GameInfo("X-Men: The Official Game"));
		games.add(new GameInfo("Transformers: Cybertron Adventures"));
		games.add(new GameInfo("Transformers: Dark of the Moon"));
		games.add(new GameInfo("Transformers: Dark of the Moon - Autobots/Decepticons"));
		games.add(new GameInfo("Transformers: Fall of Cybertron"));
		games.add(new GameInfo("Transformers: Revenge of the Fallen"));
		games.add(new GameInfo("Transformers: The Game"));
		games.add(new GameInfo("Dancing With The Stars"));
		games.add(new GameInfo("Transformers: War for Cybertron"));
		games.add(new GameInfo("Dreamworks 2-in-1 Party Pack"));
		games.add(new GameInfo("The History Channel: Battle for the Pacific"));
		games.add(new GameInfo("The History Channel: Civil War - Secret Missions"));
		games.add(new GameInfo("The Hustle: Detroit Streets"));
		games.add(new GameInfo("Pimp My Ride"));
		games.add(new GameInfo("Pimp My Ride: Street Racing"));
		games.add(new GameInfo("ZhuZhu Babies"));
		games.add(new GameInfo("ZhuZhu Pets"));
		games.add(new GameInfo("ZhuZhu Pets: Quest for Zhu"));
		games.add(new GameInfo("ZhuZhu Puppies"));
		games.add(new GameInfo("Zoobles! Spring to Life!"));
		games.add(new GameInfo("Pirates: Hunt For Blackbeard's Booty"));
		games.add(new GameInfo("[Prototype]"));
		games.add(new GameInfo("Pitfall: The Big Adventure"));
		games.add(new GameInfo("Deadpool"));
		games.add(new GameInfo("iCarly"));
		games.add(new GameInfo("Ultimate Spider-Man"));
		games.add(new GameInfo("iCarly 2: iJoin The Click!"));
		games.add(new GameInfo("Quake 4"));
		games.add(new GameInfo("The Quest Trio"));
		games.add(new GameInfo("Rapala Fishing Frenzy 2009"));
		games.add(new GameInfo("Rapala Pro Bass Fishing 2010"));
		games.add(new GameInfo("Rapala Tournament Fishing!"));
		games.add(new GameInfo("Rapala Trophies"));
		games.add(new GameInfo("Rapala's Fishing Frenzy"));
		games.add(new GameInfo("Rapala: We Fish"));
		games.add(new GameInfo("Secret Service"));
		games.add(new GameInfo("Diablo III"));
		games.add(new GameInfo("Generator Rex: Agent of Providence"));
		games.add(new GameInfo("Madagascar"));
		games.add(new GameInfo("Madagascar: Escape 2 Africa"));
		games.add(new GameInfo("Shrek Smash n' Crash Racing"));
		games.add(new GameInfo("Shrek SuperSlam"));
		games.add(new GameInfo("Shrek the Third"));
		games.add(new GameInfo("Shrek's Carnival Craze Party Games"));
		games.add(new GameInfo("GoldenEye 007"));
		games.add(new GameInfo("Shrek: Forever After"));
		games.add(new GameInfo("Wappy Dog"));
		games.add(new GameInfo("Goldeneye 007: Reloaded"));
		games.add(new GameInfo("Prototype 2"));
		games.add(new GameInfo("Magical ZhuZhu Princess: Carriages & Castles"));
		games.add(new GameInfo("Mah Jong Quest: Expeditions"));
		games.add(new GameInfo("Puppy Luv: Spa and Resort"));
		games.add(new GameInfo("Singularity"));
		games.add(new GameInfo("Whac-A-Mole"));
		games.add(new GameInfo("Greg Hastings' Tournament Paintball Max'd"));
		games.add(new GameInfo("Skylanders Giants"));
		games.add(new GameInfo("Skylanders SWAP Force"));
		games.add(new GameInfo("Skylanders Swap Force"));
		games.add(new GameInfo("Skylanders: Spyro's Adventure"));
		games.add(new GameInfo("Guitar Hero 5"));
		games.add(new GameInfo("Chaotic: Shadow Warriors"));
		games.add(new GameInfo("Guitar Hero: World Tour"));
		games.add(new GameInfo("Guitar Hero On Tour: Modern Hits"));
		games.add(new GameInfo("Guitar Hero: Aerosmith"));
		games.add(new GameInfo("Gun"));
		games.add(new GameInfo("Guitar Hero: Metallica"));
		games.add(new GameInfo("Gun Showdown"));
		games.add(new GameInfo("Guitar Hero: On Tour Decades"));
		games.add(new GameInfo("Guitar Hero: Smash Hits"));
		games.add(new GameInfo("Guitar Hero: Van Halen"));
		games.add(new GameInfo("Guitar Hero: Warriors of Rock"));
		games.add(new GameInfo("WipeOut 3 The Game"));
		games.add(new GameInfo("Wipeout 2"));
		games.add(new GameInfo("Soldier of Fortune: Payback"));
		games.add(new GameInfo("Wipeout: In The Zone"));
		games.add(new GameInfo("Wipeout: The Game"));
		games.add(new GameInfo("Wolfenstein"));
		games.add(new GameInfo("Spider-Man 3"));
		games.add(new GameInfo("The Walking Dead: Survival Instinct"));
		games.add(new GameInfo("Marvel: Ultimate Alliance"));
		games.add(new GameInfo("World Series of Poker"));
		games.add(new GameInfo("World Series of Poker 2008: Battle for the Bracelets"));
		games.add(new GameInfo("Marvel: Ultimate Alliance 2"));
		games.add(new GameInfo("World of Warcraft: Cataclysm"));
		games.add(new GameInfo("World of Warcraft: Mists of Pandaria"));
		games.add(new GameInfo("Jurassic: The Hunted"));
		games.add(new GameInfo("Space Camp"));
		games.add(new GameInfo("Spanish for Everyone!"));
		games.add(new GameInfo("How to Train Your Dragon"));
		games.add(new GameInfo("Spider-Man 2"));
		games.add(new GameInfo("Crash: Mind Over Mutant"));
		games.add(new GameInfo("Ice Age: Dawn of the Dinosaurs"));
		games.add(new GameInfo("Spider-Man: Battle for New York"));
		games.add(new GameInfo("Spider-Man: Edge of Time"));
		games.add(new GameInfo("Spider-Man: Friend or Foe"));
		games.add(new GameInfo("Spider-Man: Shattered Dimensions"));
		games.add(new GameInfo("Spider-Man: Web of Shadows"));
		games.add(new GameInfo("Spider-Man: Web of Shadows - Amazing Allies Edition"));
		games.add(new GameInfo("Hidden Mysteries: Titanic - Secrets of the Fateful Voyage"));
		games.add(new GameInfo("SpongeBob SquarePants: Plankton's Robotic Revenge"));
		games.add(new GameInfo("Cut the Rope: Triple Treat"));
		games.add(new GameInfo("History Channel: Civil War - A Nation Divided"));
		games.add(new GameInfo("History Civil War: Secret Missions"));
		games.add(new GameInfo("DJ Hero"));
		games.add(new GameInfo("DJ Hero 2"));
		games.add(new GameInfo("Transformers: Revenge of the Fallen - Autobots"));
		games.add(new GameInfo("Transformers: War for Cybertron - Autobots"));
		games.add(new GameInfo("Transformers: War for Cybertron - Decepticons"));
		games.add(new GameInfo("Squinkies"));
		games.add(new GameInfo("Squinkies 2: Adventure Mall Surprize!"));

		return games;
	}
}
