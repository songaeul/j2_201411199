package com.sd.address.v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Iterator;
 
public class AddressBook{
  public AddressBook(){
    
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(4,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("이름");
    JLabel label2=new JLabel("주소");
    
    JTextField f1=new JTextField(8);
    JTextField f2=new JTextField(30);
    
    JButton btinsert=new JButton("등록");
    JButton btfindByName=new JButton("이름 찾기");
    JButton btdelete=new JButton("삭제");
    JButton btfindAll=new JButton("주소록 보여주기");
    
    //등록 버튼 클릭 시  일어나는  행동 설정 
    btinsert.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        PersonDAOImpl personDAOImpl = new PersonDAOImpl();
        PersonVO person = new PersonVO();
        
        String fname=f1.getText();
        String faddress=f2.getText();
        person.setName(fname);
        person.setAddress(faddress);
        personDAOImpl.insert(person);
        
      }
    });
    
     //삭제 버튼 클릭 시 일어나는  행동 설정 
     btdelete.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       String fname=f1.getText();
       
       personDAOImpl.delete(fname);
       System.out.println("delete ...");
       
       
     }
     });
     
    //주소록 보여주기 버튼 클릭 시  일어나는  행동 설정 
    btfindAll.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       PersonVO person = new PersonVO();
       List persons=personDAOImpl.findAll();
       Iterator iter=persons.iterator();
       while(iter.hasNext()) {
         person=(PersonVO)iter.next();
         System.out.println(person.toString());
       }

       
     }
     });
    
    //이름찾기 버튼 클릭 시  일어나는  행동 설정      
    btfindByName.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       PersonVO person = new PersonVO();
       String fname=f1.getText();
       
       person=personDAOImpl.findByName(fname);
       System.out.println("found by name... "+person);
       
     }
     });
      
      
    panel.add(label1);
    panel.add(f1);
    panel.add(label2);
    panel.add(f2);
    panel.add(btinsert);
    panel.add(btdelete);
    panel.add(btfindByName);
    panel.add(btfindAll);
    f.pack();
    f.setVisible(true);
  } 
}