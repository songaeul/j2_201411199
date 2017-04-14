package com.sd.address.v0;

import java.awt.event.*;
import javax.swing.*;

public class AddressListener implements ActionListener{
   public void actionPerformed(ActionEvent e)//ActionListener에서 왔다.
   {
  
     JButton b =(JButton)e.getSource(); 
     String cmd =e.getActionCommand();
     if(cmd.equals("추가")){
        System.out.println("추가 버튼");
            b.setText("추가했습니다");
     }
   }
}




