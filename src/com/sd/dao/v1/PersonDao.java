package com.sd.dao.v1;
import java.util.List;

public interface PersonDao{//테이블이 몇백개면 dao도 몇백개
    public void insert(Person p);
    public List<Person> findAll(); 
    public Person findById(int id);
    public void update(Person p);
    public void delete(int id);
    public void delete(Person p);
}