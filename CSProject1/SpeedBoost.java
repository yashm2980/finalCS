import mayflower.*;

public class SpeedBoost extends Object
{

    public SpeedBoost(int x, int y, int t)
    {
        // initialise instance variables
        super(x, y, t);
        setImage("img/SpeedBooster.png");
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
           setSpeed(5);
           Timer j = new Timer(1000);
           if (j.isDone()){
           World w = getWorld();
           w.removeObject(this);
        }
       }
    }
}
