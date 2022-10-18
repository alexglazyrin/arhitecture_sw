package ru.gb.hw2;

public abstract class Sword extends Weapon{
    private int quality;

    protected Sword(int range, int quality){
        super(range);
        this.quality = quality;
    }

}
