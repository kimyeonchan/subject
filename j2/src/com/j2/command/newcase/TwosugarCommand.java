package com.j2.command.newcase;

public class TwosugarCommand implements Command{
  Sugar sugar;
  public TwosugarCommand(Sugar sugar){
    this.sugar = sugar;
  }
  public void execute(){
	  sugar.TwoSugar();
  }
}