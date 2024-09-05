package br.edu.fatec.factory;

class Trapezo implements Calculable{
    private double larguraMenor;
    private double larguraMaior;
    private double altura;

    public Trapezo(double larguraMenor, double larguraMaior, double altura) {
        this.larguraMaior = larguraMaior;
        this.larguraMenor = larguraMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((larguraMaior + larguraMenor) * altura)/2;
    }

    @Override
    public String toString() {
        return "Trapezo [larguraMaior=" + larguraMaior + "] + Trapezo [larguraMenor=" + larguraMenor + "] + Trapezo [altura=" + altura + "]";
    }
}
