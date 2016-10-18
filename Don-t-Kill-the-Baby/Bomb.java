import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    int speed = -5;
    
    public Bomb()
    {
    }
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        y -= speed;
       
        turn(3);
        
        if (getY() == 390 )
        {
            getWorld().removeObject( this );
            return;
        }
        
        setLocation( x, y );
    }    
    
}
