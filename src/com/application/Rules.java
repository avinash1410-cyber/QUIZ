package com.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;
    Rules(String username) {
        setBounds(300,120,700,350);
        getContentPane().setBackground(Color.CYAN);
        setLayout(null);

        JLabel RL=new JLabel("welcome Mr. "+ username +" in the Quiz");
        RL.setFont(new Font("Viner Hand ITC",Font.ITALIC,20));
        RL.setBounds(250,20,450,20);
        add(RL);

        JLabel R=new JLabel();
        R.setBounds(25,50,450,275);
        R.setText( "<html>"+
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br>" +
                "4. Crying is allowed but please do so quietly." + "<br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br>" +
                "<html>");
        add(R);

        b1=new JButton("Back");
        b1.setBounds(25,280,80,25);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLUE);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("start");
        b2.setBounds(225,280,80,25);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLUE);
        b2.addActionListener(this);
        add(b2);



        setVisible(true);
    }

    public static void main(String[] args){
        new Rules("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
this.setVisible(false);
new refresher().setVisible(true);
        }
        else if (e.getSource()==b2){

        }
    }
}
