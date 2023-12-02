package test;

import main.*;
import org.junit.*;

public class PresidentTest {
  @Test
  public void testPresidentBuilder(){
    String name = "Alberto";
    String party = "PV";
    int number = 12;

    President pres = new President.Builder()
        .name(name)
        .party(party)
        .number(number)
        .build();

    assertTrue("O nome do candidato nao esta como definido pelo builder.", pres.getName().equals(name));
    assertTrue("O partido do candidato nao esta como definido pelo builder.", pres.getParty().equals(party));
    assertTrue("O numero do candidato nao esta como definido pelo builder.", pres.getNumber() == number);
  }

  @Test
  public void testPresidentConstructor(){
    String name = "Alberto";
    String party = "PV";
    int number = 12;

    President pres = new President(name, party, number);

    assertEquals("O nome do candidato nao esta como definido pelo construtor.", name, pres.getName());
    assertEquals("O partido do candidato nao esta como definido pelo construtor.", party, pres.getParty());
    assertEquals("O numero do candidato nao esta como definido pelo construtor.", number, pres.getNumber());
  }
}