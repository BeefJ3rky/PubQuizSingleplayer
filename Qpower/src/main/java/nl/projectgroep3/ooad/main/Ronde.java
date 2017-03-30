package nl.projectgroep3.ooad.main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
@SuppressWarnings("ALL")
public class Ronde {

    private int rubriek;
    private ArrayList<Vraag> vragen;
    private int huidigeVraag;
    private IScoreCalculator scoreCalculator;

    public Ronde(int rubriek){
        this.rubriek = rubriek;
        vragen = new ArrayList<Vraag>();
        vragen = getQuestions(rubriek);
        scoreCalculator = ScoreCalculatorFactory.getInstance(ScoreCalculatorType.simple);
        huidigeVraag = 0;
    }

    public ArrayList<Vraag> getVragen(){
        return vragen;
    }

    private ArrayList<Vraag> getQuestions(int rubriek){
        ArrayList<Vraag> output = new ArrayList<Vraag>();
        QuizData data = new QuizData();
        for (int i = 0; i < 16; i++){
            String[] vraag_data = data.getQuestions(rubriek);
            String[] answers = Arrays.copyOfRange(vraag_data, 2, vraag_data.length);
            if (checkDoubleQuestion(vraag_data[0], output)){
                Vraag vrg;
                if(vraag_data[1] == "O"){
                    vrg = new OpenVraag(vraag_data[0], answers);
                }else{
                    vrg = new MeerkeuzeVraag(vraag_data[0], answers, 0);
                }
                output.add(vrg);
            }else{
                i -= 1;
            }
        }
        return output;
    }

    private boolean checkDoubleQuestion(String vraag, ArrayList<Vraag> vragen){
        boolean output = true;
        for (int i = 0; i < vragen.size(); i++) {
            if(vraag == vragen.get(i).getVraag()){
                output = false;
            }
        }
        return output;
    }

    public Vraag getNextQuestion(){
        Vraag output = vragen.get(huidigeVraag);
        if(huidigeVraag < 16){
            huidigeVraag++;
        }
        return output;
    }

    public boolean checkAnswer(String answer, long time){
        boolean output = vragen.get(huidigeVraag-1).checkAnswer(answer, time);
        return output;
    }

    public int calculateScore(){
        int output = 0;
        for (int i = 0; i < vragen.size(); i++) {
            output += vragen.get(i).getAnswer().getScore(scoreCalculator);
        }
        return output;
    }
}
