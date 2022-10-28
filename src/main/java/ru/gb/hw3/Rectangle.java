package ru.gb.hw3;

public class Rectangle extends Shape implements ICalcS,ICalcP {

    public void create() {
        System.out.println("Создали прямоугольник");
    }

    public void calcS() {
        System.out.println("Посчитали площадь прямоугольника");
    }

    public void calcP() {
        System.out.println("Посчитали периметр прямоугольника");
    }
}
