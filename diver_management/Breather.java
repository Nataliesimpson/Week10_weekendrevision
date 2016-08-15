package diver_management;

public abstract class Breather {

  String type;

  public Breather(String type){
    this.type = type;
  }

  public String getType(){
    return this.type;
  }
}