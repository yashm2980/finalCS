import mayflower.*;
import java.lang.Math;
/**
 * Write a description of class Multiplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Extraneous extends Object
{
    // instance variables - replace the example below with your own
    
    
    /**
     * Constructor for objects of class Multiplier
     */
    public Extraneous(int x, int y, int t)
    {
        super(x, y, t);
        double random = Math.random();
        if(random < .25){
            setImage("img/Cone.png");
        }
        else{
            setImage("img/RoadBlock.png");
        }
        
        
    }

    
    public void act()
    {
        this.move(0, getSpeed());
        setLocation(this.getX(), this.getY());
        
     
        if (Mayflower.isKeyDown(Keyboard.KEY_UP) && getSpeed() < 10){
            updateSpeed(1);
       }
       if (Mayflower.isKeyDown(Keyboard.KEY_DOWN) && getSpeed() > 0){
            updateSpeed(-1);
       }
       
    }
       
}

