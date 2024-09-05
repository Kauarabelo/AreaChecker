package br.edu.fatec.factory;

class Cube implements Calculable{
    private double lado;

    public Cube(double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
    }

    @Override
    public String toString() {
        return "Cube [lado=" + lado + "]";
    }
}
