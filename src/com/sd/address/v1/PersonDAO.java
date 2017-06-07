package com.sd.address.v1;

import java.util.List;

public interface PersonDAO{//테이블이 몇 백개면 dao도 
  public void insert(PersonVO p);
  public List<PersonVO> findAll();
  public PersonVO findByName(String name);
  public void update(PersonVO p);
  public void delete(String name);

}