package deco;

public abstract class decorator{
  String message = "No";
  
  public String getmessage(){
    return message;
  }
  
  public abstract int cost();
}