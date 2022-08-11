import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ratongana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ratongana extends World
{

    /**
     * Constructor for objects of class Ratongana.
     * 
     */
    public Ratongana()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
        Greenfoot.playSound("ganar.wav");
        Greenfoot.stop();
        }
}
