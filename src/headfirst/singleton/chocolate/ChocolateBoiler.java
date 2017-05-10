//no thread, lazy init(classic ver)
package headfirst.singleton.chocolate;

public class ChocolateBoiler{
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;
  private static int numCalled=0;//singleton�����̶��� ���� ����.
  private ChocolateBoiler(){ //�ٸ� ��ü�� �������� �ڽ��� ���� ���� new ChocolateBoiler ���� ����
    //lazy init
    empty = true; //boiler �ʱ�ȭ
    boiled = false;
  }
  public static ChocolateBoiler getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new ChocolateBoiler();//new ���� �ȵǴµ� ���⼭�� �� ����ϳ�?
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