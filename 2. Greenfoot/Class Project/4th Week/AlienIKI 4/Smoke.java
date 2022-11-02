import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smoke here.
 * 
 * @mellisa (your name) 
 * @version3_pertemuan6_02/11/2022 (a version number or a date)
 */
public class Smoke extends Actor
{
    /**
     * Act - do whatever the Smoke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        smoke();
    }
    
    private int smokeTimer = 0;
    
    private void smoke()
    {
        if (smokeTimer == 60){
            getWorld().removeObject(this);
        }
        
        else{
            smokeTimer++;
        }
    }
}
