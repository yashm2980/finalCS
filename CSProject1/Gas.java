import mayflower.*;

public class Gas extends Object
{

    public Gas(int x, int y, int t)
    {
        // initialise instance variables
        super(x, y, t);
        setImage("img/Gas.png");
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
