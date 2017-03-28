package nl.projectgroep3.ooad.main;

import java.util.ArrayList;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class Quiz {

    private ArrayList<Ronde> rondes;

    public Quiz(ArrayList<Ronde> rondes) {
        this.rondes = rondes;
    }

    public Vraag getQuestion(){
        for (Ronde ronde :
                rondes) {
            return ronde.getNextQuestion();
        }
        return null;
    }

    public int getScore(){
        for (Ronde ronde :
                rondes) {
            return ronde.calculateScore();
        }
        return 0;
    }
}
