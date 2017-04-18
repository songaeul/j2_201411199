package headfirst.factory.pizza;

public class PizzaStore{
  SimplePizzaFactory f;
  public PizzaStore(SimplePizzaFactory factory){// �����ڸ� �־��ִ� ������ ���� �ٸ� �ΰ����� ������.
    this.f = factory;
  }
  public Pizza orderPizza(String type){ 
    Pizza pizza;
    pizza =f.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
}
}