import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @mellisadmyn (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // Use addObject in the constructor of RobotWorld class 
        // 1. to add a robot
        Robot robot = new Robot();
        addObject(robot,48,50);

        // 2. to create a row of Bricks
        Wall wall = new Wall();
        addObject(wall,52,147);
        Wall wall2 = new Wall();
        addObject(wall2,159,147);
        Wall wall3 = new Wall();
        addObject(wall3,266,147);
        Wall wall4 = new Wall();
        addObject(wall4,587,147);
        Wall wall5 = new Wall();
        addObject(wall5,692,147);
        Wall wall6 = new Wall();
        addObject(wall6,791,147);

        // 3. to add a green Block
        Block block = new Block();
        addObject(block,427,145);

        // 4. to add a Home
        Home home = new Home();
        addObject(home,751,552);

        // 5. to add a Scorepanel
        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,71,554);

        // 6. to add 5 Pizza
        Pizza pizza = new Pizza();
        addObject(pizza,720,46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,433,38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,183,302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,682,312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,417,537);
    }
}
