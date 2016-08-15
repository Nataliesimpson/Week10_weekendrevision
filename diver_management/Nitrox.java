package diver_management;
import behaviours.*;

public class Nitrox extends Breather implements Diveable {

  int diveTime;

  public Nitrox(String type, int diveTime){
    super(type);
    this.diveTime = diveTime;
  }

  public int getDiveTime(){
    return this.diveTime;
  }

  public String dive(){
    return "Diving for longer on enriched NITROX air!";
  }

}