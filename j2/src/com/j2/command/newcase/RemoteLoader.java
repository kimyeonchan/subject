package com.j2.command.newcase;

public class RemoteLoader{
  public static void main(String[] args){
    RemoteControlWithUndo remote = new RemoteControlWithUndo();
    Sugar sugar = new Sugar();
    OnesugarCommand onesugarCommand = new OnesugarCommand(sugar);
    NosugarCommand nosugarCommand = new NosugarCommand(sugar);
    TwosugarCommand twosugarCommand = new TwosugarCommand(sugar);

    Temperature temperature = new Temperature();
    HotCommand hotCommand = new HotCommand(temperature);
    IceCommand iceCommand = new IceCommand(temperature);

    Americano americano = new Americano();
    TwoShotCommand twoShotCommand = new TwoShotCommand(americano);
    OneShotCommand oneShotCommand = new OneShotCommand(americano);

    Command[] making1 = { onesugarCommand,iceCommand, twoShotCommand};
    Command[] making2 = { nosugarCommand, hotCommand, oneShotCommand};
    Command[] making3 = { twosugarCommand, iceCommand, twoShotCommand};
    MacroCommand makingmacro1 = new MacroCommand(making1); 
    MacroCommand makingmacro2 = new MacroCommand(making2);
    MacroCommand makingmacro3 = new MacroCommand(making3);
    remote.setCommand(0,makingmacro1); 
    remote.setCommand(1,makingmacro2); 
    remote.setCommand(2,makingmacro3); 
    System.out.println("makingmacro1 !!");
    remote.onButtonWasPressed(0);
    System.out.println("makingmacro2 !!");
    remote.onButtonWasPressed(1);
    System.out.println("makingmacro3 !!");
    remote.onButtonWasPressed(2);
  }
}
    
    
