package br.edu.fatec.factory;

class Parallelogram implements Calculable{
    private double altura;
    private double largura;

    public Parallelogram(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public String toString() {
        return "Parallelogram [altura =" + altura + "] + [largura =" + largura + "]";
    }
}
