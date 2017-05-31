//List로 구현해서 DAO를 사용한다. JDBC를 사용하지 않는다.,person과 dao 분리패

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