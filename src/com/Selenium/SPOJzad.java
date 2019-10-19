package com.Selenium;


import java.sql.SQLOutput;
import java.util.Scanner;

public class SPOJzad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Podaj liczbę testów: ");

        int b = in.nextInt();

        int [] array = new int[b];

        for(int i = 0; i<b; i++){
            System.out.println("Podaj ile liczb do zsumowania: ");
            int a = in.nextInt();
            int suma = 0;
            System.out.println("Podaj liczby do zsumowania: ");
            for (int j = 0; j<a; j++) {
                suma += in.nextInt();
            }
            array[i] = suma;
        }

        for(int i=0; i<b; i++){
            System.out.println("Suma " + (i+1) + ": ");
            System.out.println(array[i]);
        }

    }
}
