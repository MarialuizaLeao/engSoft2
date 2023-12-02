<<<<<<< HEAD:src/main/java/Governor.java
 
=======
package main.java;
>>>>>>> c7f5a062d99275f7fee24ddc25519bd11cae82f4:src/Governor.java
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
