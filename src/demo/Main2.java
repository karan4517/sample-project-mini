/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class MyMouseListeners implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class Test2 extends MyMouseListeners implements ActionListener 
{
    JFrame jf; 
    JTextField jt;
    JButton jb1 , jb2 ;
    
    
    void createFrame()
    {
          jf=new JFrame();
         jf.setSize(600, 500);
         jf.setDefaultCloseOperation(3);
         jf.setLayout(null);
         
          jt=new JTextField();
         jt.setBounds(100, 50, 250 , 40 );
         jf.add(jt);
         
         jb1=new JButton("CLICK ME");
         jb1.addActionListener(this);
         jb1.addMouseListener(this);
         jb1.setBounds(100, 150, 120, 50);
         jf.add(jb1);
         
          jb2=new JButton("Clear ");
          jb2.addActionListener(this);
         jb2.setBounds(250, 150,120, 50);
         jf.add(jb2);
         
         jf.setVisible(true);
         
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==jb1)
        {
            String name=jt.getText();
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(jf, " Name cannot empty ");
            }
            else
            {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                JOptionPane.showMessageDialog(jf, "hello: " +name);
            }
            //System.out.println("hello : " +name);
            //JOptionPane.showMessageDialog(jf, "hello: " +name);
          }
        if(e.getSource()==jb2)
        {
            jt.setText("");
        }
    }


    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    if(e.getSource()==jb1){
        jb1.setBackground(Color.red);
        jb1.setForeground(Color.white);
    }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   if(e.getSource()==jb1){
       jb1.setBackground(null);
       jb1.setForeground(null);
   }
    }
}


public class Main2
{
    public static void main(String[] args) {
        
    
    Test2 t=new Test2 ();
    t.createFrame ();
    
}
}
