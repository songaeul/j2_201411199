package com.sd.address.v0;

import java.awt.event.*;
import javax.swing.*;

public class AddressListener implements ActionListener{
   public void actionPerformed(ActionEvent e)//ActionListener에서 왔다.
   {
  
     JButton b =(JButton)e.getSource(); 
     String cmd =e.getActionCommand();
     if(cmd.equals("계산")){
        System.out.println("계산 버튼");
            b.setText("계산했습니다");
     }
   }
}




