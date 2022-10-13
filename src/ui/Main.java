package ui; 

import java.util.Scanner;
import model.Game; 

public class Main{

	//initialization of the Scanner and model. 
	private Scanner reader; 
	private Game game; 

	public Main(){
		//object creation 
		reader = new Scanner(System.in); 
		game  = new Game(); 

	}
	public void initGame(){
		game.initialityEnemys();
		game.initialityTreasures();

	}

	//returns the class, that is, the class becomes visible to the main method.
	public Game getGame(){
		return game; 
	}

	//returns the class, that is, the class becomes visible to the main method.
	public Scanner getReader(){
		return reader;
	}

	public static void main(String[] args){
		// creación del objeto. 
		Main main = new Main(); 
		main.initGame(); 
		int option = 0; 
		do{

			option = main.getOptionShowMenu(); 
			main.executeOption(option);
					

		}while(option != 0);

		main.getReader().close();
	}

	/**
	getOptionShowMenu: This method shows all the options available in the menu, 
					after having the user enter an option.
	@return option: int: this parameter read the option entered by the user. 
	*/
	
	public int getOptionShowMenu(){
		//initialization of the variables
		int option = 0; 
		System.out.println(printMenu());
		option = validateIntegerOption();
		return option; 
	}
	public String printMenu(){
		return 
		"<---o+o--->welcome to the game of the year :p <---o+o--->\n\n" +
				"1. Create a player\n" +
				"2. Register enemy at a level\n" +
				"3. Register treasure at a level\n" + 
				"4. Modify a player score.\n" +
				"5. Increase level for a player.\n" +
				"6. Inform treasures and enemies of a level\n" +
				"7. Report the amount of a treasure at all levels\n" +
				"8. Report the amount of an enemy type at all levels\n" +
				"9. Report the most repeated treasure at all levels.\n" +
				"10. Inform the enemy that gives the highest score and the level where it is located.\n" +
				"11. Report the number of consonants found in enemy names.\n" +
				"12. top 5 players.\n" +
				"0. Exit. "; 

	}
	public void executeOption(int option){
		String msj = "";
		String nickname = "";
		String name = "";
		String enemyType = "";
		int scoreLost = 0;
		int scoreWin = 0;
		int levelObject = 0;
		String ogro = "ogro";
		String abstracto = "abstracto";
		String jefe = "jefe";
		String magico = "magico"; 
		String diamond = "diamond"; 
		String rock = "rock"; 
		String map = "map"; 
		String blade = "blade"; 
		String golden = "golden";
		String url = "";
		String treasureType = ""; 
		int amount = 0;
		int score = 0; 
		switch(option){
	
			case 1: 
				System.out.println("we will create a new player B)\n");
				System.out.println("type your nickname");
				nickname = reader.next();
				System.out.println("type your name");
				name = reader.next();
				msj = game.registerPlayer(nickname, name);
				
				System.out.println(msj); 

				break; 

			case 2:  
				
				System.out.println(" we will register enemy at a level!\n");
				System.out.println(" type the enemy name");
				name = reader.next();
				System.out.println("type the enemy type :O, just between these guys... ogro, abstracto, jefe y magico");
				enemyType = reader.next();

				if(ogro.equalsIgnoreCase(enemyType) || abstracto.equalsIgnoreCase(enemyType) || jefe.equalsIgnoreCase(enemyType) || magico.equalsIgnoreCase(enemyType)){
					
				} else{
					System.out.println("this type of enemy doesnt exist :( ... try again\n ");
					break;  
					}
				System.out.println("type the score lost if the player lost with the enemy");
				scoreLost = validateIntegerOption();  
				if(scoreLost<0){
					System.out.println("enter a valid option.... xD"); 
					break;

				}
				System.out.println("type the score win if the player wins with the enemy");
				scoreWin = validateIntegerOption();
				if(scoreWin<0){
					System.out.println("enter a valid option.... xD");
					break;
				}
				System.out.println("Type the enemy level, 1 1 to 10");
				levelObject = validateIntegerOption(); 

				if(levelObject > 10 || levelObject < 1){
					System.out.println("this level does not exist >:(.... try again..");
				} 


				msj = game.addEnemyToLevel(name, enemyType, scoreLost, scoreWin,levelObject);
				game.addEnemyGame(name, enemyType, scoreLost, scoreWin,levelObject);
				
				System.out.println(msj);
			
				break; 

			case 3: 
				
				System.out.println("we will register treasure at a level!\n");
				
				System.out.println(" type the treasure name... only among diamond, rock, map, blade and golden... UwU ");
				name = reader.next();

				if(diamond.equalsIgnoreCase(name) || rock.equalsIgnoreCase(name) || map.equalsIgnoreCase(name) || blade.equalsIgnoreCase(name) || golden.equalsIgnoreCase(name)){
					
				} else{
					System.out.println("this type of treasure doesnt exist :( ... try again\n ");
					break;  
					}



				System.out.println("Place the URL of the treasure image ");
				url = reader.next();
				System.out.println("enter the score that the user win if he finds the treasure ");
				scoreWin = validateIntegerOption();
				if(scoreWin<0){
					System.out.println("enter a valid option.... xD");
					break;
				}
				System.out.println("Type the treasure level, 1 1 to 10");
				levelObject = validateIntegerOption();

				if(levelObject > 10 || levelObject < 1){
					System.out.println("this level does not exist >:(.... try again..");
					break; 
				} 
				System.out.println("type the amount of this treasure you want at this level ");
				amount = validateIntegerOption();
				if(amount<0){
					System.out.println("enter a valid option.... xD");
					break; 
				}

				
				msj = game.addTreasureToLevel(name, url, scoreWin, levelObject, amount);
				game.addTreasureGame(name, url, scoreWin, levelObject, amount);
				
				System.out.println(msj);
			
				break;

			case 4:
				System.out.println("type the nickname of the player whose score will be modified  :D");
				nickname = reader.next();
				System.out.println("enter the new player score with a min that 0, and maximum that 999... ");
				score = validateIntegerOption();
				if(score<0 || score >=1000){
					System.out.println("enter a valid score.... xD");
					break; 
				}
				msj = game.changeScorePlayer(nickname, score);
				System.out.println(msj); 


				break;

			case 5:
				System.out.println("type the nickname of the player whose level will be changed  :D");
				nickname = reader.next();
				msj =game.changeLevelPlayer(nickname);
				System.out.println(msj);


				break; 

			case 6:

				System.out.println("type the level from which you want to know the enemies and treasures... ");
				levelObject = validateIntegerOption();

				if(levelObject > 10 || levelObject < 1){
					System.out.println("this level does not exist >:(.... try again..");
					break; 
				}

				msj= game.enemysForLevel(levelObject);
				System.out.println(msj); 

				msj = game.treasuresForLevel(levelObject);
				System.out.println(msj); 

				break;

			case 7: 
				System.out.println("lets know the amount of an treasure type in this game...  \n");
				System.out.println("type the treasure type.. diamond, rock, map, blade or golden "); 
				name = reader.next(); 
				if(diamond.equalsIgnoreCase(name) || rock.equalsIgnoreCase(name) || map.equalsIgnoreCase(name) || blade.equalsIgnoreCase(name) || golden.equalsIgnoreCase(name)){
					
				} else{
					System.out.println("this type of treasure doesnt exist :( ... try again\n ");
					break;  
				}


				msj =game.amountTreasure(name);
				System.out.println(msj); 

				break;

			case 8: 
				System.out.println("lets know the amount of an enemy type in this game...  \n"); 
				System.out.println(" type the enemy type..");
				enemyType = reader.next(); 
				if(ogro.equalsIgnoreCase(enemyType) || abstracto.equalsIgnoreCase(enemyType) || jefe.equalsIgnoreCase(enemyType) || magico.equalsIgnoreCase(enemyType)){
					
				} else{
					System.out.println("this type of enemy doesnt exist :( ... try again\n ");
					break;  
				}

				msj = game.amountEnemy(enemyType); 
				System.out.println(msj); 

				break; 

			case 9:
				System.out.println("lets know the treasure the more it repeats in the game... \n"); 
				msj = game.moreAmountTreasure();
				System.out.println(msj); 

				break; 

			case 10: 
				System.out.println(" lets meet the enemy that gives highest score in this game ....\n"); 
				
				msj = game.enemyMoreScore();
				System.out.println(msj); 

				break; 

			case 11:
				System.out.println("these are the quantities of consonants of the names of the enemies of the game... ");
				msj = game.consonantsEnemyGame(); 
				System.out.println(msj); 

				break;

			case 12:
				System.out.println("this is the top players.. \n");

				msj = game.topPlayer();
				System.out.println(msj); 

				break;

			case 0: 
				System.out.println("Exit program.");
				break; 

			default: 
				System.out.println("Invalid Option");
				break; 
		}
	}
	public int validateIntegerOption(){
		int option = 0; 

		if(reader.hasNextInt()){
			option = reader.nextInt(); 
		}
		else{
			// clear reader. 
			reader.nextLine(); 
			option = -1; 
		}

		return option; 
	}
}