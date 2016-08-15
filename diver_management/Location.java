package diver_management;

public abstract class Location {

  String name;

  public Location(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }
}