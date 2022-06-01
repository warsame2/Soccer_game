package soccer;
import utility.GameUtils;
public class League {

    public static void main(String[] args) {
  
    // add call in part 8
    	Team[] theTeams = createTeams(); 
    	Game[] theGames = createGames(theTeams); 
    	
    	
    /*
     * remove this in method createTeam
     * not new put in part 8
     
    	Player player1 = new Player(); 
    	player1.playerName = "George Eliot"; 
    	
     	
    	Player player2 = new Player(); 
    	player2.playerName = "Graham Greene";
    	
    	Player player3 = new Player(); 
    	player3.playerName = "Geoffrey Chaucer"; 
    	
    	
    	Player[] thePlayers = { player1, player2, player3 }; 
    	
    	Team team1 = new Team(); 
    	team1.teamName = "The Greens"; 
    	team1.playerArray = thePlayers; 	
    	
    	
    	*/
    /*
    	for (Player thePlayer: team1.playerArray) { 
    		 System.out.println(thePlayer.playerName); 
    		} 
    		
    	*/	   
    		
    	// team 1
    	
    	
    	/*
         * remove this in method createTeam
         *not new put in part 8
         
    	Team team2 = new Team(); 
    	
    	team2.teamName = "The Reds"; 
    	team2.playerArray = new Player[3]; 
    	team2.playerArray[0] = new Player();
    	team2.playerArray[0].playerName = "Robert Service"; 
    	team2.playerArray[1] = new Player();
    	team2.playerArray[1].playerName="Robbie Burns";
    	team2.playerArray[2] = new Player();
    	team2.playerArray[2].playerName="Rafael Sabatini";
    
    	*/
    	
    	/*
    	for (Player thePlayer: team2.playerArray) { 
   		 System.out.println(thePlayer.playerName); 
   		} 
   		*/
    
    	// team 2
    	
    	
    	
    	/*
    	 * Delete this in prate 8
    	 
    	Game currGame = new Game(); 
    	currGame.homeTeam = team1; 
    	currGame.awayTeam = team2;
    	*/
    	
    	// add this in part 8
    	Game currGame = theGames[0]; 

    	
    	Goal goal1 = new Goal(); 
    	goal1.thePlayer = currGame.homeTeam.playerArray[2]; 
    	goal1.theTeam = currGame.homeTeam; 
    	goal1.theTime = 55; 
    	
    	//Goal[] theGoals = {goal1}; 
    	//currGame.goals = theGoals; 
    	/*
    	System.out.println("Goal scored after " + 
    			currGame.goals[0].theTime + " mins by " + 
    			currGame.goals[0].thePlayer.playerName + " of " + 
    			currGame.goals[0].theTeam.teamName); 
    	*/
    	
    	// add this part 8
    	// run this 0/6
    	int numberOfGoals = (int)(Math.random() * 7); 
    	//System.out.println(numberOfGoals); 
    	
    	Goal[] theGoals = new Goal[numberOfGoals]; 
    	// add this after Delete System out print
    	

    	currGame.goals = theGoals;
    	
	 
	GameUtils.addGameGoals(currGame);
	
	
for (Goal currGoal: currGame.goals) { 
		
		System.out.println("Goal scored after " + 
				 currGoal.theTime + " mins by " + 
				 currGoal.thePlayer.playerName + 
				 " of " + currGoal.theTeam.teamName);	
    	} 	

    	
    	
	
	
	
    
    	
    	// Delete this 
    	//System.out.println(theGoals.length); 
    	
    	
    	
    	// Print the out put
    	
    	// end part 6
    	
    	// start part 7
    	
    	/*
    	 * remove this in part 8
    	 
    	for (Player thePlayer: team2.playerArray) { 
    		if (thePlayer.playerName.matches(".*Sab.*")) { 
    		 System.out.println("Found " + thePlayer.playerName);
    		 
    		 System.out.println("Last name is " + 
    				 thePlayer.playerName.split(" ")[1]); 
    		} 
    		}
    	
    	
    	StringBuilder familyNameFirst = new StringBuilder(); 
    	for (Player thePlayer: team1.playerArray) { 
    		 String name[] = thePlayer.playerName.split(" "); 
    		 familyNameFirst.append(name[1]);
    		 familyNameFirst.append(", "); 
    		 familyNameFirst.append(name[0]); 
    		 System.out.println(familyNameFirst); 
    		 familyNameFirst.delete(0, familyNameFirst.length());
    	
    		} 
    	
    	*/
    	
    	// end part 7
    	
    	
} 
    
 // start part 8 
    
    // Create method  createTeams
    public static Team[] createTeams() {
    	
    	// team 1
    	
    	Player player1 = new Player(); 
    	player1.playerName = "George Eliot"; 
    	
     	
    	Player player2 = new Player(); 
    	player2.playerName = "Graham Greene";
    	
    	Player player3 = new Player(); 
    	player3.playerName = "Geoffrey Chaucer"; 
    	
    	
    	Player[] thePlayers = { player1, player2, player3 }; 
    	
    	Team team1 = new Team(); 
    	team1.teamName = "The Greens"; 
    	team1.playerArray = thePlayers; 	
    	
    		
  // team 2  	
Team team2 = new Team(); 
    	
    	team2.teamName = "The Reds"; 
    	team2.playerArray = new Player[3]; 
    	team2.playerArray[0] = new Player();
    	team2.playerArray[0].playerName = "Robert Service"; 
    	team2.playerArray[1] = new Player();
    	team2.playerArray[1].playerName="Robbie Burns";
    	team2.playerArray[2] = new Player();
    	team2.playerArray[2].playerName="Rafael Sabatini";
    	
    	
    	
    	// print team 1
    	for (Player thePlayer: team2.playerArray) { 
    		if (thePlayer.playerName.matches(".*Sab.*")) { 
    		// System.out.println("Found " + thePlayer.playerName);
    		 
    		// System.out.println("Last name is " + 
    				// thePlayer.playerName.split(" ")[1]); 
    		} 
    		}
    	
    	// print team 2
    	/*
    	StringBuilder familyNameFirst = new StringBuilder(); 
    	for (Player thePlayer: team1.playerArray) { 
    		 String name[] = thePlayer.playerName.split(" "); 
    		 familyNameFirst.append(name[1]);
    		 familyNameFirst.append(", "); 
    		 familyNameFirst.append(name[0]); 
    		 System.out.println(familyNameFirst); 
    		 familyNameFirst.delete(0, familyNameFirst.length());
    	
    		} 
    	*/
    	Team[] theTeams = {team1, team2}; 
    	return theTeams;

    	
    }    
    
    
    // Create method createGames
    public static Game[] createGames(Team[] theTeams) {
    	Game theGame = new Game(); 
    	
    	// Error for syntax 
    	
    	theGame.homeTeam = theTeams[1]; 
    	theGame.awayTeam = theTeams[0]; 
    	Game[] theGames = {theGame}; 
    	return theGames; 
    	
    	
    	
    } 
    
    
     
}
