package com.j2.command.newcase;

public class NosugarCommand implements Command{
  Sugar sugar;
  public NosugarCommand(Sugar sugar){
    this.sugar = sugar;
  }
  public void execute(){
	  sugar.NoSugar();
  }
}