package diver_management;
import behaviours.*;

public class Tulamben extends Location implements Accessible {

  String diveType;

  public Tulamben(String name, String diveType){
    super(name);
    this.diveType = diveType;
  }

  public String getDiveType(){
    return this.diveType;
  }

  public String getLocation(){
    return "A dive on the US Liberty at Tulamben!";
  }

}