package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Equipment extends Item{
    private String name;
    private int defence;
    private int magicDefence;
    private Apparel type;
    public Equipment(){
        name = null;
        defence = 0;
        magicDefence = 0;
        type = null;
    }
    public Equipment(String initName, int initDefence,
              int initMagicDefence, Apparel initType){
        name = initName;
        defence = initDefence;
        magicDefence = initMagicDefence;
        type = initType;
    }
    //region Mutator and accessor methods
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
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
    public Apparel getType(){
        return type;
    }
    public void setType(Apparel newType){
        type = newType;
    }
    //endregion
}
