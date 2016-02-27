import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    /**
    * move - overloaded to support function call with no variables
    * passed in. Moves an animal one space.
    */
    public void move()
    {
        super.move(1);
    }
    /**
     * atWorldEdge - Tells the animal if they are at the egde of the world.
     * changes method name to match teaching material.
     */
    public boolean atWorldEdge(){
        return super.isAtEdge();
    }
   /**
    * canSee - Returns true is we can see an object of class clss right where we are.
    */
   boolean canSee (java.lang.Class clss){
       return super.isTouching(clss);
   }
   /**
    * eat - Try to eat an object of class clss
    */
   void eat (java.lang.Class clss){
       if (super.isTouching(clss) {
           super.removeTouching(clss);
        } 
    }
}
