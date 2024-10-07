import mayflower.*;
/**
 * Write a description of class Multiplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplier extends Object
{
    // instance variables - replace the example below with your own
    
    
    /**
     * Constructor for objects of class Multiplier
     */
    public Multiplier(int x, int y, int t)
    {
        super(x, y, t);
        setImage("img/Multiplier.png");
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
       
       if(isTouching(Car.class)){
           Timer j = new Timer(1000);
           if (j.isDone()){
           World w = getWorld();
           w.removeObject(this);
        }
       }
       
       
    }
}
