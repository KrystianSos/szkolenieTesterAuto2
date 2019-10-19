package com.Selenium;

public class Zadanie {
    public static void main(String[] args) {

        int [] array = new int[5];

        try {
            for(int i=0; i<7; i++) {
                array[i]+=1;
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a.getStackTrace());
        }
    }
}
