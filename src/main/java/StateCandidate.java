<<<<<<< HEAD:src/main/java/StateCandidate.java
 

=======
package main.java;
>>>>>>> c7f5a062d99275f7fee24ddc25519bd11cae82f4:src/StateCandidate.java
import java.util.Set;

public class StateCandidate extends Candidate{
  protected final String state;

  public StateCandidate(String name, String party, int number, String state) {
    super(name, party, number);

    if (state == null)
      throw new IllegalArgumentException("state mustn't be null");

    if (state.isEmpty())
      throw new IllegalArgumentException("state mustn't be empty");

    Set<String> validStates = Set.of("AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG",
      "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO");

    if (!validStates.contains(state))
      throw new IllegalArgumentException("state is invalid");

    this.state = state;
  }

  @Override
  public String toString() {
    return super.name + super.party + super.number + this.state;
  }

  @Override
  public boolean equals(Object obj) {
      if (obj == this)
      return true;

      if (!(obj instanceof StateCandidate))
      return false;

      var fd = (StateCandidate) obj;

      return this.toString().equals(fd.toString());
  }

  public String getState(){
        return this.state;
    }
}
