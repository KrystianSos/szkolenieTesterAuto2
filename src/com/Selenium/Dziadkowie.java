package com.Selenium;

public class Dziadkowie {

    String imie;
    String nazwisko;
    int wiek;
    String kolorWłosów;

    public Dziadkowie(String imie, String nazwisko, int wiek, String kolorWłosów) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.kolorWłosów = kolorWłosów;
    }
}

class Rodzice extends Dziadkowie {

    boolean praca;

    public Rodzice(String imie, String nazwisko, int wiek, String kolorWłosów, boolean praca) {
        super(imie, nazwisko, wiek, kolorWłosów);
        this.praca = praca;
    }
}

class Dzieci extends Rodzice {

    boolean zabawki;
    int kieszonkowe;

    public Dzieci(String imie, String nazwisko, int wiek, String kolorWłosów, boolean praca, boolean zabawki, int kieszonkowe) {
        super(imie, nazwisko, wiek, kolorWłosów, praca);
        this.zabawki = zabawki;
        this.kieszonkowe = kieszonkowe;
    }

}

class Main2 {

    public static void main(String[] args) {

        Dzieci dzieci = new Dzieci("Adam", "Małecki", 10, "niebieskie", false, false, 150);

        System.out.println("Imie: " + dzieci.imie);
        System.out.println("Nazwisko: " + dzieci.nazwisko);
        System.out.println("Wiek: " + dzieci.wiek);
        System.out.println("Kieszonkowe: " + dzieci.kieszonkowe);
        System.out.println("Kolor włosów: " + dzieci.kolorWłosów);
        System.out.println("Zabawki: " + dzieci.zabawki);
        System.out.println("Praca: " + dzieci.praca);

    }

}