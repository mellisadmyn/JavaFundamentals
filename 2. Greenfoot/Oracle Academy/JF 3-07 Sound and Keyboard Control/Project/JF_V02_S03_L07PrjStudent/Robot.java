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
        detectHome();
        eatPizza();
    }
    
    //Create a method called robotMovement
    public void robotMovement()
    {
        //will allow the player to move the robot up, down, left and right
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
        }
    }
    
    //Create a method called detectWallCollision
    public void detectWallCollision()
    {
        //if the robot collides with a Wall instance, then it returns to the start and the wav sound file hurt.wav is played
        if (isTouching(Wall.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
            Greenfoot.playSound("hurt.wav"); 
        }
    }
    
    //Create a method called detectBlockCollision
    public void detectBlockCollision()
    {
        //the robot will return to the start, if it collides with an instance of a Block and sound file hurt.wav is played
        if (isTouching(Block.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
            Greenfoot.playSound("hurt.wav");
        }
    }
    
    //Create a method called detectHome
    public void detectHome()
    {
        //if you collide with the Home instance it returns you to the start and plays the wav sound file yippee.wav
        if (isTouching(Home.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
            Greenfoot.playSound("yipee.wav");
        }
    }
    
    //Create a method called eatPizza
    public void eatPizza()
    {
        //if collide with a pizza instance it removes it and plays the wav sound file eat.wav
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
    }
}
