
import java.util.Scanner; 

public class TrueShootingPercentage
{
    public static void main( String[] args ) {
        
        Scanner s = new Scanner(System.in);
        
        String playerName;
        double points;
        double fieldGoalAttempts;
        double freeThrowAttempts; 
        double trueShootingPercentage;
        
    System.out.println("True shooting percentage is basically a measure of a player's efficiency at shooting the basketball when taking into account their field");
    System.out.println("goal percentage (their percentage at making 2s and 3s), three-point field goal percentage (their percentage at making 3s), and free throw");
    System.out.println("percentage (their percentage at making free throws). Sometimes, it's hard to compare players with each other because they have varying field");
    System.out.println("goal percentages, three-point field goal percentages, and free throw percentages, so by calculating the true shooting percentage, it becomes");
    System.out.println("easier to compare which players are better at making their shots in general. True shooting percentage takes into account the number of");
    System.out.println("points a player has, their field goal attempts, and their free throw attempts, and will give a good calclation of what their player's true");
    System.out.println("shooting percentage is. The ratio 0.44 is used to multiply the number of free throw attempts and this is done because you want to");
    System.out.println("convert a free throw into a shot attempt as players usually get 2 free throws. With 2 free throws, one would assume that the ratio 0.5");
    System.out.println("should be used as then 2 free throws x 0.5 = 1 shot attempt but you'd have to take into account and-1 free throws, technical free throws,");
    System.out.println("flagrant foul free throws, and 3-point shot free throws, which results in a ratio of 0.44 based on testing and is considered to be accurate");
    System.out.println("in the NBA (National Basketball Association). That's mainly just an explanation of the math and if you didn't get it, that's okay as you");
    System.out.println("don't really need to understand the reason why 0.44 is used to use the program to calculate a player's true shooting percentage. After you");
    System.out.println("answer all the questions that the program asks, it will give a true shooting percentage based on a  calculation and will give a message");
    System.out.println("saying whether that true shooting percentage is good or not. Generally, a true shooting percentage of 59% or above is considered to be");
    System.out.println("amazing while a true shooting percentage of under 50% is considered to be pretty bad. Finally, this program can be used to calculate the");
    System.out.println("true shooting percentage of player in an individual game, range of games (multiple), a season, or their entire career if you input their");
    System.out.println("points, field goal attempts, and free throw attempts over that specified time period."); 
    System.out.println();
    System.out.println();
    System.out.println();
    
        System.out.println("Enter the name of the player: ");
        playerName = s.nextLine(); 
        
        System.out.println("Enter the number of points that " + playerName + " got (in a game, range of games, or season): ");
        points = s.nextDouble(); 
        
        System.out.println("Enter the number of field goal attempts that " + playerName + " had (in a game, range of games, or season): ");
        fieldGoalAttempts = s.nextDouble();
        
        System.out.println("Enter the number of free throw attempts that " + playerName + " had (in a game, range of games, or season): ");
        freeThrowAttempts = s.nextDouble(); 
        
        trueShootingPercentage = ((points) / (2 * (fieldGoalAttempts + 0.44 * freeThrowAttempts))) * 100; 
        
        System.out.println(playerName + "'s true shooting percentage is " + trueShootingPercentage); 
        
        if (trueShootingPercentage < 50) {
            System.out.println("This true shooting percentage is pretty bad. The player should take more efficient shots and/or take less shots."); 
        }
        else if (trueShootingPercentage >= 50 && trueShootingPercentage < 54) {
            System.out.println("This true shooting percentage is ok. The player is making shots at a decent percentage but can improve even more."); 
        }
        else if (trueShootingPercentage >= 54 && trueShootingPercentage < 59) {
            System.out.println("This true shooting percentage is great. The player should continue to take the shots that they're already making."); 
        }
        else {
            System.out.println("This true shooting percentage is amazing. The player is making shots at an incredible percentage and there isn't much to improve."); 
        }
    }
}
