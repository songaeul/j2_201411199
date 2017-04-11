package headfirst.decorator.starbuzz;

public class CaramelMachiato extends Espresso{
  public CaramelMachiato(){
    description = "CaramelMachiato";
  }
  public double cost(){
    return 1.99;
  }
}
