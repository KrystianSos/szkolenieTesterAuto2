package com.Selenium;

import java.util.ArrayList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {

        List<Integer> mojaLista = new ArrayList<>();

        for (int i =0; i<=100; i++) {
            if (i%2 != 0) {
                mojaLista.add(i);
            } else {
                mojaLista.add(i*2);
            }
        }


        for (int i=0; i<=100; i++) {
            System.out.println(mojaLista.get(i));
        }


    }
}
