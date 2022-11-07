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
        showStatus();
    }
    
    //GreenfootImage: create a GreenfootImage from another GreenfootImage
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage gameOver;
    private int lives;
    private int pizzaEaten;
    private int score;
    
    //Create a constructor method for the Robot class that assigns the two robot and game over images
    public Robot()
    {
        robotimage1 = new GreenfootImage("man01.png");
        robotimage2 = new GreenfootImage("man02.png");
        gameOver    = new GreenfootImage("gameover.png");
        
        //Create a property to store the number of lives. Set the lives to 3 in the constructor
        lives = 3;
        
        //Create a property called pizzaEaten to store the number of Pizza eaten. Set pizzaEaten to 0 in the constructor
        pizzaEaten = 0;
        
        //Create a property in Robot called score to store the number of score. Set the score to 0 in the constructor
        score = 0;
    }
    
    //Create a method called robotMovement
    public void robotMovement()
    {
        //will allow the player to move the robot up, down, left and right. Also, will only animate when moving
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-2);
            animate();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
            animate();
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
            animate();
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
            animate();
        }
    }
    
    //Create a method called detectWallCollision
    public void detectWallCollision()
    {
        //if robot collides with a Wall instance, then it returns to the start, the wav sound file hurt.wav is played, and lives decresed
        if (isTouching(Wall.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
            Greenfoot.playSound("hurt.wav"); 
            removeLife(); 
        }
    }
    
    //Create a method called detectBlockCollision
    public void detectBlockCollision()
    {
        //the robot will return to the start, if it collides with an instance of a Block, sound file hurt.wav is played, and lives decresed
        if (isTouching(Block.class))
        {
            setLocation(48,50); //48 and 50 are the start of Robot
            Greenfoot.playSound("hurt.wav");
            removeLife(); 
        }
    }
    
    //Create a method called detectHome
    public void detectHome()
    {
        //if we reach home and all Pizza instances have been eaten, will increase the score, plays the wav sound file yipee.wav, and returns you to the start
        if (isTouching(Home.class) && pizzaEaten==5)
        {
                increaseScore();
                Greenfoot.playSound("yipee.wav");
                setLocation(48,50); //48 and 50 are the start of Robot
                
                //if all pizza already eaten, reset the pizza counter to 0
                pizzaEaten=0;
        }
    }
    
    //Create a method called eatPizza
    public void eatPizza()
    {
        //if collide with a pizza instance, it removes it, plays the wav sound file eat.wav, and pizzaEaten is incremented by 1
        if (isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    
    //Create a method called animate
    public void animate()
    {
        /*
         * create code that represents this pseudo code
            If current image displayed equals robot1 image then
                set image as robot2
            Else 
                set image as robot1
         */
        
        if (getImage().equals(robotimage1))
        {
            setImage(robotimage2);
        }
        
        else
        {
            setImage(robotimage1);
        }
    }
    
    //Create a method called removeLife
    public void removeLife()
    {
        //we decrease the number of lives by one
        lives=lives-1;
        
        testEndGame();
        showStatus();
    }
    
    //Create a method called testEndGame
    public void testEndGame()
    {
        //if the number of lives is less than 0, then called gameover image and the game ends
        if (lives < 0)
        {
            setImage(gameOver);
            Greenfoot.stop();
        }
    }
    
    //Create a method called increaseScore
    public void increaseScore()
    {
        //increase the score every time we reach home and all the pizza is eaten
        if (pizzaEaten==5)
        {
            score++;
        }
        showStatus();
    }
    
    //Create a method called showStatus
    public void showStatus()
    {
        //will display the number of lives, pizza eaten, and score to the scorepanel
        getWorld().showText("Lives : "+lives,71,530);
        getWorld().showText("Pizza : "+pizzaEaten,71,555);
        getWorld().showText("Score : "+score,71,580);
    }
}
