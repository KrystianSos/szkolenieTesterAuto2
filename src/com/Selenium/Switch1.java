package com.Selenium;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Przedstaw się: ");
        String imie = in.nextLine();

        switch (imie) {
            case "Adam":
                System.out.println("Cześć " + imie);
                break;
            case "Marcin":
                System.out.println("Cześć " + imie);
                break;
            case "Józek":
                System.out.println("Cześć Józek");
                break;
            default:
                System.out.println("Przykro mi, ale Cię nie znam");
        }
    }
}
