package ru.gb.hw2;

public class BowFactory extends WeaponFactory{

    Weapon createWeapon(String item){
        if(item.equals("Standart")){
            return new StandartBow(100,10);
        }else if(item.equals("ElfBow")){
            return new ElfBow(200,50);
        }else{
            return null;
        }
    }

    /*public Weapon createBow(){

        Weapon weapon = new Bow(String bowType);
        return weapon;
    }*/
}
