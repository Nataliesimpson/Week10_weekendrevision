import static org.junit.Assert.*;
import org.junit.*;
import diver_management.*;

public class TulambenTest {

  Tulamben tulamben;

  @Before
  public void before(){
    tulamben = new Tulamben("US Liberty", "Wreck Dive");
  }

  @Test
  public void hasName(){
    assertEquals("US Liberty", tulamben.getName());
  }

  @Test
  public void hasDiveType(){
    assertEquals("Wreck Dive", tulamben.getDiveType());
  }

} 