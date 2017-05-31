package com.sd.dao.v1;

public class DaoMainV1{
  public static void main(String[] args){
  Person p;
  PersonDao pDao = new PersonDaoImpl();
  //insert
  p = new Person(0,"v1-0");
  pDao.insert(p);
  p= new Person(1,"v1-1");
  pDao.insert(p);
  
  for(Person pi: pDao.findAll()){
   System.out.println(pi.getId()+"  "+pi.getName());
  }
  
  //Update
  p=pDao.findAll().get(0);
  p.setName("v1-0 new");
  pDao.update(p);
  
  p=pDao.findById(0);
  System.out.println(p.getId() + "  "+ p.getName());
  
  //delete
  for(Person pi : pDao.findAll()){
   System.out.println(pi.getId()+"  "+pi.getName());
  }
}
}