package headfirst.command.simpleremote;

public class LightOnCommand implements Command{//on-off�� ���� �־�� execute ����ȴ�
  Light light;//package private
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    light.on();//��ü�� ���е����� �ǻ� light,onȣ��
  }
}