package com.Selenium;


public class Klasy {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("czerwony");

        System.out.println(samochod.getKolor());

    }

}

class Samochod {

    public String kolor;

    public Samochod() {

    }

    public Samochod(String kolor) {
        this.kolor=kolor;
    }

    public void jedzie() {
        System.out.println("Brum Brum");
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String color) {
        kolor = color;
    }

}
