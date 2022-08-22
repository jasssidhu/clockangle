import static org.junit.Assert.*;
import org.junit.Test;
public class clockangletest {
    @Test
    public void test_angle() throws Exception {
        assertEquals("Working fine",165, clockangle.clocke(1230),0);
        assertEquals("Working fine",187.5, clockangle.clocke(245),0);
        assertEquals("Working fine",187.5, clockangle.clocke(1445),0);
        assertEquals("Working fine",147, clockangle.clocke(1754),0);
        assertEquals("Working fine",265, clockangle.clocke(1710),0);
        assertEquals("Working fine",0, clockangle.clocke(1200),0);
    }

    @Test
    public void test_invalidInpu(){
        Exception exception = assertThrows(Exception.class, () -> {
            clockangle.clocke(1299);
        });
    
        String expectedMessage = "Invalid Input";
        String actualMessage = exception.getMessage();
    
        assertTrue(actualMessage.contains(expectedMessage));

        exception = assertThrows(Exception.class, () -> {
            clockangle.clocke(2530);
        });
        actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));


    }
}

