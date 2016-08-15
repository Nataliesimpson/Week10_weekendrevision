import static org.junit.Assert.*;
import org.junit.*;
import diver_management.*;

public class AirTest {

  Air air;

  @Before
  public void before(){
    air = new Air("Compressed air", 45);
  }

  @Test
  public void hasType(){
    assertEquals("Compressed air", air.getType());
  }

  @Test
  public void hasDiveTime(){
    assertEquals(45, air.getDiveTime());
  }

}  