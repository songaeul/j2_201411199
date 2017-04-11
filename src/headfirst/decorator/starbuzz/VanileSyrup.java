package headfirst.decorator.starbuzz;

public class VanileSyrup extends CondimentDecorator {
 Beverage beverage;

 public VanileSyrup(Beverage beverage) {
  this.beverage = beverage;
 }

 public String getDescription() {
  return beverage.getDescription() + ", VanileSyrup";
 }

 public double cost() {
  return .15 + beverage.cost();
 }
}