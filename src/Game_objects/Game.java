package Game_objects;

import java.util.ArrayList;

import File_format.Board2Game;
import Maps.Map;
import Maps.Pixel;

/**
 * @author Daniel Abergel
 * @author Netanel Ben-Isahar
 * this class represent a game and hold all of the relevant objects for it.
 */
public  class Game 
{
	ArrayList<Ghost> Ghosts ; 
	ArrayList<GeoBox> GeoBoxs ; 
	ArrayList<Packman> Packmans ; 
	ArrayList<Fruit> Fruits ;
	Player player; 
	Map GameMap  ; 
	Board2Game B2G ;

	/**
	 * this constructor build the game and initializing the relevnt objects.
	 */
	public Game() 
	{
		GameMap = new Map();
		Ghosts = new ArrayList<Ghost>();
		Packmans = new ArrayList<Packman>();
		GeoBoxs = new ArrayList<GeoBox>();
		Fruits = new ArrayList<Fruit>();
		player = new Player(new Pixel(0,0),GameMap);
		B2G = new Board2Game();
	}
	public synchronized ArrayList<Fruit> getFruits() {
		return Fruits;
	}
	public synchronized  Player getPlayer() {
		return player;
	}
	public synchronized Map getGameMap() {
		return GameMap;
	}
	public synchronized ArrayList<GeoBox> getGeoBoxs() {
		return GeoBoxs;
	}
	public synchronized ArrayList<Packman> getPackmans() {
		return Packmans;
	}
	public synchronized ArrayList<Ghost> getGhosts() {
		return Ghosts;
	}
	
	 public synchronized void setGame(ArrayList<String> Data)
	{
		B2G.SetGame(this, Data,getGameMap());
	}
	 /**
	  * this function clear all of the data from the game objects.
	  */
	public  synchronized void clear()
	{
		GeoBoxs.clear();
		Packmans.clear();
		Ghosts.clear();
		Fruits.clear();
	}
	public synchronized void setPlayer(Player player) {
		this.player = player;
	}
	public synchronized void addFruit(Fruit F) {
		// TODO Auto-generated method stub
		this.Fruits.add(F);
	}
	public synchronized  void addPackman(Packman P) {
		// TODO Auto-generated method stub
		this.Packmans.add(P);
	}
	public synchronized void addGhost(Ghost G) {
		// TODO Auto-generated method stub
		this.Ghosts.add(G);
	}
	public synchronized void addGeoBox(GeoBox B) {
		// TODO Auto-generated method stub
		this.GeoBoxs.add(B);
	}
	/**
	 * this function build all of the game data into a string.
	 * @return the data on a StringBuilder.
	 */
	public synchronized StringBuilder getGame(){
		StringBuilder SB = new StringBuilder();
//		SB.append(getPlayer().toString() + "\n");
		for (int i = 0; i < Packmans.size(); i++) 
		{
			SB.append(Packmans.get(i).toString() + "\n");
		}
		for (int i = 0; i < Ghosts.size(); i++) 
		{
			SB.append(Ghosts.get(i).toString() + "\n");
		}
		for (int i = 0; i < Fruits.size(); i++) 
		{
			SB.append(Fruits.get(i).toString() + "\n");
		}
		
		for (int i = 0; i < GeoBoxs.size(); i++) 
		{
			SB.append(GeoBoxs.get(i).toString() + "\n");
		}
		return SB ; 
	}
	
	public String toString() {
		StringBuilder SB = new StringBuilder();
		SB.append(getPlayer().toString() + "\n");
		for (int i = 0; i < Fruits.size(); i++) 
		{
			SB.append(Fruits.get(i).toString() + "\n");
		}
		for (int i = 0; i < Ghosts.size(); i++) 
		{
			SB.append(Ghosts.get(i).toString() + "\n");
		}
		for (int i = 0; i < Packmans.size(); i++) 
		{
			SB.append(Packmans.get(i).toString() + "\n");
		}
		for (int i = 0; i < GeoBoxs.size(); i++) 
		{
			SB.append(GeoBoxs.get(i).toString() + "\n");
		}
		return SB.toString();
	}
}
