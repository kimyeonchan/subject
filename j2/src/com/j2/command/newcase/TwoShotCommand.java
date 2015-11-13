package com.j2.command.newcase;

public class TwoShotCommand implements Command{
  Americano americano;
  public TwoShotCommand(Americano americano){
    this.americano = americano;
  }
  public void execute(){
	  americano.Twoshot();
  }
}