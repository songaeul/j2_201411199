package headfirst.factory.pizza;

public class PizzaStore{
  SimplePizzaFactory f;
  public PizzaStore(SimplePizzaFactory factory){// 생성자를 넣어주는 시점에 따라 다른 두가지로 나뉜다.
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