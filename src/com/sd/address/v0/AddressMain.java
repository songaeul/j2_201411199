 package com.sd.address.v0;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddressMain {//ȭ�� �����
   public static void main(String[] args) {
      JFrame f=new JFrame();
      JPanel panel=new JPanel(new GridLayout(6,2));
      f.getContentPane().add(panel);
      JLabel label1=new JLabel("�̸�");
      JLabel label2=new JLabel("����");
      JLabel label3=new JLabel("�ּ�");
      JLabel label4=new JLabel("��ȭ��ȣ");
      JLabel label5=new JLabel("E-mail");
      JTextField areaTf1=new JTextField(20);
      JTextField areaTf2=new JTextField(20);
      JTextField areaTf3=new JTextField(20);
      JTextField areaTf4=new JTextField(20);
      JTextField areaTf5=new JTextField(20);
      JButton b1=new JButton("�߰�");
      JButton b2=new JButton("����");
      b1.addActionListener(new AddressListener());//button�� ���-register
      //loose coupling �Ǿ���� �� ���� ������
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
      

