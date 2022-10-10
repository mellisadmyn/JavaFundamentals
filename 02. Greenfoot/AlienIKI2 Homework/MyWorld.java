import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        hero.setLocation(126,199);

        Enemy enemy = new Enemy();
        addObject(enemy,485,195);
        enemy.setLocation(502,324);

        Enemy enemy2 = new Enemy(5);
        addObject(enemy2,462,82);
        enemy.setLocation(509,198);
        enemy.setLocation(526,219);
        enemy.setLocation(566,203);
        enemy2.setLocation(530,54);
        enemy.setLocation(548,337);
        Enemy enemy3 = new Enemy(3);
        addObject(enemy3,461,203);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,412,130);
        enemy3.setLocation(487,265);
        enemy4.setLocation(429,144);
        enemy3.setLocation(479,239);
        enemy.setLocation(421,358);
        enemy3.setLocation(548,302);
        enemy4.setLocation(500,228);
        enemy2.setLocation(415,50);
        Enemy enemy5 = new Enemy(8);
        addObject(enemy5,544,127);
        enemy5.setLocation(542,126);
        enemy4.setLocation(466,213);
    }
}
