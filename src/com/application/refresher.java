package com.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class refresher extends JFrame implements ActionListener {
JButton B1,B2;
JTextField T1;
    refresher(){
        setBounds(300,120,700,350);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("com/application/Icons/login.jpeg"));
        JLabel L1=new JLabel(img1);
        L1.setBounds(0,0,350,350);
        add(L1);

        JLabel L2=new JLabel("Mind Refresher");
        L2.setBounds(430,20,230,35);
        L2.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        L2.setForeground(Color.BLUE);
        add(L2);

        JLabel L3=new JLabel("Enter Your Name");
        L3.setBounds(460,65,230,35);
        L3.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        L3.setForeground(Color.BLACK);
        add(L3);

        T1=new JTextField();
        T1.setBounds(450,110,200,25);
        T1.setFont(new Font("Times new Roman",Font.PLAIN,15));
        add(T1);
        setVisible(true);

        B1=new JButton("Rules");
        B1.setBounds(450,150,70,30);
        B1.setBackground(Color.WHITE);
        B1.setForeground(Color.BLUE);
        B1.addActionListener(this);

        add(B1);

        B2=new JButton("Exit");
        B2.setBounds(578,150,70,30);
        B2.setBackground(Color.WHITE);
        B2.setForeground(Color.BLUE);
        B2.addActionListener(this);
        add(B2);

    }

    public static void main(String[] args) {
	// write your code here
        new refresher();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==B1){
String username=T1.getText().toString();
new Rules(username);
this.setVisible(false);      }
      else if (e.getSource()==B2){
          System.exit(0);
      }
    }
}
