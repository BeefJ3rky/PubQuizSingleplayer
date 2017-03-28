package nl.projectgroep3.ooad.main;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class QuizData implements IPersistence {

    public static final int TOPOGRAFIE = 0;
    public static final int WETENSCHAP = 1;
    public static final int TV_EN_FILM = 2;
    private String[][] vragen;



    public QuizData() {
        vragen = new String[][]{
                {
                        "Wat is de hoofdstad van Duitsland?",
                        "Waar ligt China?",
                        "Hoeveel mensen wonen in New York?",
                        "Wat is het kleinste land van Europa?",
                        "In welk land ligt Barcelona?",
                        "In welke provincie ligt Venray?",
                        "Welke stad ligt tussen Maas en Waal en is schitterend en geweldig?",
                        "Van welk land is Kim Yong Un de dictator",
                        "Welk land beloofde Hitler niet binnen te vallen, maar deed het toch?",
                        "Wat is het grootste land van de wereld?",
                        "Wat is de hoofdstad van polen?",
                        "Hoeveel landen zijn lid van de Europese Unie?",
                        "Uit hoeveel staten bestaat de V.S?",
                        "Wat is het kleinste werelddeel?",
                        "Wat is de hoofdstad van Japan?",
                        "Naar welke stad leiden spreekwoordelijk alle wegen?",
                        "Wat is het grootste continent ter wereld?",
                        "Hoe wordt een inwoner van Noorwegen genoemd?"

                },
                {       "Door welk bedrijf is de Playstation ontwikkeld?",
                        "Hoe wordt de batterij genoemd in een horloge?",
                        "Wie bedacht de stelling van Pythagoras",
                        "2 audio kanalen noem je stereo. Hoe noem je 1 audio kanaal?",
                        "Welk soort verbinding is vernoemd naar Harald Blauwtand?",
                        "Hoe wordt draadloos internet in de volksmond genoemd?",
                        "Welke lamp is de opvolger voor de gloeilamp?",
                        "Hoe wordt een luidspreker met een engels woord vaak genoemd?",
                        "Wie is het meest bekende karakter van Nintendo?",
                        "Hoe noem je de kracht die alles naar beneden trekt?",
                        "Welke kleur heeft een robijn?",
                        "Hoe noem je de controller met joystickknupper van de Wii?",
                        "hoe heet de Amerikaanse ruimtevaartorganisatie?",
                        "Hoeveel autodeuren heeft een coupé?",
                        "Hoe heet het onderdeel op de fiets dat stroom opwekt voor de verlichting?",
                        "Wat is het meest veilige vervoersmiddel?",
                        "Welke kleur krijg je als rode en blauwe verf mengt?",
                        "Wat is de gewichtseenheid van diamanten?",
                        "Hoe wordt de gratis webmaildienst van Google genoemd?",
                        "Hoe heet het besturingssysteem voor mobiele apparaten van Google?",
                        "Wat is de meest bekende website voor het microbloggen?"
                },
                {
                        "Met welke woorden sluit Piet Paulusma het weerbericht af?",
                        "Waar wordt het programma “Hello Goodbye” opgenomen?",
                        "Wie presenteert het programma Ik hou van Holland?",
                        "Welke kleur is Bert van poppenduo Bert en Ernie?",
                        "Wie speelde rol van Captain Jack Sparrow in de films Pirates of the Caribbean?",
                        "In welke tv-serie had Will Smith zijn eerste grote rol?",
                        "Wat is de naam van het ruimteactiefiguur uit Toy Story?",
                        "Hoe lang sliep Doornroosje?",
                        "Wie is de meest bekende personage van Rowan Atkinson?",
                        "Wat is een ander woord voor praatprogramma?",
                        "Wie liet zich een tijdje geleden in haar bek pissen?",
                        "Welk bekend Japans typetje wordt door Wendy van Dijk gespeeld?",
                        "Wat is de achternaam van Ron in de films van Harry Potter?",
                        "Wat is de naam van de pratende ezel uit Shrek?",
                        "Welke acteur is vooral bekend van de kaskrakers Rambo en Rocky?",
                        "Welke presentator staat bekend om zijn spreuk “Hier wordt ik niet vrolijk van",
                        "In welk programma heb je als kandidaat 100 tegenspelers?",
                        "Wat is de opvolger van de analoge televisie?",
                        "In welk programma komt de rubriek de Jakhalzen voor?"
                }
        };
    }

    public String getQuestions(int rubriek) {
        Random random = new Random();
        return vragen[rubriek][random.nextInt(vragen[rubriek].length -1)];
    }
}
