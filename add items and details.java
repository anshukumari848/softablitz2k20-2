/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registration_and_login;

import javax.swing.*;
import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
public class add items and details extends JFrame implements ActionListner {

          private JPanel contentPane;
          private JtextField t1,t2,t3,t4,t5;
          private JButton b1;

          conection con=null;
         preparedStatement ps=null;
         ResultSet rs=null;  

   public static void main(string[] args){
    new add items and details().setvisible(true);
}
   public add items and details(){
        setBounds(600,200,518,442);
        contentPane = new Jpanel();
        contentPane.setBorder(new Emptyborder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

    JLable l1 =new JLable("Name");
    l1.setForeground(new color(47,79,79));
    l1.setFont(new Font("Tahoma",Font.BOLD,14));
    l1.setBounds(73,90,22);
    contentPane.add(l1);

    JLable l2 =new JLable("Price");
    l2.setForeground(new color(47,79,79));
    l2.setFont(new Font("Tahoma",Font.BOLD,14));
    l2.setBounds(73,90,22);
    contentPane.add(l2);

    JLable l3 =new JLable("mfg Date");
    l3.setForeground(new color(47,79,79));
    l3.setFont(new Font("Tahoma",Font.BOLD,14));
    l3.setBounds(73,90,22);
    contentPane.add(l3);
 
    JLable l4 =new JLable("Expiry Date");
    l4.setForeground(new color(47,79,79));
    l4.setFont(new Font("Tahoma",Font.BOLD,14));
    l4.setBounds(73,90,22);
    contentPane.add(l4);

    JLable l5 =new JLable("Weight");
    l5.setForeground(new color(47,79,79));
    l5.setFont(new Font("Tahoma",Font.BOLD,14));
    l5.setBounds(73,90,22);
    contentPane.add(l5);

    t1=new JTextFeild();
    t1.setForeground(new color(47,79,79));
    t1.setFont(new Font("Trebuchet MS",font.BOLD,14));
    t1.setColoumns(10);
     t1.setBounds(169,120,198,20);
    contentPane.add(t1);

     t2=new JTextFeild();
    t2.setForeground(new color(47,79,79));
    t2.setFont(new Font("Trebuchet MS",font.BOLD,14));
    t2.setColoumns(10);
     t2.setBounds(169,120,198,20);
    contentPane.add(t2);

     t3=new JTextFeild();
    t3.setForeground(new color(47,79,79));
    t3.setFont(new Font("Trebuchet MS",font.BOLD,14));
    t3.setColoumns(10);
     t3.setBounds(169,120,198,20);
    contentPane.add(t3;

      t4=new JTextFeild();
    t4.setForeground(new color(47,79,79));
    t4.setFont(new Font("Trebuchet MS",font.BOLD,14));
    t4.setColoumns(10);
     t4.setBounds(169,120,198,20);
    contentPane.add(t4);

     t5=new JTextFeild();
    t5.setForeground(new color(47,79,79));
    t5.setFont(new Font("Trebuchet MS",font.BOLD,14));
    t5.setColoumns(10);
     t5.setBounds(169,120,198,20);
    contentPane.add(t5);
    
     b1=new JButton("Add");
     b1.addActionListener(this);
     b1.setBorder(new CompoundBoarder(new LineBorder(new Color(128,128,128)),null));
     b1.setBounds(100,300,100,22);
     b1.setFont(new Font("Trebuchet MS",font.BOLD,14));
     b1.setForeground(color.BLACK);
     b1.setBackground(color.WHITE);
     contentPane.add(b1);
}
     
     public void actionPerformed(ActionEvent evt){

       try{ 
             string url="jdbc:mysql://localhost:3306/registration_detail"
                        string uname="root";
                        string password="webster";
                        con=DriverManager.getConnection(url,name,password);
  

             if(evt.getSource()==b1){
                string sql ="INSERT into item(name,price,mfg data, expiry data,weight) value(?,?,?,?,?)";
                 preparedStatement ps=con.preparedStatement;
                  ps.setString(1, t1.getText());
                   ps.setString(2, t2.getText());
                   ps.setString(3, t3.getText());
                   ps.setString(4, t4.getText());
                    ps.setString(5, t5.getText());

                  int rs =ps.executeUpdate();
                   if(rs>0)
                     JoptionPane.showMessageDialog(null,"Successfully Added");
                   else
                    JoptionPane.showMessageDialog(null,"error");
                  t1.setText("");
                  t2.setText("");
                  t3.setText("");
                   t4.setText("");
                  t5.setText("");
                  ps.close();
      }
        
}
   catch(Exception e){

}
}
}
