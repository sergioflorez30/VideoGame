package model;

public class Enemy{

	private String name;
	private String type;
	private int scoreLost;
	private int scoreWin;
	private int level;
	private int position;


	public Enemy(String aname, String atype, int ascoreLost, int ascoreWin, int alevel){
	 	name = aname;
	 	type = atype;
	 	scoreLost = scoreLost;
	 	scoreWin = ascoreWin;
	 	level = alevel;
	}

	public String getName(){
			return name; 
		}

	public String getType(){
		return type; 
	}

	public int getScoreLost(){
		return scoreLost; 
	}

	public int getScoreWin(){
		return scoreWin; 
	}

	public int getLevel(){
		return level; 
	}
}