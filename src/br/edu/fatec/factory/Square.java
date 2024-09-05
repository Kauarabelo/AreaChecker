package br.edu.fatec.factory;

class Square implements Calculable{
    private double lado;

    public Square(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Square [lado=" + lado + "]";
    }
}
