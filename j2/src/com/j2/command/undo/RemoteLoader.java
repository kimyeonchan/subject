package com.j2.command.undo;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light("Living Room");
    LightOnCommand livingRoomLightOn = new LightOnCommand(light);
    LightOffCommand livingRoomLightOff = new LightOffCommand(light);
    remote.setCommand(0,livingRoomLightOn,livingRoomLightOff);
    remote.onButtonWasPressed(0);
    remote.offButtonWasPressed(0);
    remote.undoButtonWasPushed(); 
    remote.offButtonWasPressed(0);
    remote.onButtonWasPressed(0);
    remote.undoButtonWasPushed();
    TV tv = new TV("Living Room");
    TVOnCommand livingRoomTvOn = new TVOnCommand(tv);
    TVOffCommand livingRoomTvOff = new TVOffCommand(tv);
    remote.setCommand(1,livingRoomTvOn,livingRoomTvOff); 
    remote.onButtonWasPressed(1);
    remote.offButtonWasPressed(1);
    remote.undoButtonWasPushed(); 
    remote.offButtonWasPressed(1);
    remote.onButtonWasPressed(1);
    remote.undoButtonWasPushed();
    DVD dvd = new DVD("main Room");
    DVDOnCommand livingRoomDvdOn = new DVDOnCommand(dvd);
    DVDOffCommand livingRoomDvdOff = new DVDOffCommand(dvd);
    remote.setCommand(2,livingRoomDvdOn,livingRoomDvdOff); 
    remote.onButtonWasPressed(2);
    remote.offButtonWasPressed(2);
    remote.undoButtonWasPushed(); 
    remote.offButtonWasPressed(2);
    remote.onButtonWasPressed(2);
    remote.undoButtonWasPushed();
  }
}
    
    