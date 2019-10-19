package com.Selenium;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String [] tablica = new String[5];

        System.out.println("Podaj imiona: ");

        for (int i=0; i<tablica.length; i++) {
            tablica[i] = in.nextLine();
        }

        for (int j=0; j<tablica.length; j++) {
            System.out.println("Witaj " + tablica[j]);
        }

    }
}
