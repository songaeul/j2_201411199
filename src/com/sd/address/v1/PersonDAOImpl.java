package com.sd.address.v1;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class PersonDAOImpl implements PersonDAO{
  Connection conn=ConnectionFactory.getConnection();
  PreparedStatement pstmt=null;
  ResultSet rs=null;
  
  public void insert(PersonVO p){
    try{
      
      String mySql="insert into persons(name,address) values(?,?)";
      PreparedStatement pstmt=conn.prepareStatement(mySql);  
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      System.out.println("* inserting name:"+p.getName()+" /address:"+p.getAddress());

      pstmt.executeUpdate();
    }catch(SQLException e){
      e.printStackTrace();
    }
  }
  
  public PersonVO findByName(String name){
    
    PersonVO person=null;
    try {
      pstmt = conn.prepareStatement("SELECT * FROM persons WHERE name=?");
      pstmt.setString(1, name);
      System.out.println("* finding by name..."+name);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        person = new PersonVO();
        person.setId(rs.getInt("id"));
        person.setName(rs.getString("name"));
        person.setAddress(rs.getString("address"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return person;
  }
  
  
  public List<PersonVO> findAll(){
    List<PersonVO> persons=new ArrayList<PersonVO>();
    Statement stmt=null;
    try{
      stmt=conn.createStatement();
      rs= stmt.executeQuery("SELECT * FROM persons");
      PersonVO p=null;
      while(rs.next()){
        p=new PersonVO();
        p.setId(rs.getInt("id")); //id = 테이블 속성명
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p);
      }
    }catch(SQLException e){
      e.printStackTrace();
    }finally{
      try{
        if(stmt!=null)stmt.close();
      }catch(Exception e){};
    }
    return persons;
  }
  public void update(PersonVO p){
    try{
     pstmt=conn.prepareStatement("UPDATE persons SET name=?,address=? WHERE id=?");
     pstmt.setString(1,p.getName());
     pstmt.setString(2,p.getAddress());
     pstmt.setInt(3,p.getId());
     System.out.println("updating...");
     pstmt.executeUpdate();
         
    }catch(SQLException e){
      e.printStackTrace();
    }
  }

  public void delete(String name){
    try{
      PersonVO person=null;
      pstmt=conn.prepareStatement("DELETE FROM persons WHERE name=?");
      pstmt.setString(1,name);
      pstmt.executeUpdate();
      
    }catch(SQLException e){
      e.printStackTrace();
    }
    
  }
  public void close(){
    System.out.println("closing all...");
    try{
      if(rs!=null)rs.close(); //안닫아놓으면 메모리 초과 -> 스르르 죽음
      if(pstmt != null)pstmt.close();
      if(conn != null)conn.close();
    } catch(Exception e){}     
    
  }
  
}