package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class Antwoord {

    private String gegevenAntwoord;
    private boolean isCorrect;
    private int tijd;
    private int score;

    public Antwoord(String gegevenAntwoord, boolean isCorrect, int tijd) {
        this.gegevenAntwoord = gegevenAntwoord;
        this.isCorrect = isCorrect;
        this.tijd = tijd;
    }

    public int getScore(){
        return 0;
    }

    public boolean isCorrect(){
        return isCorrect;
    }
}
