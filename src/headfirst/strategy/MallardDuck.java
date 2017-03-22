package headfirst.strategy;

public class MallardDuck extends Duck {//Duck = abstract, display()는 항상 있어야한다.
 
 public MallardDuck() {
 
  //quackBehavior = new Quack();
  //flyBehavior = new FlyWithWings();//sub class, flyBehavior은 Duck에서 물려받음.
  setFlyBehavior(new FlyWithWings());
  //setFlyBehavior(new FlyWithWings)로 해주는 것이 좋다.
 }
 
 public void display() {
  System.out.println("I'm a real Mallard duck");
 }
}