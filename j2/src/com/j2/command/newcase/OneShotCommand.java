package com.j2.command.newcase;

public class OneShotCommand implements Command{
  Americano americano;
  public OneShotCommand(Americano americano){
    this.americano = americano;
  }
  public void execute(){
	  americano.Oneshot();
  }
}