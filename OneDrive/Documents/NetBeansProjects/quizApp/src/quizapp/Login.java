/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Gopal Sharma
 */
public class Login extends JFrame implements ActionListener{
    JButton back,next;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon iI=new ImageIcon(ClassLoader.getSystemResource("quizapp/main.jpg"));
        JLabel image=new JLabel(iI);
        image.setBounds(0,0,620,360);
        add(image);
        
        JLabel heading=new JLabel("creative quiz");
        heading.setBounds(680,65,250,45);
        heading.setFont(new Font("mongolian baiti",Font.BOLD,25));
        heading.setForeground(new Color(6, 54, 143));
        add(heading);
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(681,150,250,25);
        name.setFont(new Font("mongolian baiti",Font.BOLD,16));
        name.setForeground(new Color(6, 54, 143));
        add(name);
        
        tfname =new JTextField();
        tfname.setBounds(650,185,200,25);
        tfname.setFont(new Font("mongolian baiti",Font.BOLD,20));
        add(tfname);
        
        back=new JButton("Back");
        back.setBounds(650,250,80,25);
        back.setBackground(new Color(6, 54, 143));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        next=new JButton("Next");
        next.setBounds(770,250,80,25);
        next.setBackground(new Color(6, 54, 143));
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);
        
        setSize(900,400);
        setLocation(250,120);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==next){
            String name=tfname.getText();
            setVisible(false);
            new Next(name);
        }
        else if (ae.getSource()==back){
          setVisible(false);  
        }
    }
    public static void main(String args[]){
        Login login=new Login();
    }
}
