package headfirst.command.undo;

public class LightOnCommand implements Command{//on-off�� ���� �־�� execute ����ȴ�
  Light light;//package private
  int level;
  public LightOnCommand(Light light){
    this.light = light;
  }
  public void execute(){
    level=light.getLevel()//���� �� ��� ����
    light.on();//��ü�� ���е����� �ǻ� light,onȣ��
  }
  public void undo(){//�� ��� ����
    lignt.dim(level);
  }
}