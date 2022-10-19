package ru.gb.hw2;

public class Hero {
    private int health;
    private Armor armor;


    public Hero(int  health, ArmorType type){
        this.health = health;
        this.armor = ArmorFactory.createArmor(type);
    }


}
