import mayflower.*;
import java.lang.Math.*;
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level1 extends Level
{
    // instance variables - replace the example below with your own
    Car driver;
    private Timer scoreTimer;
    private int timesMultiplier;
    private Timer completionTimer;
    
    /**
     * Constructor for objects of class Level1
     */
    public Level1()
    {
        // initialise instance variables
        
        
        setBackground("img/.png");
        driver = new Car();
        addObject(driver, (driver.getLane() - 1) * 82 + 98, 651);
        

        
        buildRaceWorld(2, .15, .07, .02, .15, .12);
        
        scoreTimer = new Timer(900000000);
        timesMultiplier = 9000000;
        completionTimer = new Timer(10^7);
    
        
        
    }
    
    public int getSpeed() {
        return super.getRaceSpeed();
    }
    
    public void isMultiplier(){
        // Check if the driver is touching a multiplier object
        if(driver.isTouchingMultiplier()) {
            // Reset the multiplier to 0 if touching
            timesMultiplier = 0;
        }
    }

    
    public void act()
    {
        // Display the score at position (10, 30) on the screen
       showText("Score: " + score, 10, 30);
        // Display the gas level of the driver at position (250, 855)
       showText("Gas: " + driver.getGas(), 250, 855);
       // Display the MPH (speed) of the driver at position (0, 855)
       showText("MPH: " + driver.getMPH(), 0, 855);
        // Check if the score timer has finished its interval

    if(scoreTimer.isDone()) {
        int increaseScoreBy;
         // If the multiplier is less than 9, calculate the increased score
        if(timesMultiplier < 9) {
             // Increase score by 10 times speed times 2, and update the score
           increaseScoreBy = 10 * getSpeed() * 2;
           score += increaseScoreBy;
           // Increment the multiplier by 1
            timesMultiplier ++;
            // Print the current multiplier value to the console
            System.out.println(timesMultiplier);
        }
        else {
            // If multiplier is 9 or more, increase score by 10 times speed
        increaseScoreBy = 10 * getSpeed();
       score += increaseScoreBy;
    }
        scoreTimer.reset();
    }
    // Check if the driver is touching a multiplier object

    isMultiplier();
    
    
    if (score > 1000){
        Mayflower.setWorld(new Level2());
    }
       
    }
}
