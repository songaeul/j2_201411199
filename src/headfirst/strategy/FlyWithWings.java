package headfirst.strategy;

public class FlyWithWings implements FlyBehavior {//FlyBehavior interface로 strategy역할을 한다.,FlyBehavior = marker,
  //다라서 FlyBehavior 아래의 함수를 그대로 써준다.
 public void fly() {
  System.out.println("I'm flying!!");
 }
}