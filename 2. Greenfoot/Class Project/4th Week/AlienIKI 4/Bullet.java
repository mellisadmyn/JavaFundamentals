import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @mellisa (your name) 
 * @version3_pertemuan6_02/11/2022 (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        bulletCollision(); //cek dulu, sebelum obj dihapus
        move(5);
    }
    
    private void bulletCollision()
    {
        if (isTouching(Enemy.class))
        {
            getWorld().addObject(
                new Explosion(),
                getX(),
                getY()
            );
            
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        }
        
        else if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
