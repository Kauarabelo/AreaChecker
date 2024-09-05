package br.edu.fatec.factory;

class Circle implements Calculable{
    private double lado;

    public Circle(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.PI*(lado * lado);
    }

    @Override
    public String toString() {
        return "Circle [lado=" + lado + "]";
    }
}
