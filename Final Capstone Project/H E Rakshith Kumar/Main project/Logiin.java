package proj;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Logiin extends JFrame implements ActionListener {
JButton signup, Clear, CreateAcc;
JTextField CardTextField, PinTextField;
	Logiin () {
	//Icon

	ImageIcon il=new ImageIcon(ClassLoader.getSystemResource("Icon/aabb.jpg"));

	Image i2=il.getImage().getScaledInstance (140, 83, Image. SCALE_DEFAULT);

	ImageIcon i3=new ImageIcon (i2);

	JLabel label=new JLabel (i3);

	label.setHorizontalAlignment (JLabel.CENTER);
	label.setBounds (350, 70, 100, 100);
	add (label);

	//Heading

	JLabel heading=new JLabel ("WELCOME TO ATM");

	heading.setBounds (200, 20, 400, 40);

	heading.setFont (new Font ("Osward", Font. BOLD, 40));

	heading.setHorizontalAlignment (JLabel.CENTER);

	heading.setForeground (new Color (33, 58, 102));

	add (heading);
	//Card Number

	JLabel cardno=new JLabel ("Card Number :");

	cardno.setBounds (80, 200, 400, 40);

	cardno.setFont (new Font ("Osward", Font. BOLD, 20)); cardno.setForeground (new Color (33, 58, 102));
	add (cardno);

	
	
	CardTextField=new JTextField();
	CardTextField.setBounds (280, 200, 400, 40);
	CardTextField. setFont (new Font ("Osward", Font. PLAIN, 20));
	add (CardTextField);
	//Password
	JLabel Pin=new JLabel ("Password :");
	Pin.setBounds (80, 250, 400, 40);
	Pin.setFont (new Font ("Osward", Font. BOLD, 20)); Pin.setForeground (new Color (33,58, 102));
	add (Pin);

	PinTextField=new JTextField();
	PinTextField.setBounds (280,250, 400, 40); PinTextField. setFont (new Font ("Osward", Font. PLAIN, 20));
	add (PinTextField);
	//Signup Button
	signup=new JButton("SignUp");
	signup.setBounds (150, 320, 220, 40);
	signup.setFont (new Font ("Osward", Font.PLAIN, 20));
	signup.setForeground (Color.white);
	signup.setBackground (new Color (33, 58, 102));
	signup.addActionListener(this);
	add (signup);

	
	//Back Button
	Clear=new JButton("Clear");
	Clear.setBounds (430, 320,220,40);
	Clear.setFont (new Font ("Osward", Font. PLAIN, 20));
	Clear.setForeground (Color.white);
	Clear.setBackground (new Color (33,58,102)); Clear.addActionListener(this);
	add (Clear);
	//Create an Account
	CreateAcc=new JButton("Create An Account");
	CreateAcc.setBounds (150, 380, 500, 40);
	CreateAcc.setFont (new Font ("Calabri", Font. PLAIN, 20)); CreateAcc.setForeground (new Color (33,58,102));
	CreateAcc.addActionListener(this);
	add (CreateAcc);
	//Text
	JLabel text=new JLabel ("Please, Entre the Pin and Card number");
	text.setBounds (200, 20, 400, 40);
	text.setFont (new Font ("Osward", Font. PLAIN, 10)); text.setHorizontalAlignment (JLabel.CENTER); text.setForeground (new Color (33, 58, 102));
	add (text);

	//frame
	getContentPane().setBackground (Color. WHITE);
	setVisible (true);
	setLocation (250, 50);
	setSize (800,530);
	setLayout (new BorderLayout());
	}
	
	

	public void actionPerformed (ActionEvent e) { 
     if (e.getSource () ==signup) {
    	 setVisible (false);
         // new Signup ();
	}
	else if (e.getSource () ==CreateAcc) {
	setVisible (false); 
	//new CreateAcc();
	}
	else if (e.getSource () ==Clear) {
		CardTextField.setText("");
		PinTextField.setText("");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	new Logiin();
}
}


	