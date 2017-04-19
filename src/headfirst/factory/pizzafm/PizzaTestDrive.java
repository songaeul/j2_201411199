package headfirst.factory.pizzafm;

public class PizzaTestDrive{
  public static void main(String[] args){
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore ChicagoStore = new ChicagoPizzaStore();
    PizzaStore SMStore = new SMPizzaStore();
    Pizza pizza = nyStore.orderPizza("Cheese");
    System.out.println("ge ordered a" + pizza.getName()+"\n");
    pizza = ChicagoStore.orderPizza("Cheese");
    System.out.println("bk ordered a" + pizza.getName()+"\n");
    pizza = SMStore.orderPizza("Cheese");
    System.out.println("ny ordered a" + pizza.getName()+"\n");
  }
}