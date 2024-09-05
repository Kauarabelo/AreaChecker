package br.edu.fatec.factory;

import java.awt.*;

class Rectangle implements Calculable {
    private double altura;
    private double largura;

    public Rectangle(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public String toString() {
        return "Rectangle [altura =" + altura + "] + [largura =" + largura + "]";
    }
}
