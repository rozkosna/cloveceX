package model;

import model.BarvaFigurky;
import model.CilovyDomecek;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HraciPlocha {

    /*private int pocetHracu;
    private int poleMeziNasazenim;
    private int pocetFigurek;
    private int pocetVsechPoli;
    private int pocetVsechFigurek;*/

    private Map<BarvaFigurky, StartovniDomecek> startovniDomecekMap = new HashMap<>();
    private Map<BarvaFigurky, CilovyDomecek> cilovyDomecekMap = new HashMap<>();
    private Map<BarvaFigurky, Figurka> nasazeneFigurky = new HashMap<>();

    private List<Figurka> hraciPole = new ArrayList<>();

    public HraciPlocha(int pocetHracu, int pocetFigurek, int poleMeziNasazenim){
        /*this.pocetHracu = pocetHracu;
        this.poleMeziNasazenim = poleMeziNasazenim;
        this.pocetFigurek = pocetFigurek;*/

        for(int i=0;i<pocetHracu;i++){

            //Vytvoření startovních domečků
            BarvaFigurky barvaFigurky = new BarvaFigurky(i*poleMeziNasazenim,pocetHracu*poleMeziNasazenim);


               StartovniDomecek startovniDomecek = new StartovniDomecek(pocetFigurek, barvaFigurky);

               startovniDomecekMap.put(barvaFigurky, startovniDomecek);

            //Vytvoření cílových domečků
            CilovyDomecek cilovyDomecek = new CilovyDomecek(pocetFigurek, barvaFigurky);
            cilovyDomecekMap.put(barvaFigurky, cilovyDomecek);
        }
        //Vytvoření hracího pole
        //Naplní hrací pole hodnotou null
        for(int i=0;i<poleMeziNasazenim*pocetHracu;i++){
            hraciPole.add(i,null);
        }
    }

    //Nasazení figurky na správné místo
    public void nasad(BarvaFigurky barvaFigurky){}
    public void nasad(Figurka figurka){}

    //Posunutí figurky o daný počet míst
    public void posunFigurku(Figurka figurka, int pocetPoli){
        int staraPozice = hraciPole.indexOf(figurka);
        int novaPozice = staraPozice +pocetPoli;
        hraciPole.set(novaPozice,figurka);
        hraciPole.set(staraPozice, null);
    }
    public void posunFigurku(int soucasnaPozice, int pocetpoli){}

    //Zjištění, se kterými figurkami může hráč hrát
    public List<Figurka> vratMozneFigurky(BarvaFigurky barvaFigurky, int pocetpoli){
        List<Figurka> figurky = new ArrayList<>();
        for(Figurka f : hraciPole){
            if ((f.getBarvaFigurky()==barvaFigurky)&&(muzuPohyb(f,pocetpoli))) figurky.add(f);
        }
        return null;

    }

    private boolean muzuPohyb(Figurka f, int pocetpoli) {
        boolean vysledek = false;
        Figurka figurkaPredeMnou = hraciPole.get(hraciPole.indexOf(f)+pocetpoli);
        if (figurkaPredeMnou == null) vysledek = true;
        else if (figurkaPredeMnou.getBarvaFigurky()!=f.getBarvaFigurky()) vysledek = true;
        return vysledek;
    }

}
