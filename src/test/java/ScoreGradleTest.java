import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreGradleTest {
    ScoreGradle scoreGradle = new ScoreGradle();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void gradle() {
        assertEquals("A",scoreGradle.gradle(100));
        assertEquals("B",scoreGradle.gradle(85));
        assertEquals("C",scoreGradle.gradle(75));
        assertEquals("D",scoreGradle.gradle(65));
        assertEquals("E",scoreGradle.gradle(1));
        assertEquals("X",scoreGradle.gradle(101));
    }
}
