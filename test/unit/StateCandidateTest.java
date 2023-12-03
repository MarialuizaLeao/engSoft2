package test;

import main.StateCandidate;
import org.junit.*;

public class StateCandidateTest{

    private StateCandidate stateCandidate;

    @Test
    public void testStateCandidateBuilder() {
        String name = "Alberto";
        String party = "PV";
        int number = 1232;
        String state = "SP";
        this.stateCandidate = new StateCandidate(name, party, number, state);
        Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", stateCandidate.getName().equals(name));
        Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", stateCandidate.getParty().equals(party));
        Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", stateCandidate.getNumber() == number);
        Assert.assertTrue("O estado do candidato nao esta como definido pelo builder.", stateCandidate.getState().equals(state));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateStateCandidateWithoutState() {
        String name = "Alberto";
        String party = "PV";
        int number = 1232;
        String state = null;
        this.stateCandidate = new StateCandidate(name, party, number, state);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateStateCandidateWithInvalidState() {
        String name = "Alberto";
        String party = "PV";
        int number = 1232;
        String state = "SJ";
        this.stateCandidate = new StateCandidate(name, party, number, state);
    }
}
