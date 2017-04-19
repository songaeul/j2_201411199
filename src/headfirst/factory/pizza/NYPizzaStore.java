package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
    public createPizza(String item){
    Pizza pizza = null;
    if(type.equals("Cheese")){
       pizza = new NYStyleCheesePizza();
    }
    
  return pizza;
  }

}