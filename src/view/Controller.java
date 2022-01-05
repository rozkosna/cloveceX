package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import model.Kostka;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button kostka;

    @FXML
    Label hodKostkou;

    ArrayList<Position> poleSouradnic = new ArrayList();

    ArrayList<Circle> svetylka;

    int hod = 0;

    @FXML
    AnchorPane pozadi;

    public void hodKostkou(){
        Kostka kostka = new Kostka(6);
        hod = kostka.hodKostkou();
        hodKostkou.setText(String.valueOf(hod));
//        hodKostkou.setLayoutX(300);
//        pozadi.getChildren().add(hodKostkou);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generujSouradnice();
    }

    private void generujSouradnice() {

        //poleSouradnic.add(new Position(x,y));
    }
}
