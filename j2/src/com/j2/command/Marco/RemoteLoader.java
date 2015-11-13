package com.j2.command.Macro;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Light light = new Light("Living Room");
    LightOnCommand livingRoomLightOn = new LightOnCommand(light);
    LightOffCommand livingRoomLightOff = new LightOffCommand(light);

    TV tv = new TV("Living Room");
    TVOnCommand livingRoomTvOn = new TVOnCommand(tv);
    TVOffCommand livingRoomTvOff = new TVOffCommand(tv);

    DVD dvd = new DVD("main Room");
    DVDOnCommand livingRoomDvdOn = new DVDOnCommand(dvd);
    DVDOffCommand livingRoomDvdOff = new DVDOffCommand(dvd);

    Command[] livingRoomOn = { livingRoomLightOn,livingRoomTvOn, livingRoomDvdOn};
    Command[] livingRoomOff = { livingRoomLightOff, livingRoomTvOff, livingRoomDvdOff};
    MacroCommand livingRoomOnMacro = new MacroCommand(livingRoomOn); 
    MacroCommand livingRoomOffMacro = new MacroCommand(livingRoomOff);
    remote.setCommand(0,livingRoomOnMacro,livingRoomOffMacro); 
    System.out.println("livingRoomOnMacro !!");
    remote.onButtonWasPressed(0);
    System.out.println("livingRoomOffMacro !!");
    remote.offButtonWasPressed(0);
  }
}
    
    
