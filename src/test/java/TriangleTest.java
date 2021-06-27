import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class TriangleTest {
    Triangle triangle=new Triangle();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void triangleType() {
        assertEquals("a+\",\"+b+\",\"+c+\"这三条边可以构成等边三角形\"",triangle.triangleType(10,10,10));
    }
}
