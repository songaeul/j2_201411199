package headfirst.command.dvd;

public class DVDOnCommand implements Command{
  DVD dvd; 
  public DVDOnCommand(DVD dvd){
    this.dvd=dvd;
    
  }
  public void execute(){
    dvd.on();
    dvd.setDVD();
    dvd.setVolume(10);
  }
  public void undo(){
    dvd.off();
  }
}