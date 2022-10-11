package model;

import model.Level;

public class Player{

	public static final int SIZE = 20;

		private String nickname;
		private String name;
		private int score = 10;
		private int numberLife = 5 ;
		private Level level;
		private String resolution;

	public Player(String anickname, String aname, Level levelPlayer){
		
		nickname = anickname;
		name = aname; 
		level = levelPlayer; 

	}

	public String getName(){
		return name; 
	}

	public String getNickname(){
		return nickname; 
	}

	// score empieza en 10
	public int getScore(){
		return score; 
	}
	public void setScore(int aScore){
		score = aScore; 
	}

	// numberLife empieza en 5
	public int getNumberLife(){
		return numberLife; 
	}

	public Level getLevel(){
			return level; 
	}
	public void setLevel(Level alevel){
		level = alevel; 
	}

	public String getResolution(){
		return resolution; 
	}

	
}