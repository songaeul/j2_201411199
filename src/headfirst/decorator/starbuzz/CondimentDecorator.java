package headfirst.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage{
  //Beverage b;
  //public CondimentDecorator(Beverage b){//블랙다이아몬드상태
  //  this.b=b:
  //}
  //String description = "unknown Beverage";
  public abstract String getDescription();
  //public abstract double cost();
}