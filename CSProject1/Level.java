import mayflower.*;


public class Level extends World 
{
    public int score;
    public int mph;
    public int speed;
    public Duration time;

    public Level() 
    {
        score = 0;
        mph = 0;
        
        
    }  
    
    public void buildRaceWorld(int speed, double pc1, double pc2, double pc3, double pc4, double pc5){
   
     if(checkProportion(pc1, pc2, pc3, pc4, pc5)){
         pc1 = pc1;
         pc2 += pc1;
         pc3 += pc2;
         pc4 += pc3;
         pc5 += pc4;
     }
        
        
     Object[][] objects = new Object[4][32];   
     for (int r = 0; r < objects.length; r++) {
            for (int c = 0; c < objects[r].length; c++) {
                double rng = Math.random();
                
                this.speed = speed;
                
                if (rng < pc1) {
                    objects[r][c] = new ObstacleCar(r * 82 + 98, c * -500, (speed / 2));
                    addObject(objects[r][c], objects[r][c].getX(), objects[r][c].getY());
                }
                else if (rng < pc2) {
                    objects[r][c] = new Multiplier(r * 82 + 98, c * -500, speed);
                    addObject(objects[r][c], objects[r][c].getX(), objects[r][c].getY());
                }
                else if (rng < pc3){
                    objects[r][c]= new SpeedBoost(r * 82 + 98, c * -500, speed);
                    addObject(objects[r][c], objects[r][c].getX(), objects[r][c].getY());
                }
                else if (rng < pc4){
                    objects[r][c] = new Extraneous(r * 82 + 90, c * -500, speed);
                    addObject(objects[r][c], objects[r][c].getX(), objects[r][c].getY());
                }
                else if (rng < pc5) {
                    objects[r][c] = new Gas(r * 82 + 98, c * -500, speed);
                    addObject(objects[r][c], objects[r][c].getX(), objects[r][c].getY());
                }
                
                
            }
        }   
        
    }   

    public boolean checkProportion(double a, double b, double c, double d, double e){
        if (0 < (a + b + c + d + e) & (a + b + c + d + e) < 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getRaceSpeed(){
        return speed;
    }
    
    public void setRaceSpeed(int x){
        speed = x;
    }
    
    
    
    public void act()
    { 
        
    }
}
