package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class Vraag {

    private Antwoord antwoord;

    public Vraag(String vraag, int tijd) {
        this.vraag = vraag;
        this.tijd = tijd;
    }

    private String vraag;
    private int tijd;

    public String getVraag(){
        return null;
    }

    public void setAnswer(){

    }

    public boolean checkAnswer(){
        return true;
    }

    public Antwoord getAnswer(){
        return null;
    }
}
