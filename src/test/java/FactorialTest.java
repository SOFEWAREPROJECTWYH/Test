import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class FactorialTest {

    Factorial factorial=new Factorial();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void answer() {
        assertEquals("120",factorial.answer(5));
    }
}
