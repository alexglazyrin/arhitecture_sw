package ru.gb.hw3;

public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Circle();
        Shape shape2 = new Square();
        Shape shape3 = new Triangle();

        shape1.create();
        shape2.create();
        shape3.create();

        Shape[]shapes = new Shape[]{shape1, shape2, shape3};
        calcAllS(shapes);
        calcAllP(shapes);

    }



    public static void calcAllS(Shape[] shapes) {
        for(int i = 0; i < shapes.length; i++){
            shapes[i].calcS();
        }
    }

    public static void  calcAllP(Shape[] shapes){
        for(int i = 0; i < shapes.length; i++){
            if(shapes[i] instanceof ICircle){
                ((ICircle) shapes[i]).calcPr();
            }
            if(shapes[i] instanceof ISquadTypeShape){
                ((ISquadTypeShape) shapes[i]).calcP();
            }
        }
}
}
