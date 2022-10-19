package ru.gb.hw2;

public class Bow extends Weapon {

    private int distance;

    protected Bow(int range, int distance){
        super(range);
        this.distance = distance;
    }
}
