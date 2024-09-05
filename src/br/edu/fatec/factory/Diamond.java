package br.edu.fatec.factory;

class Diamond implements Calculable{
    private double altura;
    private double largura;

    public Diamond(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return (altura * largura)/2;
    }

    @Override
    public String toString() {
        return "Diamond [altura=" + altura + "] + [largura=" + largura + "]";
    }
}
