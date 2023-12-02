import java.util.Set;

public class Governor extends StateCandidate{

  public Governor(String name, String party, int number, String state) {
    super(name, party, number, state);
  }

  @Override
  public boolean equals(Object obj) {
      if (obj == this)
      return true;

      if (!(obj instanceof Governor))
      return false;

      var fd = (Governor) obj;

      return this.toString().equals(fd.toString());
  }

}
