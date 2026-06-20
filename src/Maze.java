package com.battle;

import java.util.HashMap;
import java.util.Map;

public class Maze extends Char{
   Map<String,String> specialAbilities=new HashMap<>();

    public Maze(String name,String c)
    {
        setName(name);
        setHealth(100);
        setAttackPower(30);
        setCharacter(c);
        
    }

}
