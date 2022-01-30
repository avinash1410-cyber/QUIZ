package com.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
    JButton next,save,LifeLine;
    JLabel Q,QN;
    JRadioButton opt1,opt2,opt3,opt4;
    ButtonGroup options;
    String q[][] = new String[10][5];
    String pa[][]=new String[10][1];
    static int timer=15;
    static int cnt=0;

    Quiz(){
        setBounds(0,0,1440,720);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("com/application/Icons/quiz.jpg"));
        JLabel Image=new JLabel(img1);
        Image.setBounds(0,0,1440,375);
        add(Image);


        QN=new JLabel("1");
        QN.setBounds(100,425,40,40);
        QN.setText("Q.1");
        QN.setFont(new Font("Tahoma",Font.ITALIC,20));
        add(QN);

        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";


        Q=new JLabel();
        Q.setBounds(150,425,800,40);
        Q.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(Q);


        opt1=new JRadioButton();
        opt1.setBounds(100,470,700,20);
        opt1.setBackground(Color.WHITE);
        add(opt1);


        opt2=new JRadioButton();
        opt2.setBounds(100,500,700,20);
        opt2.setBackground(Color.WHITE);
        add(opt2);


        opt3=new JRadioButton();
        opt3.setBounds(100,530,700,20);
        opt3.setBackground(Color.WHITE);
        add(opt3);


        opt4=new JRadioButton();
        opt4.setBounds(100,560,700,20);
        opt4.setBackground(Color.WHITE);
        add(opt4);

        options=new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);


        next=new JButton("Next");
        next.setBounds(1050,470,80,30);
        next.setBackground(Color.BLUE);
        next.addActionListener(this);
        next.setForeground(Color.WHITE);
        add(next);


        LifeLine=new JButton("50-50");
        LifeLine.setBounds(1050,510,80,30);
        LifeLine.setBackground(Color.BLUE);
        LifeLine.setForeground(Color.WHITE);
        LifeLine.addActionListener(this);
        add(LifeLine);


        save=new JButton("Save");
        save.setBounds(1050,550,80,30);
        save.setBackground(Color.BLUE);
        save.setForeground(Color.WHITE);
        save.addActionListener(this);
        save.setEnabled(false);

        add(save);
        start(0);



        setVisible(true);
    }

    private void start(int cnt) {
        QN.setText(""+(cnt+1)+".");
        Q.setText(q[cnt][0]);
        opt1.setText(q[cnt][1]);
        opt2.setText(q[cnt][2]);
        opt3.setText(q[cnt][3]);
        opt4.setText(q[cnt][4]);
        options.clearSelection();
    }


    public static void main(String[] args){
        new Quiz();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==next){
//increase the count
repaint();
if (options.getSelection()==null){
    pa[cnt][0]="";
}
else {

}
}
else if (e.getSource()==save){

}
else if (e.getSource()==LifeLine){

}


    }

public void paint(Graphics g){
        super.paint(g);
        String time="time Left="+timer;
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));

if (timer>0){
    g.drawString(time,1070,450);
}
else if (timer==0){
    g.drawString("Time up",1070,450);
}

timer--;
try {
    Thread.sleep(1000);
    repaint();
}
catch (Exception e){

}
}
}
