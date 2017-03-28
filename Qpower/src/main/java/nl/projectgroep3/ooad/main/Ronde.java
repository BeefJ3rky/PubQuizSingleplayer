package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class Ronde {

    private String Rubriek;

    private boolean checkDoubleQuestion(){
        return true;
    }

    public Vraag getNextQuestion(){
        return null;
    }

    public boolean checkAnswer(String answer){
        return true;
    }

    public int calculateScore(){
        return 0;
    }
}
