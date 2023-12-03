package test;

import main.FederalDeputy;
import org.junit.*;

public class FederalDeputyTest {
    
    private FederalDeputy federalDeputy;

    @Test
    public void testFederalDeputyBuilder() {
        String name = "Alberto";
        String party = "PV";
        int number = 1232;
        String state = "SP";
        this.federalDeputy = new FederalDeputy(name, party, number, state);
        Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", federalDeputy.getName().equals(name));
        Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", federalDeputy.getParty().equals(party));
        Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", federalDeputy.getNumber() == number);
        Assert.assertTrue("O estado do candidato nao esta como definido pelo builder.", federalDeputy.getState().equals(state));
    }
}
