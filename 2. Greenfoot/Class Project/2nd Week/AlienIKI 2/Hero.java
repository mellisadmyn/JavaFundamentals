import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @mellisa (your name) 
 * @version2_pertemuan4_5/10/2022 (a version number or a date)
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
}
