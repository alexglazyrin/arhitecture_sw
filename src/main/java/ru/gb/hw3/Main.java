package ru.gb.hw3;

public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Triangle();
        Shape shape4 = new Rectangle();

        shape1.create();
        shape2.create();
        shape3.create();
        shape4.create();

        Shape[] shapes = new Shape[]{shape1, shape2, shape3, shape4};
        calcAllS(shapes);
        calcAllP(shapes);

    }

    public static void calcAllS(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calcS();
        }
    }

    public static void calcAllP(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].calcP();
        }
    }
}
