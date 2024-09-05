package br.edu.fatec.factory;

class Triangle implements Calculable{
    private double altura;
    private double largura;

    public Triangle(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return (altura * largura)/2;
    }

    @Override
    public String toString() {
        return "Triangle [altura=" + altura + "] + [largura=" + largura + "]";
    }
}
