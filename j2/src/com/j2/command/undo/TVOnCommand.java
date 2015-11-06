package com.j2.command.undo;

public class TVOnCommand implements Command{
  TV tv;
  int level;
  public TVOnCommand(TV tv){
    this.tv = tv;
  }
  public void execute(){
    level =tv.getLevel();
    tv.on();
  }
  public void undo(){
    tv.dim(level);
  }
}