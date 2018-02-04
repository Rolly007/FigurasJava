package com.company;

import static java.lang.Math.*;

public class Cuadrado extends Figura {
    public Cuadrado(int dato1) {
        super(dato1);
    }

    public double calcularArea() {
        double res;
        return res = Math.pow(dato1, 2);
    }
}
