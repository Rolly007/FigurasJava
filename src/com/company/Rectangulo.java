package com.company;

public class Rectangulo extends Figura {
    private int altura;

    public Rectangulo(int dato1, int dato2) {
        super(dato1);
        this.altura = dato2;
    }

    public double calcularArea() {
        int area;
        area = dato1 * altura;
        return area;
    }
}
