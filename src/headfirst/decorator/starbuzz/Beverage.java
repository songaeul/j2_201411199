package headfirst.decorator.starbuzz;

public abstract class Beverage {
  String description = "unknown Beverage";
    public String getDescription(){ //get�� �о���� �Ŵϱ� ���ڰ� ����.
    return description;
    }
    public abstract double cost();//�̱� ��,abstract = ������ �ڷ� �̷�.,�̱��� ���·� ���� �� ,�Ӽ�
}