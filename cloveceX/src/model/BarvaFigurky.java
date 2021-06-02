package model;

public class BarvaFigurky {

    int start;
    int cil;

    public BarvaFigurky(int start, int pocetPoli){
        this.start = start;
        int cil = start - 1;
        if (start==0) cil = pocetPoli - 1;
    }

    public int getStart(){
        return this.start;
    }

    public int getCil(){
        return cil;
    }
}
