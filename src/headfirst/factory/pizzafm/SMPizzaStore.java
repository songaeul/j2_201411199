package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
 public Pizza createPizza(String item) {
  Pizza pizza = null;
   if (item.equals("Cheese")) {
   pizza = new SMStyleCheesePizza();
  } 
  return pizza;
 }
}