package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Unit {
    private int health;
    private int hp;
    private int attack;
    private int defence;
    private int facing; // 0 is east, 3 is south
    private int magicDefence;
    public Unit(int initHealth, int initHp, int initAttack,
                int initDefence, int initMagicDefence,
                int initFacing){
        health = initHealth;
        attack = initAttack;
        defence = initDefence;
        magicDefence = initMagicDefence;
        hp = initHp;
        facing = initFacing;
    }
    //region Mutator and accessor methods
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
    public int getHp(){
        return hp;
    }
    public void setHp(int newHp){
        hp = newHp;
    }
    public int getFacing(){
        return facing;
    }
    public void setFacing(int newFacing){
        facing = newFacing;
    }
    //endregion
    public int attack(int direction){
        return direction;
    }
}
