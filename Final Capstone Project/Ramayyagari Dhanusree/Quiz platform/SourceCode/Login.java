package SourceCode;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//ActiveListener-interface

public class Login extends JFrame implements ActionListener{
    JButton back,next;
    JTextField UserName;
    Login(){
        // Background
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("Icon/WhatsApp Image 2023-08-13 at 9.10.23 PM.jpeg"));
        JLabel image=new JLabel(icon);
        image.setBounds(0,0,590,515);
        add(image);

        //Heading
        JLabel heading=new JLabel("Brainly Java Quiz");
        heading.setBounds(650,50,500,45);
        heading.setFont(new Font("Castellar",Font.BOLD,40));
        heading.setForeground(new Color(106,0,119));
        add(heading);

        //Name
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(750,130,500,30);
        name.setFont(new Font("Lucida Bright",Font.BOLD,20));
        name.setForeground(new Color(0,0,0));
        add(name);

        //Text Area
        UserName=new JTextField();
        UserName.setBounds(600,200,500,45);
        UserName.setFont(new Font("Lucida Bright",Font.BOLD,20));
        UserName.setForeground(new Color(0,0,0));
        add(UserName);

        //Buttons
        next=new JButton("Next Page >>");
        next.setBounds(600,300,250,40);
        next.setFont(new Font("Lucida Bright",Font.BOLD,15));
        next.setBackground(new Color(106,0,119));
        next.setForeground(new Color(255,255,255));
        next.addActionListener(this);
        add(next);

        back=new JButton("Back");
        back.setBounds(900,300,200,40);
        back.setFont(new Font("Lucida Bright",Font.BOLD,15));
        back.setBackground(new Color(106,0,119));
        back.setForeground(new Color(255,255,255));
        back.addActionListener(this);
        add(back);


        //Fram code
        setLocation(50,100);
        setSize(1200,550);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next) {
            String Uname=UserName.getText();  // your name
            setVisible(false);
            new RulePage(Uname);
        }
        else if(e.getSource()==back) {
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new Login();
    }
}

