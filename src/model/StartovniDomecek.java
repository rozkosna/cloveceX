package model;

import model.BarvaFigurky;

/**import java.util.Deque;**/
import java.util.LinkedList;

public class StartovniDomecek {

    /**private Deque<Figurka> figurky = new LinkedList<>();**/
    private LinkedList<Figurka> figurky = new LinkedList<>();

    public StartovniDomecek(int pocet, BarvaFigurky barvaFigurky){
        for(int i = 0; i < pocet; i++){
            figurky.addFirst(new Figurka(barvaFigurky));
        }
    }

    public Figurka nasadFigurku(){
        if(jePrazdny()) return null;
        else return figurky.removeFirst();
    }

    public void vratFigurku(Figurka figurka){
        figurky.addFirst(figurka);
    }

    public boolean jePrazdny(){
        return figurky.isEmpty();
    }

    public int zbyvaFigurek() {
        if (jePrazdny()){return 0;}
        else return figurky.size();
    }
}
