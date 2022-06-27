
package soccer;


public class League {

    
    public static void main(String[] args) {
       
        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);
       
        for (Game currGame : theGames){
            currGame.playGame();
            System.out.println(currGame.getDescription());
        }
        theLeague.showBestTeam(theTeams);  
    }
    
    public Team[] createTeams (){
        //team1
        Player player1 = new Player("George Hann");  
        Player player2 = new Player("Gregory Guarini");
        Player player3 = new Player("Graham Trim"); 
        
        Player[] thePlayers1 = {player1, player2, player3};
        
        Team team1 = new Team("The Greens", thePlayers1);
        
        //team2
        Player[] thePlayers2 = new Player[3];
        
        thePlayers2[0] = new Player("Robert Linn"); 
        thePlayers2[1] = new Player("Robbie Woods");
        thePlayers2[2] = new Player("Richard Bodner");

        Team team2 = new Team("The Reds", thePlayers2);
        
        
        Team [] theTeams = {team1, team2};
        return theTeams;
    }
    
    public Game[] createGames (Team[] theTeams){
        Game theGame = new Game(theTeams[0], theTeams[1]);
        Game theGame2 = new Game(theTeams[1], theTeams[0]);
        Game[] theGames = {theGame, theGame2};
        return theGames;
    }       
    
    public void showBestTeam(Team[] theTeams){
        Team currBestTeam = theTeams[0];
        System.out.println("\nTeam Points");
        for(Team currTeam : theTeams){
            System.out.println(currTeam.getTeamName() + ":" + currTeam.getPointsTotal());
            if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
                currBestTeam = currTeam;
            }
            else if (currTeam.getPointsTotal() == currBestTeam.getGoalsTotal()){
                if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
                    currBestTeam = currTeam;
                }
            }
        }    
        System.out.println("The winner of the league is " + currBestTeam.getTeamName());
        
    }
}
    

