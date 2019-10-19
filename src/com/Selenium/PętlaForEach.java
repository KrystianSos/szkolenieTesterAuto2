package com.Selenium;

import java.util.ArrayList;
import java.util.List;

public class PętlaForEach {
    public static void main(String[] args) {

        int[] array = new int[101];

        for (int i = 0; i <= 100; i++) {
            array[i] = i;
        }

        for (int i : array) {
            array[i] *= 2;
            System.out.println(array[i]);
        }

    }
}
