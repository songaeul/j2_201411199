package headfirst.decorator.starbuzz;

public abstract class Beverage {
  String description = "unknown Beverage";
    public String getDescription(){ //get은 읽어오는 거니까 인자가 없다.
    return description;
    }
    public abstract double cost();//미국 돈,abstract = 구현을 뒤로 미룸.,미구현 상태로 남은 것 ,속성
}