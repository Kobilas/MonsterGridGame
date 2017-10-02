package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Item {
    private int cost;

    public Item(){

    }
    public Item(int initCost){
        cost = initCost;
    }
    //region Mutator and accessor methods
    public int getCost(){
        return cost;
    }
    public void setCost(int newCost){
        cost = newCost;
    }
    //endregion
}
