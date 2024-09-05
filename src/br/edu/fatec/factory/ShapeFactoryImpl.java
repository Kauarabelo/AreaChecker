package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {


    @Override
    public Calculable getShape(ShapeType type, Double[] values) {

        Calculable calculo = null;

        switch (type) {
            case CIRCLE:
               calculo = new Circle(values[0]);
            break;
            case RECTANGLE:
                calculo = new Rectangle(values[0], values[1]);
            break;
            case SQUARE:
                calculo = new Square(values[0]);
            break;
            case TRIANGLE:
                calculo = new Triangle(values[0], values[1]);
            break;
            case CUBE:
                calculo = new Cube(values[0]);
            break;
            case DIAMOND:
                calculo = new Diamond(values[0], values[1]);
            break;
            case HEXAGON:
                calculo = new Hezagon(values[0]);
            break;
            case TRAPEZO:
                calculo = new Trapezo(values[0], values[1], values[2]);
            break;
            case PARALLELOGRAM:
                calculo = new Parallelogram(values[0], values[1]);
            break;


        }
        return calculo;
    }
}
