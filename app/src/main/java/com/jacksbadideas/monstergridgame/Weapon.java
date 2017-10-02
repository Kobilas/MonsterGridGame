package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Weapon extends Item{
    private int attack;
    private int criticalChance;
    private int criticalDamage;
    private int statusChance;
    private int statusDamage;
    public Weapon(int initAttack, int initCriticalChance,
                  int initCriticalDamage, int initStatusChance,
                  int initStatusDamage){
        attack = initAttack;
        criticalChance = initCriticalChance;
        criticalDamage = initCriticalDamage;
        statusChance = initStatusChance;
        statusDamage = initStatusDamage;
    }
    //region Mutator and accessor methods
    public int getAttack(){
        return attack;
    }
    public void setAttack(int newAttack){
        attack = newAttack;
    }
    public int getCriticalChance(){
        return criticalChance;
    }
    public void setCriticalChance(int newCriticalChance){
        criticalChance = newCriticalChance;
    }
    public int getCriticalDamage(){
        return criticalDamage;
    }
    public void setCriticalDamage(int newCriticalDamage){
        criticalDamage = newCriticalDamage;
    }
    public int getStatusChance(){
        return statusChance;
    }
    public void setStatusChance(int newStatusChance){
        statusChance = newStatusChance;
    }
    public int getStatusDamage(){
        return statusDamage;
    }
    public void setStatusDamage(int newStatusDamage){
        statusDamage = newStatusDamage;
    }
    //endregion
}
