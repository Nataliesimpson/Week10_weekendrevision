import static org.junit.Assert.*;
import org.junit.*;
import diver_management.*;

public class DiverTest {
  Diver diver;
  Nitrox nitrox;
  NusaPenida nusaPenida;

@Before
public void before(){
  nitrox = new Nitrox("Enriched air", 60);
  diver = new Diver("Nat", "AOW", nitrox, nusaPenida);
  nusaPenida = new NusaPenida("Crystal Bay", "Drift Dive");
}

@Test
public void hasName(){
  assertEquals("Nat", diver.getName());
}

@Test
public void hasCertification(){
  assertEquals("AOW", diver.getCertification());
}

@Test
public void canDive(){
  assertEquals("Diving for longer on enriched NITROX air!", diver.dive());
}

@Test
public void canSetTank(){
  Air air = new Air("Compressed Air", 45);
  diver.setTank(air);
  assertEquals(diver.dive(), "Diving on normal compressed air!");
}

// @Test
// public void canGetLocation(){
//   assertEquals("A drift dive at Nusa Penida!", diver.getLocation());
// }

@Test
public void canSetTravel(){
  Tulamben tulamben = new Tulamben("US Liberty", "Wreck Dive");
  diver.setTravel(tulamben);
  assertEquals(diver.getLocation(), "A dive on the US Liberty at Tulamben!");
}

}