package headfirst.command.undo;

public class Light{
  int level;
  public Light(){
  }
  public void on(){
    System.out.println("Light is on");
  } 
  public int getLevel(){
    return level;
  }
  public void dim(int level){
    this.level=level;
  }
}