package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class MeerkeuzeVraag extends Vraag {

    private static final int TIME = 60;

    private String[] antwoorden;
    private int correctAntwoord;
    private Antwoord antwoord;


    public MeerkeuzeVraag(String vraag, String[] antwoorden, int correctAntwoord) {
        super(vraag);
        this.antwoorden = antwoorden;
        this.correctAntwoord = correctAntwoord;
    }

    void setAnswer(String input, int tijd) {
        boolean correct = false;
        for (int i = 0; i < antwoorden.length; i++) {
            if(antwoorden[correctAntwoord] == input){
                correct = true;
                break;
            }
        }
        antwoord = new Antwoord(input, correct, tijd);
    }

    boolean checkAnswer(String input, int tijd) {
        if(antwoord != null){
            return antwoord.isCorrect();
        }else{
            setAnswer(input, tijd);
            return antwoord.isCorrect();
        }
    }

    Antwoord getAnswer() {
        return antwoord;
    }
}
