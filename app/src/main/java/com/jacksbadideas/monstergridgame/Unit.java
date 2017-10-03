package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Unit {
    private int health;
    private int hp;
    private int mahnah;
    private int mp;
    private int attack;
    private int defence;
    private int magicDefence;
    public Unit(int initHealth, int initHp, int initMahnah,
                int initMp, int initAttack, int initDefence,
                int initMagicDefence){
        health = initHealth;
        hp = initHp;
        attack = initAttack;
        defence = initDefence;
        magicDefence = initMagicDefence;
        mahnah = initMahnah;
        mp = initMahnah;
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
    public int getMahnah(){
        return mahnah;
    }
    public void setMahnah(int newMahnah){
        mahnah = newMahnah;
    }
    public int getMp(){
        return mp;
    }
    public void setMp(int newMp){
        mp = newMp;
    }
    //endregion
}
