import mayflower.*;
/**
 * Write a description of class ObstacleCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObstacleCar extends Object
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class ObstacleCar
     */
    public ObstacleCar(int x, int y, int t)
    {
        // initialise instance variables
        super(x, y, t);
        setImage("img/ObstacleCar.png");
    }

    public void act(){
       this.move(0, getSpeed());
       setLocation(this.getX(), this.getY());
       
       
        if (Mayflower.isKeyDown(Keyboard.KEY_UP) && getSpeed() < 5){
            updateSpeed(1);
         }
           
        if (Mayflower.isKeyDown(Keyboard.KEY_DOWN) && getSpeed() > -5){
            updateSpeed(-1);
        }
       
        }
       
    }


