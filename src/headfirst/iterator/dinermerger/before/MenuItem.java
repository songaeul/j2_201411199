package headfirst.iterator.dinermerger.before;

public class MenuItem{
  String name;//package private
  String description;//���� ����
  boolean vegetarian;//ä��
  double price;//�޷�ȭ , ��ȭ�� �ٸ� Ÿ��
  public MenuItem(String n, String d, boolean v, double p){
    this.name = n;
    this.description = d;
    this.vegetarian =v;
    this. price = p;
  }//�����ؾ��ϴ� ���� -> MVC �� M�� ������ �Ѵ�.
  public String getName(){
    return name;
  }
  public String getDescription(){
    return description;
  }
  public double getPrice(){
    return price;
  }
  public boolean isVegetarian(){
    return vegetarian;
  }
  public String toString(){
    return (name+", $" + price + "\n " + description);
  } 

}