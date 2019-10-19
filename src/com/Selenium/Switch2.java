package com.Selenium;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj nazwę owocu: ");
        String owoc = in.nextLine();
        System.out.println("Podaj wagę: ");
        double waga = in.nextDouble();

        switch (owoc) {
            case "jabłka":
                stanMagazynu(owoc, waga);
                break;
            case "banany":
                stanMagazynu(owoc, waga);
                break;
            case "pomarańcze":
                stanMagazynu(owoc, waga);
                break;
            default:
                System.out.println("Nieznany owoc");

        }
    }

    private static void stanMagazynu(String owoc, double waga) {
        if (waga > 100) {
            System.out.println(owoc +" jest za dużo o " + (waga - 100) + " kg");
        } else {
            System.out.println(owoc +" jest w sam raz, mamy jeszcze " + (100 - waga) + " kg miejsca");
        }
    }
}
