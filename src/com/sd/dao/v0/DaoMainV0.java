//v0 simple JDBC
//DAO ������ ������� �ʰ�, �����͸� �Է�, ����, ����, ��ȸ
package com.sd.dao.v0;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class DaoMainV0{
  public static void main(String[] args){
    Connection conn = null;//�ʿ��� �� �����ϴ� ������
    Statement stmt = null;
    try{//DB�����Ҷ��� try-catch�� ���
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(String url, String user, String password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test"."root","root");//4�ܰ�
      conn=DriverManager.getConnection(
           prop.getProperty("URL"),
           prop.getProperty("USER"),
           prop.getProperty("PASSWORD"));
      String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";//DDL(����)
      mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      stmt = conn.createStatement(); //executequery�� ��� ���ϵǴ� ���� ResultSet
      stmt.execute(mySql);
    } catch(Exception e){
      e.printStackTrace();
    } finally{
      try{
      if(stmt != null)stmt.close();//�ȴݾƳ����� �޸� �ʰ� -> ������ ����
      if(conn != null)conn.close();
      } catch(Exception e){}     
      }
      }
  }