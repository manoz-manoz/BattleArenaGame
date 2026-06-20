package com.battle;
import java.util.*;
public class Main {
    static Scanner sc=new Scanner(System.in);
    
       
    public static void  main(String ar[])
    {
        Char p1=null;
        Char p2=null;
        p1=createPlayer(p1);
        System.out.println("Player1 created as "+p1.getName());
        p2=createPlayer(p2);
        System.out.println("Palyer2 created as "+p2.getName());
         System.out.println("========= BATTLE STARTS =========");
        
        while (p1.getHealth() > 0 && p2.getHealth() > 0)
{
    p1.selectAttack(p2);

    if (p2.getHealth() <= 0 )
    {
       displayWinner(p1,p2);
        break;
    }
     if (p1.getHealth() <= 0 )
    {
       displayWinner(p2,p1);
        break;
    }
     System.out.println("-------------------");
    System.out.println(p1.getName() + " Health: " + p1.getHealth());
    System.out.println(p2.getName() + " Health: " + p2.getHealth());
    p2.selectAttack(p1);

     if (p2.getHealth() <= 0 )
    {
       displayWinner(p1,p2);
        break;
    }
     if (p1.getHealth() <= 0 )
    {
       displayWinner(p2,p1);
        break;
    }

    System.out.println("-------------------");
    System.out.println(p1.getName() + " Health: " + p1.getHealth());
    System.out.println(p2.getName() + " Health: " + p2.getHealth());
}
        
        
       

        

    }
    public static Char  createPlayer(Char c)
    {
        
        
       
        System.out.println("========= Enter Player name =========");
        String playername=sc.nextLine();
         System.out.println("========= Choose Character =========");
            System.out.println("1. Warrior");
            System.out.println("2. Maze");
            System.out.println("3.Archer");
            int n=sc.nextInt();
             sc.nextLine();
            switch(n)
            {
                case 1: c=new Warrior(playername,"Warrior");
                        
                break;
                case 2: c=new Maze(playername,"Warrior");
                        
                break;
                case 3: c=new Archer(playername,"Warrior");
                     
                break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice ");
                    return createPlayer(c);

            }
          
            return c;

        }
    
        public static void displayWinner(Char p1,Char p2)
        {
           
            
            System.out.println(p2.getName() + " died!");
            System.out.println(p1.getName() + " wins!");
        }
}