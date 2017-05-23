package headfirst.command.dvd;

public class DVDOffCommand implements Command{//on-off가 따로 있어야 execute 실행된다
  DVD dvd;//package private
  public DVDOffCommand(DVD dvd){
    this.dvd = dvd;
  }
  public void execute(){
    dvd.off();//객체가 은닉되지만 실상 light,on호출
  }
  public void undo(){//불 밝기 조절
    dvd.on();
    dvd.setDVD();
    dvd.setVolume(10);
    
  }
}