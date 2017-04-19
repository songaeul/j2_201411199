package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore{
   public Pizza createPizza(String item){
    Pizza pizza = null;
     if(item.equals("Cheese")){
       pizza = new NYStyleCheesePizza();
    }
    
  return pizza;
  }

}