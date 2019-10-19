package com.Selenium;

public class Działanie {
    public static void main(String[] args) {

        mnozenie(2,3);
        mnozenie(2,3,4);
        mnozenie(2,3,4, 5);

    }

    private static void mnozenie(int a, int b) {
        System.out.println(a*b);
    }

    private static void mnozenie(int a, int b, int c) {
        System.out.println(a*b*c);
    }

    private static void mnozenie(int a, int b, int c, int d) {
        System.out.println(a*b*c*d);
    }
}
