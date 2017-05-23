package headfirst.command.undo;
//Null pattern
public class NoCommand implements Command{
  public void execute(){}
  public void undo(){}
}