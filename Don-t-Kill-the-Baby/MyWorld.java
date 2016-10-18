import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    Player player;
    Bomb bomb;
    
    
    int time = 0;

    public MyWorld()
    {    
        super(600, 400, 1); 
        player = new Player();
        addObject ( player, 300, 360);
        

        
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 5)
        {
            addObject(new Bomb(), Greenfoot.getRandomNumber(600), 0 );
        }
        time = time + 1;
        if (time == 2000)
        {
            showText( "You didn't kill the baby!", 200, 50 );
            Greenfoot.stop();
        }
    }
}
