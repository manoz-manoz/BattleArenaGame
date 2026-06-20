package com.battle;
import java.util.*;


public class Archer extends Char{

   Map<String,String> specialAbilities=new HashMap<>();
   
    public Archer(String name,String c)
    {
        setName(name);
        setHealth(100);
        setAttackPower(25);
        setCharacter(c);
     
        
        
    }
  
}
