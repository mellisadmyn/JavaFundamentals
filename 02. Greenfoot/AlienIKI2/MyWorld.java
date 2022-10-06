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
        enemy.setLocation(453,222);
        Enemy enemy2 = new Enemy(10);
        addObject(enemy2,300,205);
        enemy2.setLocation(296,88);
        enemy2.setLocation(435,113);
        hero.setLocation(79,72);
        enemy2.setLocation(504,89);
        enemy2.setLocation(610,80);
        enemy2.setLocation(550,93);
        hero.setLocation(69,48);
        enemy.setLocation(471,157);
        enemy.setLocation(545,293);
        enemy2.setLocation(463,105);
        enemy.setLocation(510,224);
        enemy.setLocation(569,226);
        hero.setLocation(57,184);
        enemy.setLocation(545,329);
        enemy2.setLocation(477,142);
        enemy2.setLocation(448,117);
        enemy2.setLocation(449,97);
    }
}
