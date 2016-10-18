import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeypress();
        if ( isTouching( Bomb.class ) )
        {
            getWorld().showText( "You killed the baby", 200, 50 );
            Greenfoot.playSound( "baby.wav" );
            Greenfoot.playSound( "boom.wav" );
            Greenfoot.stop();
        }
    }
     public void checkKeypress() 
    {
        int x = getX();
        int y = getY();
        int speed = 5;
        
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            x += speed;
        }
        
        
        setLocation( x, y );
    }
}
