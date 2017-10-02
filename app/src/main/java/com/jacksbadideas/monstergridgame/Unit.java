package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Unit {
    private int health;
    private int attack;
    private int defence;
    private int magicDefence;
    private boolean alive;
    public Unit(int initHealth, int initAttack, int initDefence, int initMagicDefence, boolean initAlive){
        health = initHealth;
        attack = initAttack;
        defence = initDefence;
        magicDefence = initMagicDefence;
        alive = initAlive;
    }
    public int getHealth(){
        return health;
    }
    public void setHealth(int newHealth){
        health = newHealth;
    }
    public int getAttack(){
        return attack;
    }
    public void setAttack(int newAttack){
        attack = newAttack;
    }
    public int getDefence(){
        return defence;
    }
    public void setDefence(int newDefence){
        defence = newDefence;
    }
    public int getMagicDefence(){
        return magicDefence;
    }
    public void setMagicDefence(int newMagicDefence){
        magicDefence = newMagicDefence;
    }
    public boolean isAlive(){
        return alive;
    }
    public void setAlive(boolean newAlive){
        alive = newAlive;
    }
}
