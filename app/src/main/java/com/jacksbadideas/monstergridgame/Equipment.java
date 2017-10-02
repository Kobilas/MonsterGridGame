package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Equipment {
    private String name;
    private int defence;
    private int magicDefence;
    private Apparel type;
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
