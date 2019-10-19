package com.Selenium;

import java.util.Scanner;

public class PętlaFor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj czas do wybuchu: ");
        int i = in.nextInt();

        if (i < 0) {
            System.out.println("Nieprawidłowa wartość!");
        } else {
            while (i >= 0) {
                System.out.println("Bomba wybuchnie za: " + i);
                i--;
            }
        }

        System.out.println("Podaj czas do wybuchu: ");
        i = in.nextInt();

        if (i < 0) {
            System.out.println("Nieprawidłowa wartość!");
        } else {
             do {
                System.out.println("Bomba wybuchnie za: " + i);
                i--;
            } while (i >= 0);
        }

        System.out.println("Podaj czas do wybuchu: ");

            for (i = in.nextInt(); i>=0; i--){
                        System.out.println("Bomba wybuchnie za: " + i);
                    }

        }

    }
