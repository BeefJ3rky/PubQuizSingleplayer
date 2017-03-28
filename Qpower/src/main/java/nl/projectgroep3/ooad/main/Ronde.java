package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class Ronde {

    private int rubriek;
    private Vraag[] vragen;
    private int huidigeVraag;

    public Ronde(int rubriek){
        this.rubriek = rubriek;
        vragen = getQuestions(rubriek);
        huidigeVraag = 0;
    }

    private Vraag[] getQuestions(int rubriek){
        Vraag[] output = new Vraag[16];
        QuizData data = new QuizData();
        String[] answers = {"Frits", "Henk", "Gerard", "Harry"}; //TODO uit datastore lezen
        for (int i = 0; i < output.length; i++){
            String vraag = data.getQuestions(rubriek);
            if (checkDoubleQuestion(vraag)){
                Vraag vrg = new OpenVraag(vraag, answers);
            }else{
                i -= 1;
            }
        }
        return output;
    }

    private boolean checkDoubleQuestion(String vraag){
        boolean output = true;
        for (Vraag vrg : vragen) {
            if(vraag == vrg.getVraag()){
                output = false;
            }
        }
        return output;
    }

    public Vraag getNextQuestion(){
        if(huidigeVraag < 16){
            huidigeVraag++;
        }
        return vragen[huidigeVraag];
    }

    public boolean checkAnswer(String answer, int time){
        return vragen[huidigeVraag].checkAnswer(answer, time);
    }

    public int calculateScore(){ //TODO score calculator implementeren
        int output = 0;
        for (Vraag vraag : vragen){
            output += vraag.getAnswer().getScore();
        }
        return output;
    }
}
