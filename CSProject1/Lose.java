import mayflower.*;
public class Lose extends Level
{
   
    public Lose()
    {
        // Set the background image for the lose screen
        setBackground("img/Lose.png");
        // Show the boundaries of objects in the game world (useful for debugging)
        Mayflower.showBounds(true);
    }

    public void act(){
        // Check if the Enter key is pressed
        if(Mayflower.isKeyPressed(Keyboard.KEY_ENTER)){
            score = 0;
            // Restart the game by setting the world to a new Level1 instance
            Mayflower.setWorld(new Level1());
        }
        
        if(Mayflower.isKeyDown(Keyboard.KEY_A)){
            score = 0;
            System.exit(0);
        }
    }
}
