package com.Selenium;

public class Firma {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();

        pracownik1.setImie("Jan");
        pracownik1.setNazwisko("Nowak");
        pracownik1.setWiek(30);

        pracownik2.setImie("Zenon");
        pracownik2.setNazwisko("Kowalski");
        pracownik2.setWiek(80);

        pracownik1.pobierzDane();

        System.out.println("");

        pracownik2.pobierzDane();

        Pracownik pracownik3 = new Pracownik("Adam", "Zawadzki", 30);
        Pracownik pracownik4 = new Pracownik("Wojciech", "Zawadzki", 40);

        System.out.println("");

        pracownik3.pobierzDane();

        System.out.println("");

        pracownik4.pobierzDane();

    }

}

class Pracownik {

    String imie;
    String nazwisko;
    int wiek = 0;

    public Pracownik() {

    }

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wiek=wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void pobierzDane() {
        System.out.println("Imię: " + getImie());
        System.out.println("Nazwisko: " + getNazwisko());
        System.out.println("Wiek: " + getWiek());
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}

