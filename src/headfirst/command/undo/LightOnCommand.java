package headfirst.command.undo;

public class LightOnCommand implements Command{//on-off가 따로 있어야 execute 실행된다
  Light light;//package private
  int level;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    level=light.getLevel()//현재 불 밝기 저장
    light.on();//객체가 은닉되지만 실상 light,on호출
  }
  public void undo(){//불 밝기 조절
    lignt.dim(level);
  }
}