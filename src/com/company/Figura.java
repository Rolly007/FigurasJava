package com.company;

abstract public class Figura {
    protected int dato1;

    public Figura(int dato1) {
        this.dato1 = dato1;
    }

    abstract public double calcularArea();
}
