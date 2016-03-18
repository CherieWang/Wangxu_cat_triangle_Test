
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Cherie_Wang on 16/3/18.
 */
public class TriangleTest {
    @Test
    public void testTriangle() throws Exception {
        assertEquals(1, new Triangle().CheckTri(2,2,3));
        assertEquals(-1, new Triangle().CheckTri(2, 2, 5));
        assertEquals(2, new Triangle().CheckTri(3,3,3));
        assertEquals(2, new Triangle().CheckTri(3,5,4));
    }
}
