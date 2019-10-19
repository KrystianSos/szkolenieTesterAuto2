package com.Selenium;

interface Ipuchniecie {
    void puchnie();
}

interface Iporuszanie {
    void poruszanie();
}

class WspólneCechyCiałaCzłowieka{

    String kolor;
    int ilośćKomórek;

    public String getKolor() {
        return kolor;
    }

    public WspólneCechyCiałaCzłowieka(String kolor, int ilośćKomórek) {
        this.kolor = kolor;
        this.ilośćKomórek = ilośćKomórek;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getIlośćKomórek() {
        return ilośćKomórek;
    }

    public void setIlośćKomórek(int ilośćKomórek) {
        this.ilośćKomórek = ilośćKomórek;
    }

}

class Długość extends WspólneCechyCiałaCzłowieka{

    int długość;

    public Długość(String kolor, int ilośćKomórek, int długość) {
        super(kolor, ilośćKomórek);
        this.długość = długość;
    }

    public int getDługość() {
        return długość;
    }

    public void setDługość(int długość) {
        this.długość = długość;
    }

}


class Kończyny extends Długość implements Iporuszanie{

    String rodzaj;

    public Kończyny(String kolor, int ilośćKomórek, int długość, String rodzaj) {
        super(kolor, ilośćKomórek, długość);
        this.rodzaj = rodzaj;
    }

    public void poruszanie() {
        System.out.println("Ruszam się");
    }

    public void pisanie() {
        System.out.println("Piszę");
    }

}

class Obwod {

    int obwod;

    public Obwod(int obwod) {
        this.obwod = obwod;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }
}

class Tułów extends Długość implements Ipuchniecie{

    Obwod obwod;

    public Tułów(String kolor, int ilośćKomórek, int długość, Obwod obwod) {
        super(kolor, ilośćKomórek, długość);
        this.obwod = obwod;
    }

    public void puchnie() {
        System.out.println("Puchnę");
    }

    public void trawienie() {
        System.out.println("Trawię");
    }

}

class Głowa extends WspólneCechyCiałaCzłowieka implements Ipuchniecie, Iporuszanie{

    String włosy;
    Obwod obwod;

    public Głowa(String kolor, int ilośćKomórek, String włosy, Obwod obwod) {
        super(kolor, ilośćKomórek);
        this.włosy = włosy;
        this.obwod = obwod;
    }

    public void poruszanie() {
        System.out.println("Ruszam się");
    }

    public void puchnie() {
        System.out.println("Puchnę");
    }

    public void mówienie() {
        System.out.println("Mówię");
    }

}

public class Człowiek{

    Kończyny kończyny;
    Głowa głowa;
    Tułów tułów;

    public Człowiek(Kończyny kończyny, Głowa głowa, Tułów tułów) {
        this.kończyny = kończyny;
        this.głowa = głowa;
        this.tułów = tułów;
    }
}

class main4 {
    public static void main(String[] args) {

        Człowiek człowiek = new Człowiek(new Kończyny("biały", 1231, 54, "ręka"), new Głowa("biały",156165, "czarne", new Obwod(57)), new Tułów("biały", 15131, 54, new Obwod(15)));

        człowiek.tułów.puchnie();
        System.out.println(człowiek.głowa.obwod);
    }
}
