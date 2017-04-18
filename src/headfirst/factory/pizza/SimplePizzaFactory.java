package headfirst.factory.pizza;

public class SimplePizzaFactory{//pizza�� ������ִ� �Լ�x -> factory ����
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.equals("Cheese")){
       pizza = new CheesePizza();
    }
    else if (type.equals("Potato")){
       pizza = new PotatoPizza();
    }
  return pizza;
  }
}