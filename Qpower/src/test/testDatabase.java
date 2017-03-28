import nl.projectgroep3.ooad.main.QuizData;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

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
        for(int j = 0; j < 16; j++){
            String[] question = sut.getQuestions(0);
            System.out.println(Arrays.toString(question));
        }
    }
}
