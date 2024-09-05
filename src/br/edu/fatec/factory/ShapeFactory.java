package br.edu.fatec.factory;

interface ShapeFactory{
        Calculable getShape(ShapeType type, Double[] values);

}
