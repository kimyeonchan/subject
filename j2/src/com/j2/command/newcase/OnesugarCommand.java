package com.j2.command.newcase;

public class OnesugarCommand implements Command{
  Sugar sugar;
  public OnesugarCommand(Sugar sugar){
    this.sugar = sugar;
  }
  public void execute(){
	  sugar.OneSugar();
  }
}