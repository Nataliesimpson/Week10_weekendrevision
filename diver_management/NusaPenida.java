package diver_management;
import behaviours.*;

public class NusaPenida extends Location implements Accessible {

  String diveType;

  public NusaPenida(String name, String diveType){
    super(name);
    this.diveType = diveType;
  }

  public String getDiveType(){
    return this.diveType;
  }

  public String getLocation(){
    return "A drift dive at Nusa Penida!";
  }

}