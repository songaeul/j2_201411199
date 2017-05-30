//v0 simple JDBC
//DAO 패턴을 사용하지 않고, 데이터를 입력, 수정, 삭제, 조회
package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn = null;//필요할 때 연결하는 것으로
    Statement stmt = null;
    try{//DB연결할때는 try-catch문 사용
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(String url, String user, String password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test"."root","root");//4단계
      conn=DriverManager.getConnection(
           prop.getProperty("URL"),
           prop.getProperty("USER"),
           prop.getProperty("PASSWORD"));
      String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";//DDL(생성)
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      stmt = conn.createStatement(); //executequery의 경우 리턴되는 것은 ResultSet
      stmt.execute(mySql);
    } catch(Exception e){
      e.printStackTrace();
    } finally{
      try{
      if(stmt != null)stmt.close();//안닫아놓으면 메모리 초과 -> 스르르 죽음
      if(conn != null)conn.close();
      } catch(Exception e){}     
      }
      }
  }