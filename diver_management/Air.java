package diver_management;
import behaviours.*;

public class Air extends Breather implements Diveable {

  int diveTime;

  public Air(String type, int diveTime){
    super(type);
    this.diveTime = diveTime;
  }

  public int getDiveTime(){
    return this.diveTime;
  }

  public String dive(){
    return "Diving on normal compressed air!";
  }

}