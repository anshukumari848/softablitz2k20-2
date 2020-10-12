/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registration_and_login;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author hp
 */
public class details implements ActionLinterner {
       
    JFrame f;
     JLabel l;
     JButton b,b1;
  
    details(){

       f=new JFrame("items detail");
       f.setBackground(color.white);
       f.setLayout(null);

        l=new JLabel("items detail");
       l.setBouds(420,20,200,40);
       l.setFont(new Font("serif",Font.BOLD,25));
        l.setForeground)(color.black);
        f.add(l);


         b=new JButton(" Add items");
       b.setBouds(420,80,100,40);
       b.setFont(new Font("serif",Font.BOLD,15));
        b.addActionlistener(this);
        f.add(b);

         
         b1=new JButton(" remove");
       b1.setBouds(420,140,100,40);
       b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionlistener(this);
        f.add(b1);


        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);
}
        public void actionPerformed(ActionEvent ae){
             if(ae.getSource()==b){
             f.setVisible(false);
             new add items and details();
}
          if(ae.getSource()==b1){
             f.setVisible(false);
             new remove();
}
}
    public static void main(string[]arg)
          details d=new detais();
       

}
