package com.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SPOJzad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int count = 0;
        int wartosc = 42;
        int count2 = 0;
        list.add(wartosc);
        do{
            System.out.println("Podaj liczbę: ");

            wartosc = in.nextInt();
            list.add(wartosc);
            count2++;
            if(wartosc == 42 && list.get(count2-1) != 42) {
                count++;
            }
        } while (count<3);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
