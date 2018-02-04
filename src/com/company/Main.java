package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teclado in = new Teclado();
        while (true) {
            System.out.println("1.Calcular Area de un Rectangulo");
            System.out.println("2.Calcular Area de un Cuadrado");
            System.out.println("3.Calcular Area de un Circulo");
            System.out.println("4.Salir");

            int opcion = in.getInt("Selecciona una Opcion...");
            opciones(opcion);
        }
    }

    public static void opciones(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la base del Rectangulo :");
                Scanner scanner = new Scanner(System.in);
                String datoa = scanner.nextLine();
                int base = Integer.parseInt(datoa);
                System.out.println("Ingrese la altura del Rectangulo :");
                Scanner scanner1 = new Scanner(System.in);
                String datob = scanner1.nextLine();
                int altura = Integer.parseInt(datob);
                Rectangulo r1 = new Rectangulo(base, altura);
                System.out.println("El Area del rectangulo es :" + r1.calcularArea());
                System.out.println("****************************************************");
                break;
            case 2:
                System.out.println("Ingrese el valor de cualquier lado del cuadrado :");
                Scanner scanner2 = new Scanner(System.in);
                String datoc = scanner2.nextLine();
                int lado = Integer.parseInt(datoc);
                Cuadrado cuadrado = new Cuadrado(lado);
                System.out.println("El area del Cuadrado es :" + cuadrado.calcularArea());
                System.out.println("****************************************************");
                break;
            case 3:
                System.out.println("Ingrese el valor del radio del Circulo :");
                Scanner scanner3 = new Scanner(System.in);
                String datocir = scanner3.nextLine();
                int radio = Integer.parseInt(datocir);
                Circulo circulo = new Circulo(radio);
                System.out.println("El area del Circulo es : " + circulo.calcularArea());
                System.out.println("****************************************************");
                break;
            case 4:
                System.exit(0);
                break;
        }
    }
}
