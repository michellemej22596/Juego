import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cat extends Actor
{
    menu thisGame;
    /**
     * Act - do whatever the cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    if (Greenfoot.isKeyDown("left"))
        {
            setImage("Gato_izq.png");
            setRotation(0);
            move(-3);
        }    
    if (Greenfoot.isKeyDown("right"))
        {
            setImage("Gato.png");
            setRotation(0);
            move(3);
        }
    if (Greenfoot.isKeyDown("up"))
        {
            setImage("Gato.png");
            setRotation(270);
            move(3);
        }
    if (Greenfoot.isKeyDown("down"))
        {
            setImage("Gato.png");
            setRotation(90);
            move(3);
        }
        Actor wool;
        wool=getOneObjectAtOffset(0,0,wool.class);
    if (wool !=null){
        Greenfoot.playSound("sonido.wav");
        getWorld().removeObject(wool);
        thisGame.score2++;

    }
    Actor fence;
        fence=getOneObjectAtOffset(0,0,fence.class);
    if (fence !=null){
        move(-5);

    }
}
}
