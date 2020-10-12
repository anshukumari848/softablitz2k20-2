/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package registration_and_login;
   import java.sql.*;
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
/**
 *
 * @author hp
 */
public class remove implements ActionListener{
         
          JFrame f;
          JTextFeild t;
          JLabel l1,l2,l3; 
          JButton b,b1;

         conection con=null;
         preparedStatement ps=null;
         ResultSet rs=null;  

         remove(){    // creates form remove
           f=new JFrame("Remove item");
           f.setBackground(color.green);
           f.setLayout(null);
           
           l1=new JLable("item name");
            l1.setBounds(50,50,250,30);
            l1.setForeground(color.black);
           Font f2 =new Font("serif",Font.BOLD,20);
            l1.setFont(f2);
            f.add(l1);

            t=new JTextFeild();
            t.setBounds(250,50,150,30);
            f.add(t);
  
            b=new JButton("search");
             b.setBounds(200,100,100,30);
            b.addActionListener(this);
             f.add(b);

             l2=new JLable(" Name");
            l2.setBounds(50,150,250,30);
            l2.setForeground(color.white);
           Font f3 =new Font("serif",Font.BOLD,20);
            l2.setFont(f3);
            f.add(l2); 

              l3=new JLable();
            l3.setBounds(50,150,250,30);
            l3.setForeground(color.white);
           Font f2 =new Font("serif",Font.BOLD,20);
            l3.setFont(f4);
            f.add(l3);

             b1=new JButton("remove");
             b1.setBounds(120,300,100,30);
            b1.addActionListener(this);
             f.add(b1);
            
             b1.setVisible(false);
             l2.setVisible(false);
              
              f.setVisible(true);
              f.setSize(500,500);
              f.setLocation(500,250);
}  
              public void actionPerformed(ActionEvent evt){

                    if(evt.getSource()==b){
                        try{
                        string url="jdbc:mysql://localhost:3306/registration_detail";
                        string uname="root";
                        string password="webster";
                        con=DriverManager.getConnection(url,name,password);
  
                       string str="SELECT *FROM item WHERE name='"+t.setText()+"'";
                       ResultSet rs=con.ps.executeQuery(str);
                       
                       
                      int i=0;
                      if(rs.next()){
                          string name =rs.getString(item name);
            
                          l2.setVisible(true);
                          b1.setVisible(true);
                          l3.setText(name);

}  
                 if(i==0){
                 JOptionPane.showMessageDialog(null,"item name not found");    

}  catch(exception ex){
                     
}
}
          if(ae.getSource()==b1){

              try{ 
                  string url="jdbc:mysql://localhost:3306/registration_detail"
                        string uname="root";
                        string password="webster";
                        con=DriverManager.getConnection(url,name,password);
  
                       string str="DELETE * FROM items WHERE name='"+t.getText()+"'";
                       ResultSet rs=con.ps.executeUpdate(str);
                       JOptionPane.showMessageDialog(null,"deleted");
                        b1.setVisible(false);
                        l2.setVisible(false);
                        l3.setVisible(false);
}

            catch(Exception ex){

                 JOptionPane.showMessageDialog(null,"error");  


}

}
}

    public static void main(string[] arg){
         new remove();
}
}
