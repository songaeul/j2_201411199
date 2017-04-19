package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
 public Pizza createPizza(String item) {
  Pizza pizza = null;
   if (item.equals("Cheese")) {
   pizza = new ChicagoStyleCheesePizza();
  } 
  return pizza;
 }
}