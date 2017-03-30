package nl.projectgroep3.ooad.main;

/**
 * Created by dion on 30-3-2017.
 */
public class ScoreCalculatorFactory {

    public static IScoreCalculator getInstance(ScoreCalculatorType type){
        switch (type){
            case simple: return new simpleScoreCalculator();
            default: return null;
        }
    }


}
