package ru.gb.hw2;

public class Archer extends Hero{

    //String type;
    WeaponFactory archerFactory = new BowFactory();
    //Weapon weapon = archerFactory.orderWeapon("Standart");

    protected Archer(int health, Weapon weapon) {
        super(health);
        archerFactory.orderWeapon("Standart") = weapon;
    }
    //BowFactory.createWeapon(type) = weapon;


    }







