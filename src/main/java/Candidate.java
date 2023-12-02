 

import java.util.Set;

public class Candidate {
  protected final String name;
  protected final String party;
  protected final int number;
  protected int numVotes;

  public Candidate(String name, String party, int number) {
    this.name = name;
    this.party = party;
    this.number = number;
    this.numVotes = 0;
  }

  public String getName() {
    return this.name;
  }

  public String getParty() {
    return this.party;
  }

  public int getNumber() {
    return this.number;
  }
}
