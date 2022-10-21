package ru.gb.hw3;

public class Square extends Shape implements ISquadTypeShape{

    public void create() {
        System.out.println("Создали квадрат");
    }

    public void calcS() {
        System.out.println("Посчитали площадь квадрата");
    }

    public void calcP() {
        System.out.println("Посчитали периметр квадрата");
    }
}
