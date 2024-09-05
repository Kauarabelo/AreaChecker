package br.edu.fatec.factory;

import java.util.ArrayList;
import java.util.List;

public enum ShapeType {
    SQUARE, RECTANGLE, CIRCLE, TRIANGLE, PARALLELOGRAM, TRAPEZO, HEXAGON, DIAMOND, CUBE;

    public ShapeType[] getShape() {
        List<ShapeType> shapeRetorno = new ArrayList<>();



        return shapeRetorno.toArray(new ShapeType[shapeRetorno.size()]);
    }
}


