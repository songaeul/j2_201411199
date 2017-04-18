package headfirst.factory.pizza;

public class SimplePizzaFactory{//pizza를 만들어주는 함수x -> factory 생성
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