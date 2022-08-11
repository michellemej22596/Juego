import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hole extends Actor
{
    /**
     * Act - do whatever the hole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    menu thisGame;
    
    public void act()
    {
    Actor mouse;
        mouse=getOneObjectAtOffset(0,0,mouse.class);
        int mousescore= thisGame.score1;
    if (mouse !=null){
        if(mousescore==15){
        removeTouching(mouse.class); 
        Greenfoot.setWorld(new Ratongana());
    }
}
    Actor cat;
        cat=getOneObjectAtOffset(0,0,cat.class);
        int catscore= thisGame.score2;
    if (cat !=null){
        if(catscore==15){
        removeTouching(cat.class); 
        Greenfoot.setWorld(new Gatogana());
    }
    }
    }
}
