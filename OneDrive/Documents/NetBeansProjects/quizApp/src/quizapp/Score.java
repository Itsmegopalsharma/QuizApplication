/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizapp;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author Gopal Sharma
 */
public class Score extends JFrame implements ActionListener{
    Score(String name, int score){
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
         ImageIcon iI=new ImageIcon(ClassLoader.getSystemResource("quizapp/score.png"));
        JLabel image=new JLabel(iI);
        image.setBounds(0,80,700,200);
        add(image);
        
        JLabel heading=new JLabel("Thank you "+name+" for playing creative quiz");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(heading);
        
        JLabel lblscore=new JLabel("Your Score is "+ score);
        lblscore.setBounds(280,300,300,30);
        lblscore.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(lblscore);
        
        JButton submit=new JButton("Play Again!");
        submit.setBounds(285,350,150,30);
        submit.setBackground(new Color(6, 54, 143));
        submit.setForeground(Color.white);
        submit.setFont(new Font("Tahoma",Font.PLAIN,20));
        submit.addActionListener(this);
        //submit.setEnabled(false);
        add(submit);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Score("user",0);
    }
    
}
