package com.Selenium;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę cyfr: ");
        int n = in.nextInt();

        int [] tablica = new int[n];

        int j = 1;

        for (int i=0; i<tablica.length; i++) {
            tablica[i] = j;
            j++;
        }

        int i = 0;

        while (i < tablica.length) {
            System.out.println(tablica[i]);
            i++;
        }

    }
}
