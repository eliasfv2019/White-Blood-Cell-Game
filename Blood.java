import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blood extends Actor
{
    /**
     * Act - do whatever the Blood wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Blood(){

    }
    private int Speed = Greenfoot.getRandomNumber(4)+1;
    public void act() 
    {
        setLocation(getX()-Speed, getY());
        turn(1);

        if (getX() == 0) 
        {
            getWorld().removeObject(this);
        }

    }
}
