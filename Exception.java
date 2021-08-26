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
public class Exception {
    public class Warrior extends Character{
    
    
     public Warrior(){
     
      super("","Warrior");
      super.life =100;
      super.strength = 10;
      super.agility= 8;
      super.wit =3;
    }
      @Override
     public String Attack(String weapon){
         
         super.Attack("");
          if (weapon.equals("Hammer") || weapon.equals("Sword") ){
          return "i will crush you with my "+weapon ;
        
     }
    return""; 
}
     public String moveForward(){
      
      return "Move forward";
      }
      public String moveBack(){
      
      return "Move back";
      }public String moveLeft(){
      
      return "Move left";
      }public String moveRight(){
      
      return "Move right";
      }
}
    public class Mage extends Character{
    
    
      public Mage(){
     
      super("","Mage");
      super.life =100;
      super.strength = 10;
      super.agility= 8;
      super.wit =3;
    }
      @Override
     public String Attack(String weapon){
         
         super.Attack("");
          if (weapon.equals("Magic") || weapon.equals("Wonde") ){
          return "Feel the power of  my "+weapon ;
        
     }
    return""; 
}
      public String moveForward(){
      
      return "Move forward";
      }
      public String moveBack(){
      
      return "Move back";
      }public String moveLeft(){
      
      return "Move left";
      }public String moveRight(){
      
      return "Move right";
      }
      
      
}
    interface  unsheathe{
  public void unsheathe();
  
}
public abstract class Character  implements unsheathe{
    
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

        /**
         *
         * @return
         */
      
        /**
         *
         * @param arg
         * @return
         */
        public String Attack(String arg){
    
          return "["+this.name+"] RRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
      }
    @Override
     public void unsheathe(){
     
     System.out.println("["+this.name+"] : unsheathes his weapon .");
     }
    }
    
}
