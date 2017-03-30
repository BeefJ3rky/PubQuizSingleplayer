package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
public class MeerkeuzeVraag extends Vraag {

    private static final int MAX_TIME = 60000;

    private String[] antwoorden;
    private int correctAntwoord;
    private Antwoord antwoord;


    public MeerkeuzeVraag(String vraag, String[] antwoorden, int correctAntwoord) {
        super(vraag);
        this.antwoorden = antwoorden;
        this.correctAntwoord = correctAntwoord;
        antwoord = null;
    }

    public int getMaxTime() {
        return MAX_TIME;
    }

    public String[] getAntwoorden(){
        return antwoorden;
    }

    public void setAnswer(String input, long tijd) {
        boolean correct = false;
        for (int i = 0; i < antwoorden.length; i++) {
            if(antwoorden[correctAntwoord] == input){
                correct = true;
                break;
            }
        }
        antwoord = new Antwoord(input, correct, tijd, MAX_TIME);
    }

    public boolean checkAnswer(String input, long tijd) {
        if(antwoord != null){
            return antwoord.isCorrect();
        }else{
            setAnswer(input, tijd);
            return antwoord.isCorrect();
        }
    }

    public Antwoord getAnswer() {
        return antwoord;
    }
}
