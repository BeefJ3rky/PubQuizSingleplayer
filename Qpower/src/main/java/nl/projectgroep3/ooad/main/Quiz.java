package nl.projectgroep3.ooad.main;

import java.util.ArrayList;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
public class Quiz {

    public static final int START_SCORE = 0;
    private ArrayList<Ronde> rondes;
    private int huidigeRonde;

    public Quiz(int aantalRondes, int[] rubrieken) {
        rondes = new ArrayList<Ronde>();
        for (int i = 0; i < aantalRondes; i++) {
            rondes.add(new Ronde(rubrieken[i]));
        }
        huidigeRonde = 0;
    }

    public Vraag getQuestion(){
        return rondes.get(huidigeRonde).getNextQuestion();
    }

    public int getScore(){
        int output = START_SCORE;
        for (Ronde ronde :
                rondes) {
            output += ronde.calculateScore();
        }
        return output;
    }

    public void answerQuestion(String answer, long time){
        rondes.get(huidigeRonde).checkAnswer(answer, time);
    }
}
