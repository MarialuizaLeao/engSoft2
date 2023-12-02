package test;

import main.Voter;

import java.beans.Transient;

import org.junit.*;

public class VoterTest {
	@Test
	public void testVoterBuilder() {
		String electoralCard = "1234567890";
		String name = "John Doe";
		String state = "SP";

		Voter voter = new Voter.Builder()
			.electoralCard(electoralCard)
			.name(name)
			.state(state)
			.build();

		Assert.assertEquals("O número do título eleitoral não está como definido pelo builder.", electoralCard, voter.electoralCard);
		Assert.assertEquals("O nome do eleitor não está como definido pelo builder.", name, voter.name);
		Assert.assertEquals("O estado do eleitor não está como definido pelo builder.", state, voter.state);
	}

  // Add more test cases as needed
}