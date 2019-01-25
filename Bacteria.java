import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 * 
 * @author Michael Kölling
 * @version 0.1
 */

public class Bacteria extends Actor
{

    /**
     * Constructor. Nothing to do so far.
     */

    public Bacteria()
    {
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
    private int Speed = Greenfoot.getRandomNumber(4)+1;
    public void act() 
    {
        setLocation(getX()-Speed, getY());
        turn(1);

        if (getX() == 0) 
        {
            getWorld().removeObject(this);
            Greenfoot.playSound("slurp.wav");
        }

    }
}
