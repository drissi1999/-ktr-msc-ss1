/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epitec;

/**
 *
 * @author Drissi EL houcine
 */
public abstract class Character {
    
    protected String name;
    protected int life ;
    protected int agility;
    protected int strength;
    protected int wit;
    public static final String RPGClass ="";
 
      public Character(String name, String RPGClass){

           this.name = name;
           RPGClass = RPGClass;
           this.life = 50;
           this.agility = 2;
           this.strength =2;
           this.wit = 2;

      } 

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public static String getRPGClass() {
        return RPGClass;
    }

      public String Attack(String arg){
    
          return "["+this.name+"] RRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
      }
 
}
