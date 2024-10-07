import mayflower.*;

public class MyWorld extends World {
    
    public MyWorld() 
    {
        setBackground("img/title_screen.png");
        Mayflower.showBounds(true);
        
        

        
        
       
    }

    public void act()
    {
        if(Mayflower.isKeyDown(Keyboard.KEY_ENTER)){
            Mayflower.setWorld(new Level1());
        }
    }
}