package ru.gb.hw2;

public class BowFactory extends WeaponFactory {
    private static Weapon weapon;

    public static Weapon createWeapon(BowType type){

        switch (type){
            case ELF:
                weapon = new ElfBow(50, 200);
                break;
            case STANDART:
                weapon = new StandartBow(30, 170);
                break;
        }
        return weapon;
    }

}
