// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 60, 185);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 402, 61);
        worm worm =  new  worm();
        addObject(worm, 245, 173);
        worm worm2 =  new  worm();
        addObject(worm2, 294, 314);
        crab.setLocation(54, 184);
        crab.setLocation(56, 177);
        crab.setLocation(101, 233);
        crab.setLocation(125, 173);
        worm worm3 =  new  worm();
        addObject(worm3, 130, 357);
        worm2.setLocation(226, 359);
        worm.setLocation(282, 363);
        worm worm4 =  new  worm();
        addObject(worm4, 340, 361);
        worm worm5 =  new  worm();
        addObject(worm5, 393, 358);
        lobster.setLocation(387, 184);
    }
}
