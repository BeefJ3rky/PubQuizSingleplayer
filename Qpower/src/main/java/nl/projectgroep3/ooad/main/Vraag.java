package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
public abstract class Vraag {

    private String vraag;

    public Vraag(String vraag) {
        this.vraag = vraag;
    }

    public String getVraag(){
        return vraag;
    }

    abstract void setAnswer(String input, long tijd);

    abstract boolean checkAnswer(String input, long tijd);

    abstract Antwoord getAnswer();

    abstract int getMaxTime();
}
