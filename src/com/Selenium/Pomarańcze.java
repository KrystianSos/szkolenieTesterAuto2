package com.Selenium;

import java.util.ArrayList;
import java.util.List;

interface Owoce {

    public int pobierzCene();
    public int pobierzWage();

}

class Pomarańcze implements Owoce{

    int cena;
    int waga;
    String kolor;

    public Pomarańcze(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

class Banany implements Owoce{

    int cena;
    int waga;
    String kolor;

    public Banany(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

class Jabłka implements Owoce {

    int cena;
    int waga;
    String kolor;

    public Jabłka(int cena, int waga, String kolor) {
        this.cena = cena;
        this.waga = waga;
        this.kolor = kolor;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}

class Main3 {
    public static void main(String[] args) {

        Pomarańcze pomarańcze = new Pomarańcze(40,1, "pomarańczowy");
        Banany banany = new Banany(15, 2, "bananowy");
        Jabłka jabłka = new Jabłka(10, 4, "czerwony");

        Owoce [] tablica = new Owoce[3];
        tablica[0]=pomarańcze;
        tablica[1]=banany;
        tablica[2]=jabłka;

        int suma=0;

        for(Owoce i : tablica) {

            suma += i.pobierzWage();

        }

        System.out.println(suma);

    }
}
