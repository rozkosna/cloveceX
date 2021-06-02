package model;

import java.util.Random;
public class Kostka {

    private int pocetSten;
    private Random random;

    public Kostka(int pocetSten){
        this.pocetSten = pocetSten;
        this.random = new Random();
    }


    public int getPocetSten(){

        return this.pocetSten;
    }

    public int hodKostkou(){
        return random.nextInt(pocetSten) + 1;
    }



}
