package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class OpenVraag extends Vraag {

    private static final int TIME = 120;

    private String[] antwoorden;
    public OpenVraag(String vraag, String[] antwoorden) {
        super(vraag, TIME);
        this.antwoorden = antwoorden;
    }
}
