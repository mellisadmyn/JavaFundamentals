import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @mellisadmyn (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // make a block so that it constantly rotates clockwise at a speed of 2
        int x = getRotation() + 2;
        if(x == 360){
            x = 0;
        }
        setRotation(x);
    }
}
