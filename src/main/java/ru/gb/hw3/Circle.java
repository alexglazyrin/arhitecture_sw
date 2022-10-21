package ru.gb.hw3;

public class Circle extends Shape implements ICircle{

    public void create() {
        System.out.println("Создали окружности");
    }

    public void calcS() {
        System.out.println("Посчитали площадь окружности");
    }

    public void calcPr() {
        System.out.println("Посчитали длинну окружности");
    }


}
