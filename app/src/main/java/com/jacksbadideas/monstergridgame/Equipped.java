package com.jacksbadideas.monstergridgame;

import java.util.ArrayList;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Equipped {
    private ArrayList<Equipment> equipped;
    public Equipped(){
        equipped = new ArrayList<Equipment>();
    }
    public Equipped(Equipment initEquipment){
        equipped = new ArrayList<Equipment>();
        equipped.add(initEquipment);
    }
    public void equip(Equipment newEquipment){
        equipped.add(newEquipment);
    }
    public boolean unequip(Equipment toRemove){
        return equipped.remove(toRemove);
    }
    public int getTotalDefence(){
        int totalDefence = 0;
        for(int i = 0; i < equipped.size(); i++)
            totalDefence += equipped.get(i).getDefence();
        return totalDefence;
    }
    public int getTotalMagicDefence(){
        int totalMagicDefence = 0;
        for(int i = 0; i < equipped.size(); i++)
            totalMagicDefence += equipped.get(i).getMagicDefence();
        return totalMagicDefence;
    }

}
