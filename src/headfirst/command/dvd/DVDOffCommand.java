package headfirst.command.dvd;

public class DVDOffCommand implements Command{//on-off�� ���� �־�� execute ����ȴ�
  DVD dvd;//package private
  public DVDOffCommand(DVD dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.off();//��ü�� ���е����� �ǻ� light,onȣ��
  }
  public void undo(){//�� ��� ����
    dvd.on();
    dvd.setDVD();
    dvd.setVolume(10);
    
  }
}