package ru.gb.hw3;

public class Circle extends Shape implements ICalcS, ICalcP {

    public void create() {
        System.out.println("Создали окружности");
    }

    public void calcS() {
        System.out.println("Посчитали площадь окружности");
    }

    public void calcP() {
        System.out.println("Посчитали длинну окружности");
    }


}
