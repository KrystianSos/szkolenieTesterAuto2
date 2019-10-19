package com.Selenium;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int [][] tablica = new int[2][3];

        int count = 0;

        for(int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                tablica[i][j] = count;
                count++;
                System.out.println("tab[" + i + "," + j + "] = " + tablica[i][j]);
            }
        }


    }
}
