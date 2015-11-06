package com.j2.command.newcase;

public class HotCommand implements Command{
  Temperature temperature;
  public HotCommand(Temperature temperature){
    this.temperature = temperature;
  }
  public void execute(){
	  temperature.hot();
  }
}