import mayflower.*;

public class AnimatedActor extends Actor
{
    private Animation animation;
    private Timer animationTimer;
    
    public AnimatedActor()
    {
        animationTimer = new Timer(50000000);
    }
    
    public void setAnimation(Animation a)
    {
        animation = a;
    }
    
    public void act()
    {   
        
        
        if(animationTimer.isDone()){
            animationTimer.reset();
            MayflowerImage img = animation.getNextFrame();
            setImage(img);
        }
    }
}