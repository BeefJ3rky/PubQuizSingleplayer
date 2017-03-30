import nl.projectgroep3.ooad.main.QuizData;
import nl.projectgroep3.ooad.main.Ronde;
import nl.projectgroep3.ooad.main.Vraag;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.*;

/**
 * Created by dion on 30-3-2017.
 */
public class testRonde {

    private Ronde sut;
    private ArrayList<Vraag> expected;

    @Before
    public void setup(){
        sut = new Ronde(QuizData.TOPOGRAFIE);
        expected = new ArrayList<Vraag>();
    }


    @Test
    public void testGetQuestions(){
       ArrayList<Vraag> vragen = sut.getVragen();
        assertEquals(16, vragen.size());
    }
}
