package com.jacksbadideas.monstergridgame;

import java.util.ArrayList;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Equipped {
    private ArrayList<Equipment> equipped;
    private ArrayList<Weapon> equippedWeapon;

    public Equipped(){
        equipped = new ArrayList<Equipment>();
        equippedWeapon = new ArrayList<Weapon>();
    }
    public Equipped(Equipment initEquipment){
        equipped = new ArrayList<Equipment>();
        equipped.add(initEquipment);
        equippedWeapon = new ArrayList<Weapon>();
    }
    public Equipped(Weapon initWeapon){
        equippedWeapon = new ArrayList<Weapon>();
        equippedWeapon.add(initWeapon);
        equipped = new ArrayList<Equipment>();
    }
    public Equipped(Equipment initEquipment, Weapon initWeapon){
        equipped = new ArrayList<Equipment>();
        equipped.add(initEquipment);
        equippedWeapon = new ArrayList<Weapon>();
        equippedWeapon.add(initWeapon);
    }
    public void equip(Equipment newEquipment){
        equipped.add(newEquipment);
    }
    public boolean unequip(Equipment toRemove){
        return equipped.remove(toRemove);
    }
    public void equip(Weapon newWeapon){
        equippedWeapon.add(newWeapon);
    }
    public boolean unequip(Weapon toRemove){
        return equippedWeapon.remove(toRemove);
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
    public int getTotalAttack() {
        int totalAttack = 0;
        for (int i = 0; i < equippedWeapon.size(); i++)
            totalAttack += equippedWeapon.get(i).getAttack();
        return totalAttack;
    }
}
