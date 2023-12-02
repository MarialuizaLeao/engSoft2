package unitTest;

import main.Governor;
import org.junit.*;

public class GovernorTest {

    private Governor governor;

    @Test
    public void testGovernorBuilder() {
        String name = "Alberto";
        String party = "PV";
        int number = 1232;
        String state = "SP";
        this.governor = new Governor(name, party, number, state);
        Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", governor.getName().equals(name));
        Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", governor.getParty().equals(party));
        Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", governor.getNumber() == number);
        Assert.assertTrue("O estado do candidato nao esta como definido pelo builder.", governor.getState().equals(state));
    }
}
