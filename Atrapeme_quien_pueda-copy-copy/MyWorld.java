import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    menu thisGame;
     Actor cheese;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setBackground("f2.png"); 
           
    for(int i=0; i<15; i++){
        int x= Greenfoot.getRandomNumber(getWidth());
        int y= Greenfoot.getRandomNumber(getHeight());
        addObject(new wool(), x, y);
    }
    for(int i=0; i<15; i++){
        int x= Greenfoot.getRandomNumber(getWidth());
        int y= Greenfoot.getRandomNumber(getHeight());
        addObject(new cheese(), x, y);
    }
    for(int i=0; i<10; i++){
        int x= Greenfoot.getRandomNumber(getWidth());
        int y= Greenfoot.getRandomNumber(getHeight());
        addObject(new fence(), x, y);
    }
    addObject(new mouse(), 100, 100);
    addObject(new cat(), 150, 150);
    addObject(new hole(), 750, 50);
    
    }
    public void act()
    {
        showText("Mouse's score: "+ thisGame.score1, 90, 40);
        showText("Cat's score: "+ thisGame.score2, 75, 20);
        if (Greenfoot.isKeyDown("z")){
        Greenfoot.setWorld(new salir());
        Greenfoot.playSound("gameover.wav");
        Greenfoot.stop();
    }  
    }
}
