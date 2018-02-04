package com.company;

public class Circulo extends Figura {

    public Circulo(int dato1) {
        super(dato1);
    }

    public double calcularArea() {
        double res;
        return res = (Math.PI * (Math.pow(dato1, 2)));
    }
}
