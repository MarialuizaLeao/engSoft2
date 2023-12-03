package test;

import main.Voter;

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

		Assert.assertEquals("O número do título eleitoral não está como definido pelo builder.", electoralCard, voter.getElectoralCard());
		Assert.assertEquals("O nome do eleitor não está como definido pelo builder.", name, voter.getName());
		Assert.assertEquals("O estado do eleitor não está como definido pelo builder.", state, voter.getState());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVoterBuilderWithNullElectoralCard() {
		String electoralCard = null;
		String name = "John Doe";
		String state = "SP";

		Voter voter = new Voter.Builder()
			.electoralCard(electoralCard)
			.name(name)
			.state(state)
			.build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testVoterBuilderWithInvalidState() {
		String electoralCard = "1234567890";
		String name = "John Doe";
		String state = "SJ";

		Voter voter = new Voter.Builder()
			.electoralCard(electoralCard)
			.name(name)
			.state(state)
			.build();
	}
}