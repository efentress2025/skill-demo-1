import static org.junit.Assert.*;
import org.junit.*;

public class demoMethodTester {
    @Test
    public void mult3ByTwo() {
        assertEquals(6, demoMethod.multByTwo(3));
    }
}
