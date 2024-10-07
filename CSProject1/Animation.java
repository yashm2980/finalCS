import mayflower.*;

public class Animation
{
    private MayflowerImage[] frames;
    private int framerate;
    private int currentFrame;

    public Animation(int framerate, String[] frames)
    {
        this.frames = new MayflowerImage[frames.length];
        for(int i = 0; i < frames.length; i++){
            this.frames[i] = new MayflowerImage(frames[i]);
        }

        this.framerate = framerate;
        currentFrame = 0;
    }

    public int getFrameRate()
    {
        return framerate;
    }
    
    public void scale(int w, int h)
    {
        for(int i = 0; i < frames.length; i++){
            frames[i].scale(w, h);
        }
    }
    
    public void setTransparency(int t)
    {
        for(int i = 0; i < frames.length; i++){
            frames[i].setTransparency(t);
        }
    }
    
    public void mirrorHorizontally()
    {
        for(int i = 0; i < frames.length; i++){
            frames[i].mirrorHorizontally();
        }
    }
    
    public void setBounds(int x, int y, int w, int h)
    {
        for(int i = 0; i < frames.length; i++){
            this.frames[i].crop(x, y, w, h);
        }
    }
    
    public MayflowerImage getNextFrame()
    {
        MayflowerImage img = frames[currentFrame];
        currentFrame++;
        currentFrame %= frames.length;

        return img;
    }
}