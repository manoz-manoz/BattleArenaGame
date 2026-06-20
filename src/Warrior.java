package com.battle;
import java.util.*;
public class Warrior extends Char{
  Map<String,String> specialAbilities=new HashMap<>();
  ArrayList<Integer> abiltyValues= new ArrayList<>();
  Scanner sc=new Scanner(System.in);
    public Warrior(String name,String c)
    {
        setName(name);
        setHealth(100);
        setAttackPower(20);
        setCharacter(c);
        
        
    }



}
    
    
 




    

