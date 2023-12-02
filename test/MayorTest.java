package test;

import main.Mayor;
import org.junit.*;

public class MayorTest {
    @Test
    public void testToString() {
        Mayor mayor = new Mayor("John Doe", "Party A", 1, "State A", "City A");
        String expected = "John DoeParty A1City AState A";
        String actual = mayor.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Mayor mayor1 = new Mayor("John Doe", "Party A", 1, "State A", "City A");
        Mayor mayor2 = new Mayor("John Doe", "Party A", 1, "State A", "City A");
        Mayor mayor3 = new Mayor("Jane Smith", "Party B", 2, "State B", "City B");

        Assert.assertEquals(mayor1, mayor2);
        Assert.assertNotEquals(mayor1, mayor3);
    }

    @Test
    public void testGetCity() {
        Mayor mayor = new Mayor("John Doe", "Party A", 1, "State A", "City A");
        String expected = "City A";
        String actual = mayor.getCity();
        Assert.assertEquals(expected, actual);
    }
}