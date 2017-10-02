package com.jacksbadideas.monstergridgame;

/**
 * Created by Matthew on 10/2/2017.
 */

public class Grid {
    private Object[][] grid;
    private int xSize;
    private int ySize;
    public Grid(int initXSize, int initYSize){
        grid = new Object[initXSize][initYSize];
        xSize = initXSize;
        ySize = initYSize;
    }
    public int getXSize(){
        return xSize;
    }
    public int getYSize(){
        return ySize;
    }
    public boolean isOccupied(int x, int y){
        if(grid[x][y] == null) return false;
        else return true;
    }
    public void spawn(Unit newUnit, int x, int y){
        grid[x][y] = newUnit;
    }
    public void create(Hazard newHazard, int x, int y){
        grid[x][y] = newHazard;
    }
}
