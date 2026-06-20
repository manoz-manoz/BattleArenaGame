package com.battle;
import java.util.*;
public abstract class Char{
    private String name;
    private int health=100;
    private int healCounter=2;
    private int attackPower;
    private String character;
    Scanner sc=new Scanner(System.in);

   protected void attack(Char ch)
{
    
    int damage = (int)(Math.random() *5)+1;

    ch.health -= this.attackPower-damage;

    System.out.println(this.name + " attacked "+ch.getName()+" for " + (this.attackPower-damage) + " damage");
}
    protected boolean alive()
    {
        if(this.health<=0)
            return false;
        return true;
    }
    protected void display()
    {
        System.out.println("Player Name : "+this.name+"\tCharacter : "+this.character+"\tHealth : "+this.health+"\tAttack Power: "+this.attackPower);
  
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health=health;
    }

  
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
    public void selectAttack(Char c)
    {
           
        System.out.println("=========  "+this.name.toUpperCase()+"  Turn Select Action =========");
        System.out.println("1. Attack");
        System.out.println("2. Heal +25 (Health < 40)");
        System.out.println("3. Give Up");

        int n=sc.nextInt();
        switch(n)
        {
            case 1:attack(c);
                    break;
            case 2:if(this.health<40){
                if(healCounter>0){
                this.health+=25;
                healCounter--;
                System.out.println(this.name+" Healed.");
                System.out.println(this.getName() + " Health: " + this.getHealth());
                System.out.println(c.getName() + " Health: " + c.getHealth());

                }
                else
                    System.out.println("no heals remaining");
            }
                else
                    System.out.println("You can't heal right now!");
                selectAttack(c);
                break;
            case 3:
                this.setHealth(0);
                break;
            default:
                System.out.println("Enter a valid choice");

        }



    }



}