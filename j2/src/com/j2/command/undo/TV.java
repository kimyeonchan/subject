package com.j2.command.undo;

public class TV{
  int level;
  String location;
  public TV(String location){
    this.location=location;
  }
  public void on(){
    level = 100;
    System.out.println("TV is on");
  }
  
  public void off(){
    level = 0;
    System.out.println("TV is off");
  }
  public int getLevel(){
    return level;
  }
  
  public void dim(int level){
    this.level = level;
    if(level==0){
      off();
    }
    else
      System.out.println("TV is dimmed to "+level);
  }
}