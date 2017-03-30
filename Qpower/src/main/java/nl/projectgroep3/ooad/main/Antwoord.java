package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
public class Antwoord {

    private String gegevenAntwoord;
    private boolean isCorrect;
    private long tijd;
    private long maxTijd;

    public Antwoord(String gegevenAntwoord, boolean isCorrect, long tijd, long maxTijd) {
        this.gegevenAntwoord = gegevenAntwoord;
        this.isCorrect = isCorrect;
        this.tijd = tijd;
        this.maxTijd = maxTijd;
    }

    public int getScore(IScoreCalculator calculator){
        return calculator.calculateScore(isCorrect, tijd, maxTijd);
    }

    public boolean isCorrect(){
        return isCorrect;
    }

    public String toString(){
        return gegevenAntwoord + "[" + isCorrect + "]";
    }
}
