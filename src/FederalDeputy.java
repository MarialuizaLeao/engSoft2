import java.util.Set;

public class FederalDeputy extends StateCandidate {
  public FederalDeputy(String name, String party, int number, String state) {
    super(name, party, number, state);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;

    if (!(obj instanceof FederalDeputy))
      return false;

    var fd = (FederalDeputy) obj;

    return this.toString().equals(fd.toString());
  }
}