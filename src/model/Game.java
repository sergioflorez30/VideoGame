
package model; 

import model.Enemy;
import model.Treasure;
import model.Level;
import model.Player;

public class Game{

	    public static final int TOTAL_PLAYERS = 20;
		public static final int ALL_LEVELS = 10;
		public static final int TOTAL_TREASURES = 100;
		public static final int TOTAL_ENEMYS = 50;

		private Player[] totalPlayers;
		private Level[] levels;
		private Treasure[] treasures;
		private Enemy[] enemys;

		private Player player;
		private Treasure treasure;
		private Enemy enemy;
		private Level level;

	public Game(){

		levels = new Level[ALL_LEVELS];
		levels[0]= new Level(1, 100);
		levels[1]= new Level(2, 200);
		levels[2]= new Level(3, 300);
		levels[3]= new Level(4, 400);
		levels[4]= new Level(5, 500);
		levels[5]= new Level(6, 600);
		levels[6]= new Level(7, 700);
		levels[7]= new Level(8, 800);
		levels[8]= new Level(9, 900);
		levels[9]= new Level(10, 1000);

		totalPlayers = new Player[TOTAL_PLAYERS];
		treasures = new Treasure[TOTAL_TREASURES];

		treasures[0] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[1] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[2] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[3] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[4] = new Treasure("diamond", "xd", 20, 1,1); 
		treasures[5] = new Treasure("rock", "sss", 7, 2, 1); 
		treasures[6] = new Treasure("rock", "sss", 7, 2, 1); 
		treasures[7] = new Treasure("diamond", "xd", 20, 2,1); 
		treasures[8] = new Treasure("diamond", "xd", 20, 2,1); 
		treasures[9] = new Treasure("map", "aaa", 15, 2, 1); 
		treasures[10] = new Treasure("map", "aaa", 15, 3, 1); 
		treasures[11] = new Treasure("map", "aaa", 15, 3, 1); 
		treasures[12] = new Treasure("diamond", "xd", 20, 3,1); 
		treasures[13] = new Treasure("rock", "sss", 7, 3, 1); 
		treasures[14] = new Treasure("blade", "qqq", 18, 3,1); 
		treasures[15] = new Treasure("blade", "qqq", 18, 4,1); 
		treasures[16] = new Treasure("blade", "qqq", 18, 4,1); 
		treasures[17] = new Treasure("blade", "qqq", 18, 4,1); 
		treasures[18] = new Treasure("rock", "sss", 7, 4, 1); 
		treasures[19] = new Treasure("golden", "ggg", 22, 4,1); 
		treasures[20] = new Treasure("golden", "ggg", 22, 5,1); 
		treasures[21] = new Treasure("golden", "ggg", 22, 5,1); 
		treasures[22] = new Treasure("diamond", "xd", 20, 5,1); 
		treasures[23] = new Treasure("diamond", "xd", 20, 5,1); 
		treasures[24] = new Treasure("map", "aaa", 15, 5, 1); 
		treasures[25] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[26] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[27] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[28] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[29] = new Treasure("rock", "sss", 7, 6, 1); 
		treasures[30] = new Treasure("golden", "ggg", 22, 7,1); 
		treasures[31] = new Treasure("golden", "ggg", 22, 7,1); 
		treasures[32] = new Treasure("golden", "ggg", 22, 7,1); 
		treasures[33] = new Treasure("map", "aaa", 15, 7, 1); 
		treasures[34] = new Treasure("map", "aaa", 15, 7, 1); 
		treasures[35] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[36] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[37] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[38] = new Treasure("blade", "qqq", 18, 8,1); 
		treasures[39] = new Treasure("rock", "sss", 7, 8, 1); 
		treasures[40] = new Treasure("diamond", "xd", 20, 9,1); 
		treasures[41] = new Treasure("diamond", "xd", 20, 9,1); 
		treasures[42] = new Treasure("diamond", "xd", 20, 9,1); 
		treasures[43] = new Treasure("blade", "qqq", 18, 9,1); 
		treasures[44] = new Treasure("map", "aaa", 15, 9, 1); 
		treasures[45] = new Treasure("map", "aaa", 15, 10, 1); 
		treasures[46] = new Treasure("blade", "qqq", 18, 10,1); 
		treasures[47] = new Treasure("diamond", "xd", 20, 10,1); 
		treasures[48] = new Treasure("rock", "sss", 7, 10, 1); 
		treasures[49] = new Treasure("golden", "ggg", 22, 10,1); 


		enemys = new Enemy[TOTAL_ENEMYS];

		enemys[0] = new Enemy("dark","magico", 10, 7, 6);
		enemys[1] = new Enemy("will","jefe", 15, 20,10);
		enemys[2] = new Enemy("sys","ogro", 1, 10, 1);
		enemys[3] = new Enemy("sophi","abstracto", 10, 15, 3);
		enemys[4] = new Enemy("xoxo","jefe", 12, 25, 5);
		enemys[5] = new Enemy("xis","ogro", 3, 15, 2);
		enemys[6] = new Enemy("ques","magico", 0, 23, 1);
		enemys[7] = new Enemy("wes","abstracto", 30, 40, 10);
		enemys[8] = new Enemy("xd","magico", 3, 10, 4);
		enemys[9] = new Enemy("uwu","jefe", 7, 11, 5);
		enemys[10] = new Enemy("unu","ogro", 2, 6, 6);
		enemys[11] = new Enemy("white","abstracto", 10, 20, 7);
		enemys[12] = new Enemy("blue","ogro", 8, 10, 2);
		enemys[13] = new Enemy("key","magico", 4, 12, 3);
		enemys[14] = new Enemy("wak","jefe", 10, 20, 4);
		enemys[15] = new Enemy("oro","abstracto", 3, 10, 7);
		enemys[16] = new Enemy("plata","ogro", 10, 12, 8);
		enemys[17] = new Enemy("bronce","magico", 12, 15, 8);
		enemys[18] = new Enemy("derma","jefe",10, 30, 9);
		enemys[19] = new Enemy("cut","abstracto", 3, 40, 9);
		enemys[20] = new Enemy("hongo","ogro", 3, 10, 1);
		enemys[21] = new Enemy("flower","magico", 1, 15, 2);
		enemys[22] = new Enemy("zac","jefe", 15, 25, 3);
		enemys[23] = new Enemy("efron","abstracto", 13, 25, 4);
		enemys[24] = new Enemy("xxd","ogro", 14, 20, 5);


	}

	public Player getPlayer(){
		return player; 
	}

	public Treasure getTreasure(){
		return treasure; 
	}

	public Level getLevel(){
		return level; 
	}

	public Enemy getEnemy(){
		return enemy; 
	}

	public Player[] getTotalPlayers(){
		return totalPlayers; 
	}

	public Level[] getLevels(){
		return levels; 
	}

	public Treasure[] getTreasures(){
		return treasures; 
	}

	public Enemy[] getEnemys(){
		return enemys; 
	}

	public String registerPlayer(String nickname, String name){
		String msj = ""; 
		

		int comparateNickname = searchSameNickname(nickname);
		if( comparateNickname != -1){
			msj = "oh no! ... this nickname already exists :(";

		} else{

			Player newPlayer = new Player(nickname, name, levels[0]);
			msj = "Maximum capacity reached of players."; 
			boolean isEmpty = false; 
			for(int i = 0; i <TOTAL_PLAYERS && !isEmpty; i++){
				if(totalPlayers[i] == null){
					// I add the player to the first available array space 
					totalPlayers[i] = newPlayer; 
					isEmpty = true; 
					msj = "New player created"; 
				}
			}
		}
			
		
		return msj; 
		

	}

	public int searchSameNickname(String nickname){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < TOTAL_PLAYERS && !isFound; i++ ){
			if(totalPlayers[i] != null && totalPlayers[i].getNickname().equalsIgnoreCase(nickname)){
				pos = i; 
				isFound = true; 
			} 
		}
		return pos; 
	}

	public String addEnemyToLevel(String nameEnemy, String typeEnemy, int scoreLostEnemy, int scoreWinEnemy, int levelEnemy){
		String msj = "Could not add a enemy"; 
		Enemy newEnemy = new Enemy(nameEnemy, typeEnemy, scoreLostEnemy, scoreWinEnemy,levelEnemy); 
		int posLevel = searchLevelById(levelEnemy); 
		if(posLevel != -1 ){
			msj = levels[posLevel].addEnemyWithObject(newEnemy); 
		}
		return msj; 
	}

	public int searchLevelById(int level){
		int pos = -1; 
		boolean isFound = false; 
		for(int i = 0; i < ALL_LEVELS && !isFound; i++ ){
			if(levels[i].getId() == level){
				pos = i; 
				isFound = true; 
			}
		}
		return pos; 
	}

	public String addEnemyGame(String nameEnemy, String typeEnemy, int scoreLostEnemy, int scoreWinEnemy, int levelEnemy){
		String msj = "Could not add a enemy"; 
		boolean isEmpty = false; 
		Enemy newEnemy = new Enemy(nameEnemy, typeEnemy, scoreLostEnemy, scoreWinEnemy,levelEnemy);
		for(int i = 0; i <TOTAL_ENEMYS && !isEmpty; i++){
			if(enemys[i] == null){
				// I add the enemy to the first available array space 
				enemys[i] = newEnemy; 
				isEmpty = true; 
				msj = "New enemy added"; 
			}
		}

		return msj; 
	}

	public String addTreasureToLevel(String  nameTreasure, String url,  int scoreWinTreasure, int levelTreasure,int numberTreasureLevel){
		String msj = "Could not add a treasure";  
		int posLevel = searchLevelById(levelTreasure);
		int amount = levels[posLevel].avaliableTreasureLevel();
		if(amount < numberTreasureLevel){
			msj = "you cannot add this amount of treasure to this level, for  this level you can  add this amount..." + amount;
	
		} else if(amount >= numberTreasureLevel){
			Treasure newTreasure = new Treasure(nameTreasure, url, scoreWinTreasure, levelTreasure, numberTreasureLevel); 
				if(posLevel != -1 ){
				msj = levels[posLevel].addTreasureWithObject(newTreasure, numberTreasureLevel); 
			}
		
		}
		return msj; 
	}

	public String addTreasureGame(String  nameTreasure, String url,  int scoreWinTreasure, int levelTreasure,int numberTreasureLevel){
		String msj = "Could not add a treasure"; 
		int amount = avaliableTreasure();
		if(amount<numberTreasureLevel){
			msj = "you cannot add this amount of treasure to this game";
	
		}else if(amount>=numberTreasureLevel){
			boolean isEmpty = false; 
			Treasure newTreasure = new Treasure(nameTreasure, url, scoreWinTreasure, levelTreasure, numberTreasureLevel);
			for(int i = 0; i <TOTAL_TREASURES && !isEmpty; i++){
				if(treasures[i] == null){
					// I add the enemy to the first available array space 
					treasures[i] = newTreasure; 
					isEmpty = true; 
					msj = "New treasure added"; 
				}
			}	
		}
		

		return msj; 
	}

	public int avaliableTreasure(){
        int amount= 0;
  
		for(int i=0;i<TOTAL_TREASURES;i++){
		    if(treasures[i]==null){
		        amount++;
		    }
		  }
		  return amount; 
		 }

	public void initialityTreasures(){

		for( int i = 0; i < 50; i++){
			int posLevel = treasures[i].getLevel()-1;  	
			levels[posLevel].addTreasureWithObject(treasures[i], treasures[i].getNumberTreasureLevel()); 
				
		}
		
	}

	public void initialityEnemys(){

		for( int i = 0; i < 25; i++){
			int posLevel = enemys[i].getLevel()-1;  	
			levels[posLevel].addEnemyWithObject(enemys[i]); 
				
		}
		
	}

	public String changeScorePlayer(String nickname, int newScorePlayer){
		 String msj = ""; 

		int forchange = searchSameNickname(nickname);

		if(forchange != -1){
			totalPlayers[forchange].setScore(newScorePlayer);
			msj = "score changed with success... : D"; 

		}else{
			msj = "You cannot modify the score, because this player not exits ... :( ";
		}
		return msj; 
	}

	public Player findPlayer(String nickname){

		Player theFirst = null;

		for(int i=0; i<TOTAL_PLAYERS && theFirst==null; i++){

			if(totalPlayers[i]!=null && totalPlayers[i].getNickname().equalsIgnoreCase(nickname)){

				theFirst = totalPlayers[i];

			}

		}

		return theFirst;

	}

	public String changeLevelPlayer(String nickname){
		 String msj = "the level was changed successfully... UwU "; 
		Player playerChange = findPlayer(nickname);
		if(playerChange == null){
			msj = "no exists this players :("; 
		} else{
			int scorePlayer = playerChange.getScore(); 
			Level levelPlayer = playerChange.getLevel(); 

			if(scorePlayer < levelPlayer.getNextScore()){
				if(scorePlayer == 999){
					msj = "you’re at the maximum level  :o"; 
				}else{
					int amount = levelPlayer.getNextScore() - scorePlayer;
					msj = "you need this points for the next level..." + amount; 
				}
			}else{ 
				for(int i = 0; i< ALL_LEVELS; i++){
					if(levelPlayer.getId() == levels[i].getId()){
						for(int j= i; j < ALL_LEVELS; j++){
							if(j == 9){
								if(scorePlayer >= 800 && scorePlayer <1000){
									playerChange.setLevel(levels[j]);
								}
							}
							if((scorePlayer==levels[j].getNextScore())|| (scorePlayer > levels[j].getNextScore() && scorePlayer < levels[j+1].getNextScore())){
								playerChange.setLevel(levels[j+1]);
							}

						}
					}
				}

			}

			
		}


		return msj;
	}

	public String enemysForLevel(int level){
		int posLevel = searchLevelById(level);
		String msj = "there was a problem...  :(";

		msj = levels[posLevel].enemysLevel();

		return msj;
	}

	public String treasuresForLevel(int level){
		int posLevel = searchLevelById(level);
		String msj = "there was a problem...  :(";

		msj= levels[posLevel].treasuresLevel();

		return msj;
	}

	public String topPlayer(){
		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		int top4 = 0;
		int top5 = 0;
		String name1 = " ";
		String name2 = " ";
		String name3 = " ";
		String name4 = " ";
		String name5 = " ";
		String msj = ""; 

		for(int i = 0; i<TOTAL_PLAYERS; i++){

			if(totalPlayers[i] != null && totalPlayers[i].getScore() > top1){
				
				top5 = top4;
				top4= top3;
				top3= top2;
				top2 = top1;
				top1 = totalPlayers[i].getScore();
				name5 = name4;
				name4 = name3;
				name3 = name2;
				name2= name1; 
				name1 = totalPlayers[i].getNickname(); 
				
			} else if(totalPlayers[i] != null && totalPlayers[i].getScore() > top2){
				
				top5 = top4;
				top4= top3;
				top3= top2;
				top2 = totalPlayers[i].getScore(); 
				name5 = name4;
				name4 = name3;
				name3 = name2;
				name2= totalPlayers[i].getNickname();

			}else if( totalPlayers[i] != null && totalPlayers[i].getScore() > top3){

				top5 = top4;
				top4= top3;
				top3= totalPlayers[i].getScore(); 
				name5 = name4;
				name4 = name3;
				name3 = totalPlayers[i].getNickname();

			} else if(totalPlayers[i] != null && totalPlayers[i].getScore() > top4){

				top5 = top4;
				top4= totalPlayers[i].getScore(); 
				name5 = name4;
				name4 = totalPlayers[i].getNickname();

			}else if(totalPlayers[i] != null && totalPlayers[i].getScore() > top5){

				top5 = totalPlayers[i].getScore();
				name5 = totalPlayers[i].getNickname(); 
		
			}

			msj = "top 5 player... \n" +
					"1."+ name1 + ": " + top1 + "\n"+
					"2."+ name2 + ": " + top2 + "\n"+
					"3."+ name3 + ": " + top3 + "\n"+
					"4."+ name4 + ": " + top4 + "\n"+
					"5."+ name5 + ": " + top5 + "\n"; 

		}

		return msj; 
	}

	public String enemyMoreScore(){

		int score= 0;
		int level =0; 
		String type = ""; 
		String msj = ""; 
		String name = ""; 

		for (int i =0; i< TOTAL_ENEMYS; i++){
			if(enemys[i] != null && enemys[i].getScoreWin() > score){
				
				score = enemys[i].getScoreWin();
				level = enemys[i].getLevel(); 
				type = enemys[i].getType();
				name= enemys[i].getName(); 
				
			}
			msj = "the enemy that the highest scoring give  is .. "+ name + ", the type:" + type + ", gives this score:  " + score + ", and he is on this level: " + level + ".";  
		}
		return msj; 
	}

	public String moreAmountTreasure(){

	String msj=" ";
    
   
    return msj;

	}

	public String amountEnemy(String typeEnemy){

		 int count = 0;
		 String msj ="";  
		 for( int i = 0; i <TOTAL_ENEMYS; i++){

		 	if(enemys[i] != null && enemys[i].getType().equalsIgnoreCase(typeEnemy)){
		 		count++; 
		 	}
		 	msj = " the amount of this type of enemy in the game is... " + count; 
		 } 

		 return msj; 
	}
	public String amountTreasure(String typeTreasure){

		 int count = 0;
		 String msj ="";  
		 for( int i = 0; i <TOTAL_TREASURES; i++){

		 	if(treasures[i] != null && treasures[i].getName().equalsIgnoreCase(typeTreasure)){
		 		count++; 
		 	}
		 	msj = " the amount of this type of treasure in the game is... " + count; 
		 } 

		 return msj; 
	}


	public String consonantsEnemyGame(){
		   String msj = ""; 
		   int amount=0;
		   char [] consonants={'q','w','r','t','y','p','s','d','f','g','h','j','k','l','z','x',
		                       'c','v','b','n','m'};

		   for(int i=0; i<TOTAL_ENEMYS;i++){
		      if(enemys[i]!=null){
		         for(int j=0; j<enemys[i].getName().length();j++){
		            for(int s=0;s<consonants.length;s++){
		               if(enemys[i].getName().charAt(j)==consonants[s]){
		                  amount++;
		               }
		            }
		         }
		      }

		      msj = "this is the number of consonants ...  "  + amount; 
		   }
		   return msj;
		}

}