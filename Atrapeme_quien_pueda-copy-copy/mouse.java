import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mouse extends Actor
{
    /**
     * Act - do whatever the mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    menu thisGame;
    
    
    public void act()
    {
    if (Greenfoot.isKeyDown("a"))
        {
            setImage("Ratón_izq.png");
            setRotation(0);
            move(-3);
        }    
    if (Greenfoot.isKeyDown("d"))
        {
            setImage("Ratón.png");
            setRotation(0);
            move(3);
        }
    if (Greenfoot.isKeyDown("w"))
        {
            setRotation(0);
            setImage("Ratón.png");
            setRotation(270);
            move(3);
        }
    if (Greenfoot.isKeyDown("s"))
        {
            setRotation(0);
            setImage("Ratón.png");
            setRotation(90);
            move(3);
        }
        Actor cheese;
        cheese=getOneObjectAtOffset(0,0,cheese.class);
    if (cheese !=null){
        Greenfoot.playSound("sonido.wav");
        getWorld().removeObject(cheese);
        thisGame.score1++;
    }
     Actor fence;
        fence=getOneObjectAtOffset(0,0,fence.class);
    if (fence !=null){
        move(-5);

    }
    }
}
