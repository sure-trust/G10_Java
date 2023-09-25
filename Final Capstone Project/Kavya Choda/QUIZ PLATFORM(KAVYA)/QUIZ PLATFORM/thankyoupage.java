package quiz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Thankyoupage extends JFrame implements ActionListener {

    JButton finish;
    Thankyoupage(String name,int score)
    {
        // Background
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //Heading
        JLabel heading=new JLabel("Thank you "+name+" for giving Quiz");
        heading.setBounds(50,50,600,45);
        heading.setFont(new Font("Algerian",Font.BOLD,34));
        heading.setForeground(new Color(106,0,119));
        add(heading);

        //Score
        JLabel Userscore=new JLabel("your score is "+score);
        Userscore.setBounds(250,340,300,40);
        Userscore.setFont(new Font("Tahoma",Font.PLAIN,30));
        Userscore.setForeground(Color.black);
        add(Userscore);

        //picture
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("4.jpg"));
        Image image=icon.getImage().getScaledInstance(300,250, Image.SCALE_DEFAULT);
        ImageIcon i1=new ImageIcon(image);
        JLabel i2=new JLabel(i1);
        i2.setBounds(100,0,500,500);
        add(i2);

        //Buttons
        finish=new JButton("Finish");
        finish.setBounds(260,400,200,40);
        finish.setFont(new Font("Lucida Bright",Font.BOLD,15));
        finish.setBackground(new Color(106,0,119));
        finish.setForeground(new Color(255,255,255));
        finish.addActionListener(this);
        add(finish);

        // Frame code
        setLocation(300,100);
        setSize(700,535);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==finish){
            setVisible(false);
        }
    }

    public static void main(String[] args){
        //TODO Auto-generated method stub

        new Thankyoupage("User",0);
    }
}