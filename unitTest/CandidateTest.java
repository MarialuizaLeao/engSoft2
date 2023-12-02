package unitTest;

import main.Candidate;
import org.junit.*;

public class CandidateTest {

	private Candidate candidate;

	@Test
	public void testCandidateBuilder() {
		String name = "Alberto";
		String party = "PV";
		int number = 1232;
		this.candidate = new Candidate(name, party, number);
		Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", candidate.getName().equals(name));
		Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", candidate.getParty().equals(party));
		Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", candidate.getNumber() == number);
	}

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
