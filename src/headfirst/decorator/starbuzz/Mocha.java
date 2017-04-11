package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator{
   Beverage beverage;//has-a����
   //String description = "unknown Beverage";
   public Mocha(Beverage b){//���ȿ� ���ִ�.
     this.beverage = b;     //����ͼ� ��μ� black diamond
   }
   public  String getDescription(){
    return beverage.getDescription()+" , Mocha";//decorating
   }
   public double cost(){
    return beverage.cost()+.20;
}
}





