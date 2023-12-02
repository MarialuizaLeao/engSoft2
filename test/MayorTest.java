package test;

import main.Mayor;
import org.junit.*;

public class MayorTest {
    @Test
    public void testMayorBuilder() {
        String name = "John Doe";
        String party = "Party A";
        int number = 1;
        String state = "MG";
        String city = "City A";

        Mayor mayor = new Mayor(name, party, number, state, city);
        
        Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", mayor.getName().equals(name));
        Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", mayor.getParty().equals(party));
        Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", mayor.getNumber() == number);
        Assert.assertTrue("O estado do candidato nao esta como definido pelo builder.", mayor.getState().equals(state));
        Assert.assertTrue("A cidade do candidato nao esta como definido pelo builder.", mayor.getCity().equals(city));
    }
}