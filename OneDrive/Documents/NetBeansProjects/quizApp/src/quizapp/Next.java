/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Gopal Sharma
 */
public class Next extends JFrame implements ActionListener {
    JButton back,Start;
    String name;
    Next(String name){
        this.name=name;
     getContentPane().setBackground(Color.WHITE);
     setLayout(null);
     
     JLabel heading=new JLabel("welcome "+name+ " to creative quiz");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("mongolian baiti",Font.BOLD,25));
        heading.setForeground(new Color(6, 54, 143));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,50,650,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
            "<html>"+
               "1. There are total 10 questions "+"<br><br>"+
               "2. Each question carry ten mark"+"<br><br>"+
               "3. Each question has 15 sec to complete"+"<br><br>"+
               "4. There is no negative marking"+"<br><br>"+
               "5. Need to submit on time"+"<br><br>"+
               "6. please be carefull"+"<br><br>"+
               "7. Do not cheat"+"<br><br>"+
               
            "<html>"        
        );
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(360,365,80,27);
        back.setBackground(new Color(6, 54, 143));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        Start=new JButton("Start");
        Start.setBounds(500,365,80,27);
        Start.setBackground(new Color(6, 54, 143));
        Start.setForeground(Color.white);
        Start.addActionListener(this);
        add(Start);
        
     setSize(700,450);
     setLocation(320,100);
     setVisible(true);
     
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==Start){
            setVisible(false);
            new QuizApp(name);
        }
        else{
            setVisible(false);
            new Login();
    }
    }
    public static void main(String[] args) {
        
        new Next("user");
    }
    
}
