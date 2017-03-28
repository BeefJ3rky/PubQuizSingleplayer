package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class MeerkeuzeVraag extends Vraag {

    private static final int TIME = 60;

    private String[] antwoorden;


    public MeerkeuzeVraag(String vraag, String[] antwoorden) {
        super(vraag, TIME);
        this.antwoorden = antwoorden;
    }
}
