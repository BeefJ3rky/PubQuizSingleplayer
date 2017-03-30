package nl.projectgroep3.ooad.main;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by Tom van Grinsven & Dion Rats on 3/28/2017.
 */

public class QuizData implements IPersistence {

    public static final int TOPOGRAFIE = 0;
    public static final int WETENSCHAP = 1;
    public static final int TV_EN_FILM = 2;
    private String[][][] vragen;



    public QuizData() {
        vragen = new String[][][]{
                {
                        {
                            "Wat is de hoofdstad van Duitsland?",
                                "O",
                                "Berlijn",
                                "berlijn",
                                "berlin"
                        },
                        {
                            "Waar ligt China?",
                                "M",
                                "Azie",
                                "Europa",
                                "Rusland",
                                "Australie"
                        },
                        {
                            "Hoeveel mensen wonen in New York?",
                                "M",
                                "7.000.000",
                                "100",
                                "12",
                                "1.000.000"
                        },
                        {
                            "Wat is het kleinste land van Europa?",
                                "O",
                                "Vaticaanstad",
                                "vaticaanstad",
                                "vaticaan",
                        },
                        {
                            "In welk land ligt Barcelona?",
                                "M",
                                "Spanje",
                                "Griekenland",
                                "Frankrijk",
                                "Macedonie"
                        },
                        {
                            "In welke provincie ligt Venray?",
                                "M",
                                "Limburg",
                                "Brabant",
                                "Gelderland"
                        },
                        {
                            "Welke stad ligt tussen Maas en Waal en is schitterend en geweldig?",
                                "M",
                                "Nijmegen",
                                "Arnhem",
                                "Amsterdam",
                                "Grubbelkuttenveen"
                        },
                        {
                            "Van welk land is Kim Yong Un de dictator",
                                "M",
                                "Noord-Korea",
                                "Zuid-Korea",
                                "Korea",
                                "Het land van Maas en Waal"
                        },
                        {
                            "Welk land beloofde Hitler niet binnen te vallen, maar deed het toch?",
                                "M",
                                "Polen",
                                "Oekraine",
                                "Nederland",
                                "Japan"
                        },
                        {
                            "Wat is het grootste land van de wereld?",
                                "M",
                                "Rusland",
                                "Vlieland",
                                "Schiermonnik Oog",
                                "Rottermeplaat"
                        },
                        {
                            "Wat is de hoofdstad van Polen?",
                                "M",
                                "Warschau",
                                "Masha",
                                "DJ GETR3kt",
                                "Venray"
                        },
                        {
                            "Hoeveel landen zijn lid van de Europese Unie?",
                                "M",
                                "28",
                                "29",
                                "27",
                                "21"
                        },
                        {
                            "Uit hoeveel staten bestaat de V.S?",
                                "M",
                                "52",
                                "34",
                                "28",
                                "45"
                        },
                        {
                                "Wat is het kleinste werelddeel?",
                                "M",
                                "Oceanie",
                                "Azie",
                                "Noord Amerika",
                                "Afrika"
                        },
                        {
                            "Wat is de hoofdstad van Japan?",
                                "M",
                                "Tokio",
                                "Bamibal",
                                "Fu yong hai",
                                "Ku lo yuk"
                        },
                        {
                            "Naar welke stad leiden spreekwoordelijk alle wegen?",
                                "O",
                                "Rome",
                                "rome",
                                "Roma",
                                "roma"
                        },
                        {
                            "Wat is het grootste continent ter wereld?",
                                "M",
                                "Azie",
                                "Afrika",
                                "Oceanie",
                                "Nederland"
                        },
                        {
                            "Hoe wordt een inwoner van Noorwegen genoemd?",
                                "M",
                                "Noor",
                                "Zuid",
                                "Oost",
                                "West"
                        }
                },

        };
    }



    public String[] getQuestions(int rubriek) {
        Random random = new Random();
        return vragen[rubriek][random.nextInt(vragen[rubriek].length -1)];
    }
}
