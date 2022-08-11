import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public static int score1=0;
    public static int score2=0;
    
    /**
     * Constructor for objects of class menu.
     * 
     */
    
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("instrucciones.png");
    }
    
    public void act(){
    if (Greenfoot.isKeyDown("space")){
        score1=0;
        score2=0;
        Greenfoot.setWorld(new MyWorld());
    }  
    }
}

