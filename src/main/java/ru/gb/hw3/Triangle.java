package ru.gb.hw3;

public class Triangle extends Shape implements ISquadTypeShape{

    public void create() {
        System.out.println("Создали треугольник");
    }

    public void calcS() {
        System.out.println("Посчитали площадь треугольника");
    }

    public void calcP() {
        System.out.println("Посчитали периметр треугольника");
    }
}
