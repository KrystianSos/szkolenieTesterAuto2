package com.Selenium;

interface Pojazd{

    public void stop();
    public void start();

}

abstract class PojazdKołowy implements Pojazd{

    public void stop(){
        System.out.println("Musisz się zatrzymać");
    }

}

public class Rower extends PojazdKołowy {


    @Override
    public void start() {

    }

    public void skok(){

    }
}

class Hulajnoga implements Pojazd {

    @Override
    public void stop() {

    }

    @Override
    public void start() {

    }

}