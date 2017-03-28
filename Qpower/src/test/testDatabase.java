import nl.projectgroep3.ooad.main.QuizData;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Tom van Grinsven on 3/28/2017.
 */
public class testDatabase {
    
    private QuizData sut;
    
    @Before
    public void setUp(){
        sut = new QuizData();
    }
    
    @Test
    public void testGetQuestions(){

        for (int i = 0; i < 16 ; i++) {
            System.out.println(i + sut.getQuestions(0));
            
        }
    }
}
