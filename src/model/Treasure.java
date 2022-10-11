package model;

public class Treasure{

	private String name;
	private int level;
	private int scoreWin;
	private String url;
	private int  numberTreasureLevel;
	private int position; 

	public Treasure(String  aname, String aurl,  int ascoreWin, int alevel,int anumberTreasureLevel){
		name = aname;
		url = aurl;
		level = alevel;
		scoreWin = ascoreWin;
		numberTreasureLevel = anumberTreasureLevel;

	} 

	public String getName(){
		return name; 
	}

	public String getUrl(){
		return url; 
	}

	public int getLevel(){
		return level; 
	}

	public int getScoreWin(){
		return scoreWin; 
	}

	public int getNumberTreasureLevel(){
		return numberTreasureLevel; 
	}
}