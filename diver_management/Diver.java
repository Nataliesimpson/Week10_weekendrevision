package diver_management;
import behaviours.*;

public class Diver {
  String name;
  String certification;
  Diveable tank;
  Accessible travel;

  public Diver(String name, String certification, Diveable tank, Accessible travel){
    this.name = name;
    this.certification = certification;
    this.tank = tank;
    this.travel = travel;
  }

  public String getName(){
    return this.name;
  }

  public String getCertification(){
    return this.certification;
  }

  public Diveable getTank(){
    return this.tank;
  }

  public void setTank(Diveable tank) {
    this.tank = tank;
  }

  public String dive(){
    return this.tank.dive();
  }

  public Accessible getTravel(){
    return this.travel;
  }

  public void setTravel(Accessible travel) {
    this.travel = travel;
  }

  public String getLocation(){
    return this.travel.getLocation();
  }

}