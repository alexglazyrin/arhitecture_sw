package ru.gb.hw2;

public class Archer extends Hero {
    private Weapon weapon;

    BowFactory bowFactory = new BowFactory();

    protected Archer(int health, ArmorType type, BowType bType) {
        super(health,type);
        this.weapon = bowFactory.createWeapon(bType);
    }
}







