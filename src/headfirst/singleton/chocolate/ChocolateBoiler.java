//no thread, lazy init(classic ver)
package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;//singleton패턴이랑은 관련 없음.
  private ChocolateBoiler(){ //다른 객체는 못쓰지만 자신은 생성 가능 new ChocolateBoiler 생성 가능
    //lazy init
    empty = true; //boiler 초기화
    boiled = false;
  }
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();//new 쓰면 안되는데 여기서는 왜 사용하나?
    }
    System.out.println("number called"+numCalled++);
    return uniqueInstance;
  }
  public void fill(){
    if(isEmpty()){
      System.out.println("it is now empty and is being filled...");
      empty=false;
      boiled=false;
    }
  }
  public void drain(){
    if(!isEmpty() && isBoiled()){
      empty = true;
    }
  }
  public void boil(){
    if(!isEmpty() && !isBoiled()){
    boiled = true;
    }
  }
  public boolean isEmpty(){
    return empty;
  }
  public boolean isBoiled(){
    return boiled;
  }
}