package nl.projectgroep3.ooad.main;

/**
 * Created by dion on 30-3-2017.
 */
public class simpleScoreCalculator implements IScoreCalculator {

    public static final int CORRECT_ANSWER_SCORE = 45;
    public static final int MILLIS_TO_SCORE_FACTOR = 1000;

    public int calculateScore(boolean correct, long time, long maxTime) {
        long score = 0;
        if (correct){
            score = CORRECT_ANSWER_SCORE + ((maxTime - time)/ MILLIS_TO_SCORE_FACTOR);
        }else{
            score = 0;
        }

        return (int)score;

    }
}
