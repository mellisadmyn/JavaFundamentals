import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @mellisa (your name) 
 * @version3_pertemuan6_02/11/2022 (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy()
    {
        setRotation(180);
        //turn​(180);
    }
    
    public Enemy(int speedInput){ //parameter
        setRotation(180);
        this.speed = speedInput; //make a different speed
    }
    
    private int speed = 3; //attribute
    
    public void act()
    {
        // Add your action code here.
        move(speed);
        moveEnemy();
    }
    
    protected void moveEnemy() //protected is subclasses can accses superclass
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
