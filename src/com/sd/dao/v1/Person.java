//List�� �����ؼ� DAO�� ����Ѵ�. JDBC�� ������� �ʴ´�.,person�� dao �и���

package com.sd.dao.v1;

public class Person{
  private int id;
  private String name;
  public Person(int id, String name){
    this.id = id;
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setName(String n){
    this.name = n;
  }
  public int getId(){
   return id;
  }
}