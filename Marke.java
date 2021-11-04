import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Marke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Marke extends Actor

{
    
     public Marke()
    {
        setImage("images/marke.png");
        
    }
    
    public void drehe(String richtung)
    {
        if(richtung=="rechts")
        {
            setRotation(getRotation()+10);
        }
      
        }
    
    
    /**
     * Act - do whatever the Marke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        drehe("rechts");
    }    
}
