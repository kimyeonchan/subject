package com.j2.command.newcase;

public class RemoteControlWithUndo{
 Command[] makeCommands;
 public RemoteControlWithUndo(){
   makeCommands = new Command[7];
   Command noCommand = new NoCommand();
   for(int i=0;i<7;i++){
     makeCommands[i] = noCommand;
   }
 }
 public void setCommand(int slot,Command make){
	 makeCommands[slot] = make;
 }
 public void onButtonWasPressed(int slot){
	 makeCommands[slot].execute();
 }
}