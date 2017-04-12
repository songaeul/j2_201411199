package com.sd.myFile;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;;
import java.io.Reader;
import java.io.File;


public class FileDemoMain {
  public static void main(String[] args)throws Exception{  
    File readme = null;//함수내의 누구나 readme를 볼 수 있게
    InputStream isReadme = null;
    BufferedReader brReadme = null;
    InputStreamReader isrReadme = null;
    char c;
    String str;
    StringBuffer sbuffer = new StringBuffer();
    int i;
    try{
      File myhome = new  File(System.getProperty("user.home"));
      System.out.println("myhome is " + myhome);
      String cwd = new File(".").getCanonicalPath();
      readme = new File(cwd, "hello.txt");
      isReadme = new FileInputStream(readme);
      while((i=isReadme.read())!= -1){// ASKII 0-255, -1은 문자를 끝까지 다 읽었다고하는 것
        System.out.print((char)i);  
      }
      
    }catch (Exception e){
      e.printStackTrace();
    }finally{
      if(isReadme != null)
        isReadme.close();
      
    }
    try{
      isReadme = new FileInputStream(readme);
      isrReadme = new InputStreamReader(isReadme,"UTF8");
      brReadme = new BufferedReader(isrReadme);
      while((i=brReadme.read())!=-1){
        c=(char)i;
        System.out.print((char)i);
        sbuffer.append(c);
      }
      System.out.println("--"+sbuffer.toString());
      while((str=brReadme.readLine())!=null){
        System.out.println("--"+str);
      }
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      if(brReadme != null)
        brReadme.close();
    
      
    }
  }
}