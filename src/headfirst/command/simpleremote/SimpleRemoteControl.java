package headfirst.command.simpleremote;

import java.util.*;

public class SimpleRemoteControl{
  Command slot;
  public SimpleRemoteControl(){}
  public void setCommand(Command command){
    //������ ��ư�� command(light)���� 
    slot = command;
  }
  public void buttonWasPressed(){
    slot.execute();
  }
}