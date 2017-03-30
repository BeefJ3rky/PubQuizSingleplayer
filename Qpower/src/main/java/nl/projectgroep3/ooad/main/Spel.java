package nl.projectgroep3.ooad.main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */
public class Spel {

    public static final int AANTAL_RONDES_SINGLEPLAYER = 1;
    private static Quiz quiz;
    private static Scanner sc;
    private static String antwoord;
    private static boolean tooLate;
    private static Timer timer;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        antwoord = "";
        tooLate = false;

        initQuiz();

        System.out.println("Quiz is gestart!");

        speelQuiz();
    }

    private static void startTimer(final long tijd){
        timer = new Timer();
        TimerTask task = new TimerTask()
        {
            public void run()
            {
                if( antwoord.equals("") )
                {
                    System.err.println( "Tijd voor antwoord is verstreken! (0 punten)" );
                    quiz.answerQuestion("fout", tijd);
                    tooLate = true;
                }
            }
        };
        timer.schedule(task, tijd);

    }

    private static void initQuiz(){
        System.out.println("Welke rubriek wil je spelen?");
        System.out.println(QuizData.TOPOGRAFIE + ": topografie");
        System.out.println(QuizData.WETENSCHAP + ": wetenschap");
        System.out.println(QuizData.TV_EN_FILM + ": tv en film");

        int[] rubrieken = {sc.nextInt()};

        if(rubrieken[0] != 0){
            System.err.println("FOUT! Er zijn leukere rubrieken ;)");
            initQuiz();
        }else{
            quiz = new Quiz(AANTAL_RONDES_SINGLEPLAYER, rubrieken);
        }
        sc.nextLine();
    }

    private static void speelQuiz(){

        for (int i = 0; i < 16; i++) {
            System.out.println("Vraag " + (i+1));
            Vraag vraag = quiz.getQuestion();
            antwoord = "";
            startTimer(vraag.getMaxTime());
            System.out.println(vraag.getVraag());
            if(vraag instanceof MeerkeuzeVraag){
                String[] antwoorden = ((MeerkeuzeVraag) vraag).getAntwoorden();
                antwoorden = randomize(antwoorden);
                for (int j = 0; j < antwoorden.length; j++) {
                    System.out.println(j + ": " + antwoorden[j]);
                }
                long start = System.currentTimeMillis();
                antwoord = sc.nextLine();
                while(antwoord.equals("")){
                    System.out.println("Voer aub een antwoord in");
                    antwoord = sc.nextLine();
                }
                long time = System.currentTimeMillis() - start;
                if(!tooLate){
                    quiz.answerQuestion(antwoorden[Integer.parseInt(antwoord)], time);
                    timer.cancel();
                }
                tooLate = false;
            }else{
                long start = System.currentTimeMillis();
                antwoord = sc.nextLine();
                while(antwoord.equals("")){
                    System.out.println("Voer aub een antwoord in");
                    antwoord = sc.nextLine();
                }
                long time = System.currentTimeMillis() - start;
                if(!tooLate){
                    quiz.answerQuestion(antwoord, time);
                    timer.cancel();
                }
                tooLate = false;
            }

        }

      endQuiz();

    }

    private static void endQuiz(){
        System.out.println("Quiz over");
        System.out.println("Behaalde score: " + quiz.getScore());
    }


    private static String[] randomize(String[] arr) {
        String[] randomizedArray = new String[arr.length];
        System.arraycopy(arr, 0, randomizedArray, 0, arr.length);
        Random rgen = new Random();

        for (int i = 0; i < randomizedArray.length; i++) {
            int randPos = rgen.nextInt(randomizedArray.length);
            String tmp = randomizedArray[i];
            randomizedArray[i] = randomizedArray[randPos];
            randomizedArray[randPos] = tmp;
        }

        return randomizedArray;
    }
}
