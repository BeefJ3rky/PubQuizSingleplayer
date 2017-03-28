package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class OpenVraag extends Vraag {


    private static final int TIME = 120;

    private String[] antwoorden;
    private Antwoord antwoord;

    public OpenVraag(String vraag, String[] antwoorden) {
        super(vraag);
        this.antwoorden = antwoorden;
    }

    protected void setAnswer(String input, int tijd){
        boolean correct = false;
        for (String antwoord: antwoorden) {
            if(antwoord == input){
                correct = true;
                break;
            }
        }
        antwoord = new Antwoord(input, correct, tijd);
    }


    public boolean checkAnswer(String input, int tijd){
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
