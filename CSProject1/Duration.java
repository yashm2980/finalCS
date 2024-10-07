import java.util.*;
/**
 * Write a description of class Duration here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Duration
{
    public int time;    
    public Duration()
    {
        time = (int)(System.currentTimeMillis()/1000);
        
    }
    
    public int getTime(){
        return time;
    }
    
    public void act(){
    
    }


   
}
