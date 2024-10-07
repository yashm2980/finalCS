import mayflower.*;

/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    // instance variables - replace the example below with your own
    private int x;
    private int lane;
    public int gas;
    public int mph;
    public Timer c;
    public int multiplierIncrease;
    private Animation animation;
    private boolean goingLeft = false;
    private int rightFrameNumber = 1;
    public Timer animationTimer;
    
    

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        //setImage("img/car.png");
         MayflowerImage p = new MayflowerImage("img/car.png");

        setImage(p);
        String[] frames = new String[10];
        
    
        
        lane = 1;
        c = new Timer(250000000);
        gas = 100;
        mph = 60;
        
        animationTimer = new Timer(100000);
    }
    
    public void move(int dx, int dy) {
        this.x += dx;
    }
    
    public int getGas(){
        return gas;
    }
    
    public int getMPH() {
        return mph;
    }
    
    public int getLane() {
        
        return lane;
    }
    
    public void updateText(){
        
        
    }
    
    public boolean isTouchingMultiplier(){
        // Check if this object is touching a multiplier object
        if(isTouching(Multiplier.class)){
            // Get the multiplier object being touched
            Multiplier mulObject = (Multiplier) getOneIntersectingObject(Multiplier.class);
            // Get the current game world
            World w = getWorld();
            // Remove the multiplier object from the world
            w.removeObject(mulObject);
            // Return true indicating a multiplier was touched
            return true;
        }
        return false;
    }
    public void moveRight(){
         // Loop to display images for a right turn animation (frames 1 to 7)
        
            for(int i = 1; i < 8; i++){
                // Create a new timer with a 1-second delay
                Timer x = new Timer(1000);
                // Load the corresponding image for the right turn animation
                MayflowerImage image = new MayflowerImage("rightTurnA/RightTurn" + i + ".png");
                
                if(x.isDone()){
                   setImage(image); 
                }
                
                
            
            }
            
            
            
            lane+=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            // Loop to display images for the remaining right turn animation (frames 8 to 13)
            for(int i = 8; i < 14; i++){
                Timer y = new Timer(1000);
                // Load the corresponding image for the right turn animation
                MayflowerImage image = new MayflowerImage("rightTurnA/RightTurn" + i + ".png");
                // Check if the timer is done, then display the image
                if(y.isDone()){
                   setImage(image); 
                }
                
                
                
            
            }

    }
    
    public void setGas(int amount){
        gas = amount;
    }
    
    public void moveRight2() {
        
        while (rightFrameNumber < 8) {
            setImage("rightTurnA/RightTurn" + rightFrameNumber + ".png");
            rightFrameNumber++;
        }
        
        lane+=1;
        setLocation((getLane() - 1) * 82 + 98, 651);
        
        while (rightFrameNumber < 14) {
            
            MayflowerImage temp = new MayflowerImage("rightTurnA/RightTurn" + rightFrameNumber + ".png");
            temp.scale(0.5);
            setImage(temp);
            rightFrameNumber++;
        }
        
        rightFrameNumber = 1;
        
        if (animationTimer.isDone()){
                 animationTimer.reset();
                 animationTimer.set(60);
        }
    }
    
    public void act(){
        
        if (Mayflower.isKeyPressed(Keyboard.KEY_RIGHT) && lane < 4){
            
            setImage("rightTurnA/RightTurn5.png");
            
            int i = 0;
            
            while (i < 82) {
                move(1);
                i++;
            }
            
            lane+=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            setImage("img/car.png");
             
             
 
        }
        if (Mayflower.isKeyPressed(Keyboard.KEY_LEFT) && lane > 1){
            lane-=1;
            setLocation((getLane() - 1) * 82 + 98, 651);
            
        }          
        
        if (isTouching(ObstacleCar.class) || isTouching(Extraneous.class)){
            Mayflower.setWorld(new Lose());
        }
        
        if(c.isDone()){
            gas -= 1;
            c.reset();
        }
        
        if(gas == 0){
            Mayflower.setWorld(new Lose());
        }
        
        if(isTouching(Gas.class)){
            gas = 100;
            Gas gasObject = (Gas) getOneIntersectingObject(Gas.class);
            World w = getWorld();
            w.removeObject(gasObject);
        }
        
        
        if (Mayflower.isKeyDown(Keyboard.KEY_UP) && (mph < 150)) {
            mph *= 1.02;
        }
        
        if (Mayflower.isKeyDown(Keyboard.KEY_DOWN) && (mph > 1)) {
            mph *= 0.9;
        }
        }
    }
