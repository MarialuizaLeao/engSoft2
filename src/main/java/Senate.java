package main.java;
import java.util.Set;

public class Senate extends StateCandidate {
  public Senate(String name, String party, int number, String state) {
    super(name, party, number, state);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this)
      return true;

    if (!(obj instanceof Senate))
      return false;

    var fd = (Senate) obj;

    return this.toString().equals(fd.toString());
  }
}