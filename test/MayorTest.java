package test;

import main.Mayor;
import org.junit.*;

public class MayorTest {
    @Test
    public void testGetCity() {
        Mayor mayor = new Mayor("John Doe", "Party A", 1, "State A", "City A");
        String expected = "City A";
        String actual = mayor.getCity();
        Assert.assertEquals(expected, actual);
    }
}