package com.Selenium;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Wyjątki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 0;
        try {
            i = scanner.nextInt();
            int c = 5/i;
        } catch (InputMismatchException e) {
            System.out.println(e.getStackTrace());
        } catch (ArithmeticException d) {
            System.out.println("Nie dziel przez 0");
        }
        finally {
            System.out.println(i);
        }




    }
}
