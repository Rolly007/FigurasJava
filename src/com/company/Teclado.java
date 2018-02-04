package com.company;

import java.util.*;

public class Teclado {
    Scanner sc;

    public Teclado() {
        sc = new Scanner(System.in);
    }

    public String getString(String titulo) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(titulo);
            s1 = sc.nextLine();
            if (!s1.matches("^[A-Za-z ]*$")) {
                s1 = "";
            }
        }
        return s1;
    }

    public int getInt(String titulo) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(titulo);
            s1 = sc.nextLine();
            if (!s1.matches("[0-9]{1}")) {
                s1 = "";
            }
        }
        return Integer.parseInt(s1);
    }
}
