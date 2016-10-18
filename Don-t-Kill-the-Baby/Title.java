import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText( "Don't Kill the Baby!", 300, 100 );
        showText( "Play", 250, 195);
        showText( "Instructions", 285, 300);
        Button button;
        Button2 button2;
        button2 = new Button2();
        addObject ( button2, 180, 300);
        button = new Button();
        addObject ( button, 180, 200);
        
        
        
    }
    public void gotoGame()
    {
        MyWorld nextState = new MyWorld();
        Greenfoot.setWorld( nextState );
    }
    public void act()
    {
       
    }
}
