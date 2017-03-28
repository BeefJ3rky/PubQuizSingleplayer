package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public abstract class Vraag {

    private String vraag;

    public Vraag(String vraag) {
        this.vraag = vraag;
    }

    public String getVraag(){
        return vraag;
    }

    abstract void setAnswer(String input, int tijd);

    abstract boolean checkAnswer(String input, int tijd);

    abstract Antwoord getAnswer();
}
