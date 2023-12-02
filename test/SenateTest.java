package test;

import main.Senate;
import org.junit.*;

public class SenateTest {

    private Senate senate;

    @Test
    public void testSenateBuilder() {
        String name = "Alberto";
        String party = "PV";
        int number = 1232;
        String state = "SP";
        this.senate = new Senate(name, party, number, state);
        Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", senate.getName().equals(name));
        Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", senate.getParty().equals(party));
        Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", senate.getNumber() == number);
        Assert.assertTrue("O estado do candidato nao esta como definido pelo builder.", senate.getState().equals(state));
    }
}
