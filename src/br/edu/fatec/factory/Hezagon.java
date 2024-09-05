package br.edu.fatec.factory;

class Hezagon implements Calculable{
    private double lado;

    public Hezagon(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return ((3 * Math.sqrt(3) * (lado * lado)) / 2);
    }

    @Override
    public String toString() {
        return "Square [lado=" + lado + "]";
    }
}
