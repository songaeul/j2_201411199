package headfirst.command.simpleremote;

public class LightOnCommand implements Command{//on-off가 따로 있어야 execute 실행된다
  Light light;//package private
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    light.on();//객체가 은닉되지만 실상 light,on호출
  }
}