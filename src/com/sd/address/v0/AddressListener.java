package com.sd.address.v0;

import java.awt.event.*;
import javax.swing.*;

public class AddressListener implements ActionListener{
   public void actionPerformed(ActionEvent e)//ActionListener���� �Դ�.
   {
  
     JButton b =(JButton)e.getSource(); 
     String cmd =e.getActionCommand();
     if(cmd.equals("���")){
        System.out.println("��� ��ư");
            b.setText("����߽��ϴ�");
     }
   }
}




