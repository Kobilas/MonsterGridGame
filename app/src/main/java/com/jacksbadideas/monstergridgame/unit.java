package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class unit {
    private int health;
    private int attack;
    private int defence;
    private int magicDefence;
    private bool alive;
    public unit(int initHealth, int initAttack, int initDefence, int initMagicDefence, bool initAlive){
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
    public bool isAlive(){
        return alive;
    }
    public void setAlive(bool newAlive){
        alive = newAlive;
    }
}
