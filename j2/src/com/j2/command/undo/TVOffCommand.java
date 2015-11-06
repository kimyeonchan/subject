package com.j2.command.undo;

public class TVOffCommand implements Command{
  TV tv;
  int level;
  public TVOffCommand(TV tv){
    this.tv = tv;
  }
  public void execute(){
    level =tv.getLevel();
    tv.off();
  }
  public void undo(){
    tv.dim(level);
  }
}