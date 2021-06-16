package model;

import model.BarvaFigurky;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class CilovyDomecek {

    private List<Figurka> figurky;
    private BarvaFigurky barvaFigurky;
    private int pocet;

    public CilovyDomecek(int pocetFigurekDomecku, BarvaFigurky barvaFigurky){
        figurky = new ArrayList<>(pocetFigurekDomecku);
        List<Figurka> figurky = new ArrayList<>(pocetFigurekDomecku);

        this.pocet = pocetFigurekDomecku;
        this.barvaFigurky = barvaFigurky;
    }

    public boolean jeVolno(int pozice){
        if (!figurky.isEmpty() && pozice<pocet){ return (figurky.get(pozice)==null);};
        return true;
    }

    public void vlozFigurku(Figurka figurka, int pozice) {
        if (jeVolno(pozice)) {
            if(figurka.getBarvaFigurky() == barvaFigurky){
                figurky.set(pozice, figurka);
            }else{
                throw new InvalidParameterException("Barva figurky neodpovídá.");
            }
        }else{
            throw new IllegalStateException("Místo v domečku je obsazené.");
        }

    }

    public boolean jePlno(){
        for (Figurka f : figurky){
            if (f==null){return false;}
        }
        return true;
    }

    public void posunO(Figurka figurka, int kolik){
        int pozice = figurky.indexOf(figurka);
        try{
            vlozFigurku(figurka, pozice+kolik);

        }catch (InvalidParameterException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean jePohyb(){
        List<Figurka> figurkaList = getFigurkyKPohybu();
        return (!figurkaList.isEmpty());
    }

    public List<Figurka> getFigurkyKPohybu(){
        List<Figurka> figurkaList = new ArrayList<>();
        for (Figurka f: figurky){
            for (int i = figurky.indexOf(f); i < pocet; i++) {
                if (figurky.get(i)==null) figurkaList.add(f);
            }
        }
        return figurkaList;
    }
}
