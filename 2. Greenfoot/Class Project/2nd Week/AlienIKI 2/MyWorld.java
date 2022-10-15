import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @mellisa (your name) 
 * @version2_pertemuan4_5/10/2022 (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,73,202);

        Enemy enemy = new Enemy();
        addObject(enemy,565,108);

        Enemy enemy2 = new Enemy(5);
        addObject(enemy2,563,238);
    }
}
