import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @mellisa (your name) 
 * @version3_pertemuan5_11/10/2022 (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveHero();
        shootBullet();
    }
    
    public void moveHero(){
        // Add your action code here.
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(), getY()-4);
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(), getY()+4);  
        if (Greenfoot.isKeyDown("A"))
            setLocation(getX()-4, getY());
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+4, getY());
    }
    
    int bulletTimer = 0;
    public void shootBullet()
    {
        if (bulletTimer == 30)
        {
            getWorld().addObject(
                new Bullet(),
                getX() + 5,
                getY()
            );
            
            bulletTimer = 0;
        }
        
        else
        {
            bulletTimer++;
        }
    }
}
