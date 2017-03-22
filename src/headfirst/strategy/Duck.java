package headfirst.strategy;//자바 가 들어있는 경로//디렉토리라고 생각해라!

public abstract class Duck{
  //FlyBehavior flyBehavior;//카드
  FlyBehavior flyBehavior;
  //QuackBehavior quackBehavior;
  
  public Duck(){
  }
  public void setFlyBehavior(FlyBehavior fb){//fb는 신한카드 //SUPER CLASS로 맵핑
    flyBehavior = fb; //fb = 카드(flyBehavior)를 신한카드로 바꿔줬다. 결국 fb는 신한카드다.
}
  //public void setQuackBehavior(QuackBehavior qb){
    //quackBehavior = qb;
  //}
  
  abstract void display();//하위클래스에 구현하는 거슬 위임할 때 함수 하나가 ABSTRACK이면 CLASS 전체가 ABSTRACT
  public void performFly(){
    flyBehavior.fly();
  }
  //public void performQuack(){
    //quackBehavior.quack();
  //}
  public void swim(){
  System.out.println("All ducks float, even decoys!");
  }
}

//인터페이스 잡는 것 까진 다음시간에(03/22)
