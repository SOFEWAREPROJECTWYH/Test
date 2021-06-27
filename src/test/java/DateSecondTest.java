import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class DateSecondTest {
    DateSecond dateSecond=new DateSecond();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void judgeSecondDay() {
        assertEquals("2021年6月1日",dateSecond.JudgeSecondDay(2021,5,31));
    }
}
