package ru.gb.hw2;

public abstract class WeaponFactory {

    public Weapon orderWeapon(String type){
        Weapon weapon;
        weapon = createWeapon(type);
        return weapon;
    }

    abstract Weapon createWeapon(String type);

}
