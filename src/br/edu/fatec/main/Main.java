package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        Double[] squareTest = {5.0};
        Calculable calculable = factory.getShape(ShapeType.SQUARE, squareTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] circleTest = {5.0};
        calculable = factory.getShape(ShapeType.CIRCLE, circleTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] rectangleTest = {5.0, 6.0};
        calculable = factory.getShape(ShapeType.RECTANGLE, rectangleTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] cubeTest = {5.0};
        calculable = factory.getShape(ShapeType.CUBE, cubeTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] diamondTest = {5.0, 6.0};
        calculable = factory.getShape(ShapeType.DIAMOND, diamondTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] hezagonTest = {5.0};
        calculable = factory.getShape(ShapeType.HEXAGON, hezagonTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] parallelogramTest = {5.0, 6.0};
        calculable = factory.getShape(ShapeType.PARALLELOGRAM, parallelogramTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] trapezoTest = {5.0, 6.0, 3.0};
        calculable = factory.getShape(ShapeType.TRAPEZO, trapezoTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

        Double[] triangleTest = {5.0, 6.0};
        calculable = factory.getShape(ShapeType.TRIANGLE, triangleTest);
        System.out.println(calculable + " - Área: " + calculable.calcularArea());

    }
}