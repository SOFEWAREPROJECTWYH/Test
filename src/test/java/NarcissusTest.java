import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class NarcissusTest {
    Narcissus narcissus=new Narcissus();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void narcissusFlower() {
        assertEquals("是水仙花",narcissus.NarcissusFlower(135));
        assertEquals("不是水仙花",narcissus.NarcissusFlower(136));
    }
}
