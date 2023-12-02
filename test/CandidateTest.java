package test;

import main.Mayor;
import org.junit.*;

public class CandidateTest {

	private Candidate candidate;

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCandidateWithoutName() {
		String name = null;
		String party = "PV";
		int number = 1232;
        this.candidate = new Candidate(name, party, number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCandidateWithoutParty() {
		String name = "Alberto";
		String party = null;
		int number = 1232;
        this.candidate = new Candidate(name, party, number);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateCandidateWithNegativeNumber() {
		String name = "Alberto";
		String party = "PV";
		int number = -1232;
        this.candidate = new Candidate(name, party, number);
    }
}
