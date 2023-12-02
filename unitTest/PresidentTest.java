package unitTest;

import main.*;
import org.junit.*;

public class PresidentTest {
  @Test
  public void testPresidentBuilder(){

    String name = "Alberto";
    String party = "PV";
    int number = 12;

    President pres = new President(name, party, number);

    Assert.assertTrue("O nome do candidato nao esta como definido pelo builder.", pres.getName().equals(name));
    Assert.assertTrue("O partido do candidato nao esta como definido pelo builder.", pres.getParty().equals(party));
    Assert.assertTrue("O numero do candidato nao esta como definido pelo builder.", pres.getNumber() == number);
  }
}