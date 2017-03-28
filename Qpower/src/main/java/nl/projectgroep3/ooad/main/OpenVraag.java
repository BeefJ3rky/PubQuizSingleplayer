package nl.projectgroep3.ooad.main;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class OpenVraag extends Vraag {
    private String[] antwoorden;
    public OpenVraag(String vraag, String[] antwoorden) {
        super(vraag, 120);
        this.antwoorden = antwoorden;
    }
}
