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
    
    //Add a property called turnSpeed that stores an integer value
    private int turnSpeed;
    
    public void act()
    {
        // make a block so that it constantly rotates clockwise at a speed of turnSpeed
        int x = getRotation() + turnSpeed;
        if(x == 360){
            x = 0;
        }
        
        setRotation(x);
        turn(this.turnSpeed);
    }
    
    //Create a constructor in the Block class
    public Block(int maxTurnSpeed)
    {
        //sets the turnSpeed field to a random value between –maxTurnSpeed and up to +maxTurnSpeed
        this.turnSpeed = Greenfoot.getRandomNumber(maxTurnSpeed) - (maxTurnSpeed);
        
        //if the turnspeed is set to 0, it is changed to 1
    }
}
