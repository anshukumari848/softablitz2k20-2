/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
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
public class details implements ActionListener {
       
   private JFrame f;
   private JLabel l;
   private JButton b,b1,b2,b3;
  
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
        b.addActionListener(this);
        f.add(b);


         b2=new JButton("search");
       b2.setBouds(520,80,100,40);
       b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        f.add(b2);

         
         b1=new JButton(" remove");
       b1.setBouds(420,140,100,40);
       b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        f.add(b1);


         b3=new JButton("sort");
       b3.setBouds(520,140,100,40);
       b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        f.add(b3);



        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);
}
        public void actionPerformed(ActionEvent ae){
             if(ae.getSource()==b){
             f.setVisible(false);
             new add_items_and_details();
}
          if(ae.getSource()==b1){
             f.setVisible(false);
             new remove();
}
         if(ae.getSource()==b2){
             f.setVisible(false);
             new sort();
}
         if(ae.getSource()==b3){
             f.setVisible(false);
             new search();
}
}
    public static void main(string[] arg){
          details d=new details();
       
}
}


