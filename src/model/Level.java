package model;

import model.Enemy;
import model.Treasure;


public class Level{

	public static int TOTAL_ENEMYS = 5;
	public static int TOTAL_TREASURE = 10;

	private int id;
	private int nextScore;
	private String typeDificulty;

	private Treasure[] treasures;
	private Enemy[] enemys; 
	private Enemy enemy;
	private Treasure treasure; 

	public Level(int aid, int anextScore){

		id = aid;
		nextScore = anextScore;

		treasures = new Treasure[TOTAL_TREASURE];
		enemys = new Enemy[TOTAL_ENEMYS];

	}

	public Treasure[] getTreasures(){
		return treasures; 
	}

	public Enemy[] getEnemys(){
		return enemys;
	}

	public Enemy getEnemy(){
		return enemy; 
	}
	public Treasure getTreasure(){
		return treasure; 
	}

	public int getId(){
		return id; 
	}

	public int getNextScore(){
		return nextScore; 
	}

	public String getTypeDificulty(){
		return typeDificulty; 
	}
	
	public String addEnemyWithObject(Enemy enemy){

		String msj = "Maximum capacity reached in this level."; 
		boolean isEmpty = false; 
		for(int i = 0; i <TOTAL_ENEMYS && !isEmpty; i++){
			if(enemys[i] == null){
				// I add the enemy to the first available array space 
				enemys[i] = enemy; 
				isEmpty = true; 
				msj = "New enemy added a to level"; 
			}
		}

		return msj; 
	}

	public String addTreasureWithObject(Treasure treasure, int amount){

		int avaliable = avaliableTreasureLevel();
		String msj = ""; 
		if (avaliable >= amount){
				msj = "Maximum capacity reached."; 
			boolean isEmpty = false; 
			for(int j=0; j<amount; j++){
				for(int i = 0; i <TOTAL_TREASURE && !isEmpty; i++){
					if(treasures[i] == null){
						// I add the treasure to the first available array space 
						treasures[i] = treasure; 
						isEmpty = true; 
						msj = "New treasure added a to level"; 
					}
				}	
			}	
		} else{
				msj = "there is no space available"; 
			}
			
			return msj; 
	}

	public int avaliableTreasureLevel(){
        int amount= 0;
  
		for(int i=0;i<TOTAL_TREASURE;i++){
		    if(treasures[i]==null){
		        amount++;
		    }
		  }
		  return amount; 
		 }

	public String enemysLevel(){
		String msj = "";  
		System.out.println("there are the enemys for this level.. ");
		for(int i= 0; i< TOTAL_ENEMYS; i++){

			if(enemys[i] != null){
				msj += " " + enemys[i].getType() + ", ";	
			} 
		}

		return msj;
	}
	public String treasuresLevel(){
		String msj = ""; 
		System.out.println("there are the treasures for this level...");
		for(int j = 0; j< TOTAL_TREASURE; j++){
			if(treasures[j] != null){
				msj += " " + treasures[j].getName() + ", ";	
			} 
			
		}

		return msj; 
	}


	}