
/**
 * Write a description of class MyMayflower here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import mayflower.*;

public class MyMayflower extends Mayflower 
{
    //Constructor
    public MyMayflower()
    {
        
        super("CS Project1", 500, 888);
    }

    public void init()
    {
        
        Mayflower.setFullScreen(true);
        World w =  new MyWorld();
        Mayflower.setWorld(w);
    }
}

