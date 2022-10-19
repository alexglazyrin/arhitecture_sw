package ru.gb.hw2;

public class ArmorFactory {
    private static Armor armor;

    public static Armor createArmor(ArmorType type){

        switch (type){
            case ELF:
                armor = new ElfArmor(100);
                break;
            case STANDART:
                armor = new StandartArmor(50);
                break;
            case DWARF:
                armor = new DwarfArmor(250);
                break;
            case BAD:
                armor = new BadArmor(80);
        }
        return armor;
    }
}
