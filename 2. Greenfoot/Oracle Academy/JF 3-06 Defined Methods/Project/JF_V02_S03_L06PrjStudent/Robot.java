import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @mellisadmyn (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Add a call to method within act() of class.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
    }
    
    //Create a method called robotMovement
    public void robotMovement()
    {
        // will add the code for the robot movement in the next project section
    }
    
    //Create a method called detectWallCollision
    public void detectWallCollision()
    {
        //if the robot collides with a Wall instance, then it returns to the start.
        if (isTouching(Wall.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
        }
    }
    
    //Create a method called detectBlockCollision
    public void detectBlockCollision()
    {
        //the robot will return to the start, if it collides with an instance of a Block
        if (isTouching(Block.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
        }
    }
}
