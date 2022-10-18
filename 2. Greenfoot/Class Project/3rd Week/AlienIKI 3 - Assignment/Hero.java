import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @mellisa (your name) 
 * @version3_pertemuan5 assignment_11/10/2022 (a version number or a date)
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
        heroTouch();
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
        if (bulletTimer == 15)
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
    
    public void heroTouch()
    {
        if (isTouching(Enemy.class))
        {
            MyWorld world; // deklarasiin variable baru, yang akan ngasih referensi ke MyWorld
            world = (MyWorld)getWorld(); // menggunakan get world untuk mendapatkan referensi ke objek tempat objek tersebut berada            
            world.updatelife();
            
            World affterEffect = getWorld();
            affterEffect.addObject(new Smoke(),getX(),getY());
            removeTouching(Enemy.class);
            
            setLocation(73,202); // taruh balik hero ke tempat yang paling awal
        }
    }
}
