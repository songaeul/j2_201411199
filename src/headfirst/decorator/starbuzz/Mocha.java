package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
   Beverage beverage;//has-a관계
   //String description = "unknown Beverage";
   public Mocha(Beverage b){//내안에 너있다.
     this.beverage = b;     //여기와서 비로소 black diamond
   }
   public  String getDescription(){
    return beverage.getDescription()+" , Mocha";//decorating
   }
   public double cost(){
    return beverage.cost()+.20;
}
}





