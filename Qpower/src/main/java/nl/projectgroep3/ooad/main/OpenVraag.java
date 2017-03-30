package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
public class OpenVraag extends Vraag {


    private static final int MAX_TIME = 120000;

    private String[] antwoorden;
    private Antwoord antwoord;

    public OpenVraag(String vraag, String[] antwoorden) {
        super(vraag);
        this.antwoorden = antwoorden;
        antwoord = null;
    }

    public int getMaxTime() {
        return MAX_TIME;
    }

    protected void setAnswer(String input, long tijd){
        boolean correct = false;
        for (String antwoord: antwoorden) {
            if(antwoord == input){
                correct = true;
                break;
            }
        }
        antwoord = new Antwoord(input, correct, tijd, MAX_TIME);
    }


    public boolean checkAnswer(String input, long tijd){

        if(antwoord != null){
            return antwoord.isCorrect();
        }else{
            setAnswer(input, tijd);
            return antwoord.isCorrect();
        }
    }

    public Antwoord getAnswer(){
        return antwoord;
    }
}
