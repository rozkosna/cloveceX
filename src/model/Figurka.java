package model;

import model.BarvaFigurky;

public class Figurka {

    private BarvaFigurky barvaFigurky;

    Figurka(BarvaFigurky barvaFigurky){
        this.barvaFigurky = barvaFigurky;
    }

    public BarvaFigurky getBarvaFigurky(){
        return barvaFigurky;
    }
}

