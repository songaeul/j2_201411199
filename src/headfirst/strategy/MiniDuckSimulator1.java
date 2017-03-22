package headfirst.strategy;

public class MiniDuckSimulator1 {
 
 public static void main(String[] args) {//MAIN함수//뒤에  넘겨줘야하는 파라미터 : string[] args, 프로그램 실행할떄 인자역할
 
  Duck mallard = new MallardDuck(); //(좌)Duck:SUPERCLASS ,(우)Mallarduck
  //mallard.performQuack();
  mallard.performFly();
   
  Duck model = new ModelDuck();
  model.performFly();
  model.setFlyBehavior(new FlyRocketPowered());//SWITCH하는 함수가 들어가있다.
  model.performFly();

 }
}