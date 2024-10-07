import mayflower.*;
import java.lang.Math.*;
/**
 * Write a description of class Level1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Level3 extends Level
{
    // instance variables - replace the example below with your own
    Car driver;
    private Timer scoreTimer;
    private int timesMultiplier;
    private Timer completionTimer;
    
    /**
     * Constructor for objects of class Level1
     */
    public Level3()
    {
        // initialise instance variables
        
        score = 2000;
        
        setBackground("img/Level2.png");
        driver = new Car();
        addObject(driver, (driver.getLane() - 1) * 82 + 98, 651);
        

        
        buildRaceWorld(2, .12, .17, .12, .25, .22);
        
        scoreTimer = new Timer(900000000);
        timesMultiplier = 9000000;
        completionTimer = new Timer(10^7);
    
        
        
    }
    
    public int getSpeed() {
        return super.getRaceSpeed();
    }
    
    public void isMultiplier(){
        if(driver.isTouchingMultiplier()) {
            timesMultiplier = 0;
        }
    }

    
    public void act()
    {
       showText("Score: " + score, 10, 30);
        
       showText("Gas: " + driver.getGas(), 250, 855);
       
       showText("MPH: " + driver.getMPH(), 0, 855);

    if(scoreTimer.isDone()) {
        int increaseScoreBy;
        if(timesMultiplier < 9) {
           increaseScoreBy = 10 * getSpeed() * 2;
           score += increaseScoreBy;
            timesMultiplier ++;
            System.out.println(timesMultiplier);
        }
        else {
        increaseScoreBy = 10 * getSpeed();
       score += increaseScoreBy;
    }
        scoreTimer.reset();
    }

    isMultiplier();
    
    
    if (score > 3000){
        //Mayflower.setWorld(new Winner());
    }
       
    }
}
