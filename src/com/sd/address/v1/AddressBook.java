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
    JLabel label1=new JLabel("�̸�");
    JLabel label2=new JLabel("�ּ�");
    
    JTextField f1=new JTextField(8);
    JTextField f2=new JTextField(30);
    
    JButton btinsert=new JButton("���");
    JButton btfindByName=new JButton("�̸� ã��");
    JButton btdelete=new JButton("����");
    JButton btfindAll=new JButton("�ּҷ� �����ֱ�");
    
    //��� ��ư Ŭ�� ��  �Ͼ��  �ൿ ���� 
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
    
     //���� ��ư Ŭ�� �� �Ͼ��  �ൿ ���� 
     btdelete.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     { PersonDAOImpl personDAOImpl = new PersonDAOImpl();
       String fname=f1.getText();
       
       personDAOImpl.delete(fname);
       System.out.println("delete ...");
       
       
     }
     });
     
    //�ּҷ� �����ֱ� ��ư Ŭ�� ��  �Ͼ��  �ൿ ���� 
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
    
    //�̸�ã�� ��ư Ŭ�� ��  �Ͼ��  �ൿ ����      
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