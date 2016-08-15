import static org.junit.Assert.*;
import org.junit.*;
import diver_management.*;

public class NusaPenidaTest {

  NusaPenida nusaPenida;

  @Before
  public void before(){
    nusaPenida = new NusaPenida("Crystal Bay", "Drift Dive");
  }

  @Test
  public void hasName(){
    assertEquals("Crystal Bay", nusaPenida.getName());
  }

  @Test
  public void hasDiveType(){
    assertEquals("Drift Dive", nusaPenida.getDiveType());
  }

} 