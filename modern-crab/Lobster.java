// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        intDirection();
        addObject();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor Crab = getOneIntersectingObject(Crab.class);
        if (Crab != null) {
            World world = getWorld();
            world.removeObject(Crab);
            Greenfoot.playSound("horrorMetallic.mp3");
        }
    }

    /**
     * 
     */
    public void intDirection()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * 
     */
    public void addObject()
    {
        Actor worm = getOneIntersectingObject(worm.class);
        if (worm != null) {
            World world = getWorld();
            int xLocation = worm.getX();
            int yLocation = worm.getY();
            Actor lobster =  new  Lobster();
            world.removeObject(worm);
            world.addObject(lobster, xLocation, yLocation);
        }
    }
}
