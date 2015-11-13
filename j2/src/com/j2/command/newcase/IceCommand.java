package com.j2.command.newcase;

public class IceCommand implements Command{
  Temperature temperature;
  public IceCommand(Temperature temperature){
    this.temperature = temperature;
  }
  public void execute(){
	  temperature.ice();
  }
}