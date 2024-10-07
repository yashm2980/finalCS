import mayflower.*;

public class Object extends Actor
{
    // instance variables - replace the example below with your own
    
    private int x;
    private int y;
    private int speed;

    
    public Object(int a, int b, int c)
    {
        // initialise instance variables
        x = a;
        y = b;
        speed = c;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int x){
        speed = x;
    }
    
    public void updateSpeed(int newSpeed){
        this.speed += newSpeed;
    }
    
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    public void updateSpeed(double newSpeed){
        this.speed += newSpeed;
    }
    
    public void act()
    {
        if (Mayflower.isKeyDown(Keyboard.KEY_UP) && speed < 10){
            updateSpeed(.2);
       }
       
    }
}

