package headfirst.command.simpleremote;

import java.util.*;

public class SimpleRemoteControl{
  Command slot;
  public SimpleRemoteControl(){}
  public void setCommand(Command command){
    //리모컨 버튼에 command(light)연결 
    slot = command;
  }
  public void buttonWasPressed(){
    slot.execute();
  }
}