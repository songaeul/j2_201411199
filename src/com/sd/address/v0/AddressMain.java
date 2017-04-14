 package com.sd.address.v0;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddressMain {//화면 만들기
   public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(6,2));
      f.getContentPane().add(panel);
      JLabel label1=new JLabel("이름");
      JLabel label2=new JLabel("나이");
      JLabel label3=new JLabel("주소");
      JLabel label4=new JLabel("전화번호");
      JLabel label5=new JLabel("E-mail");
      JTextField areaTf1=new JTextField(20);
      JTextField areaTf2=new JTextField(20);
      JTextField areaTf3=new JTextField(20);
      JTextField areaTf4=new JTextField(20);
      JTextField areaTf5=new JTextField(20);
      JButton b1=new JButton("추가");
      JButton b2=new JButton("삭제");
      b1.addActionListener(new AddressListener());//button에 등록-register
      //loose coupling 되어었는 걸 연결 시켜줌
       panel.add(label1);
       panel.add(areaTf1);
       panel.add(label2);
       panel.add(areaTf2);
       panel.add(label3);
       panel.add(areaTf3);
       panel.add(label4);
       panel.add(areaTf4);
       panel.add(label5);
       panel.add(areaTf5);
       panel.add(b1);
       panel.add(b2);
        f.pack();
        f.setVisible(true);
    }   
}
      

