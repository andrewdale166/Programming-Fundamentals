import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void gotoGame()
    {
        MyWorld nextState = new MyWorld();
        Greenfoot.setWorld( nextState );
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
           gotoGame();
        }
    }    
}
