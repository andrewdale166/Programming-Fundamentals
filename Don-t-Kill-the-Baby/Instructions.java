import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         showText( "Use the Left and Right arrow keys to avoid the bombs!", 300, 100 );
         Button3 button3;
         button3 = new Button3();
         addObject ( button3, 180, 200 );
         showText( "Back", 250, 195);
    }
}
