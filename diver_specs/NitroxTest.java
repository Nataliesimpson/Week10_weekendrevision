import static org.junit.Assert.*;
import org.junit.*;
import diver_management.*;

public class NitroxTest {

  Nitrox nitrox;

  @Before
  public void before(){
    nitrox = new Nitrox("Enriched air", 60);
  }

  @Test
  public void hasType(){
    assertEquals("Enriched air", nitrox.getType());
  }

  @Test
  public void hasDiveTime(){
    assertEquals(60, nitrox.getDiveTime());
  }

} 