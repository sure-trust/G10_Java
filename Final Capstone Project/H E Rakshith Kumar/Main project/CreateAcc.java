package proj;


import java.util.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
 public  class CreateAcc extends JFrame implements ActionListener{
long random;
 JTextField textName,textFName, textDOB, textGender, textEmail, textAdd, textCity, textState, textPcode;

JButton back, next;
JRadioButton male, female;
 ButtonGroup genderGroup; CreateAcc () {
//Random Application Number
Random ran=new Random();
random =Math.abs((ran.nextLong ()% 9000L) +1000L);
JLabel Formno=new JLabel("Application Form No: "+random);
Formno.setFont (new Font ("Raleway", Font. BOLD, 35));
Formno.setBounds (120, 50, 600, 40);
Formno.setHorizontalAlignment (JLabel.CENTER); add (Formno);

JLabel Personaldeteils=new JLabel("Page 1 : Personal Details");
Personaldeteils.setFont (new Font ("Raleway", Font. BOLD, 15)); Personaldeteils.setBounds (120, 90, 600,30); Personaldeteils.setHorizontalAlignment (JLabel.CENTER);
add (Personaldeteils);
//name
JLabel name=new JLabel (" Name :");
name.setFont (new Font ("Raleway", Font. BOLD, 20));
name.setBounds (120, 140,250,30);
add (name);
textName=new JTextField();textName=new JTextField();
textName.setFont (new Font ("Raleway", Font. BOLD, 15)); textName.setBounds (400, 140,250,30);
add (textName);
 //Father's name
JLabel fname=new JLabel(" Father's Name :"); fname.setFont (new Font ("Raleway", Font.BOLD, 20));
fname.setBounds (120, 180,250,30);
add (fname);


textFName=new JTextField();
textFName.setFont (new Font ("Raleway", Font. BOLD, 15));
textFName.setBounds (400, 180,250,30);
add (textFName);
//Date of birth
JLabel dob=new JLabel(" Date of birth: "); dob.setFont (new Font ("Raleway", Font. BOLD, 20));
dob.setBounds (120,220,250,30);
add (dob);

textDOB=new JTextField();
textDOB.setFont (new Font ("Raleway", Font. BOLD, 15));
textDOB.setBounds (400, 220,250,30);
add (textDOB);

//Gender
JLabel gender=new JLabel(" Gender:");
gender.setFont (new Font ("Raleway", Font. BOLD, 20));
gender.setBounds (120,260,250,30);
add (gender);
male=new JRadioButton ("Male");
male.setBounds (400,260,100,30);male.setBounds (400,260,100,30);
male.setBackground (Color.WHITE);
male.setFont (new Font ("Raleway", Font. BOLD, 20));
add (male);


female=new JRadioButton("Female");
female.setBounds (500,260,100,30); female.setBackground (Color.WHITE);
female.setFont (new Font ("Raleway", Font. BOLD, 20));
add (female);
//option select only one
genderGroup =new ButtonGroup ();
genderGroup.add(male);
genderGroup.add(female);
textAdd.setFont (new Font ("Calabri", Font. BOLD, 15));
textAdd.setBounds (400, 340,250,30);
add (textAdd);
//city
JLabel City=new JLabel(" City :");
City.setFont (new Font ("Raleway", Font. BOLD, 20)); 
City.setBounds (120,380,250,30);
add (City);

textCity=new JTextField();
textCity.setFont (new Font ("Raleway", Font. BOLD, 15));
textCity.setBounds (400,380,250,30);
add (textCity);

JLabel State=new JLabel(" State :");
State.setFont (new Font ("Raleway", Font. BOLD, 20));
State.setBounds (120,420,250,30);
add (State);

textState=new JTextField();
textState.setFont (new Font ("Raleway", Font. BOLD, 15));
textState.setBounds (400, 420, 250, 30);
add (textState);

//PinCode
JLabel pincode=new JLabel (" PinCode :");
pincode.setFont (new Font ("Raleway", Font. BOLD, 20));
pincode.setBounds (120, 460,250,30);
add (pincode);

textPcode=new JTextField();
textPcode.setFont (new Font ("Raleway", Font. BOLD, 15));
textPcode.setBounds (400, 460,250,30);
add (textPcode);

//Buttons
next=new JButton("Next");
next.setBounds (120,530,220,40);
next.setFont (new Font ("Osward", Font. PLAIN, 20));
next.setForeground (Color.white);
next.setBackground (new Color (33, 58, 102));
next.addActionListener(this);
add (next);

back=new JButton ("Back");
back.setBounds (400, 530,220, 40);
back.setFont (new Font ("Osward", Font. PLAIN, 20));
back.setForeground (Color.white);
back.setBackground (new Color (33, 58, 102));
back.addActionListener(this);
add (back);

JLabel fill=new JLabel(" fill the form ");
fill.setFont (new Font ("Raleway", Font. PLAIN, 10));
fill.setBounds (120, 600,250,30);
add (fill);

getContentPane().setBackground (Color. WHITE);
setVisible (true);
setSize (800, 650);
setLocation (250,0);
setLayout (null);
}
public void actionPerformed (ActionEvent e) { 
	if (e.getSource() ==next) {
String name=textName.getText();
String fname=textName.getText(); 
String dob=textName.getText();
String email=textName.getText();
String city=textName.getText();
String state=textName.getText();
String pcode=textName.getText(); 
String add=textName.getText();

String gender=null; if (male.isSelected()) {
gender="Male"; }else if (female.isSelected()) {
gender="Female";
//If User not enter anything
try {
if (name.equals("")) {
JOptionPane.showMessageDialog(null, "Name is Required!!");
}
else {
Conn c=new Conn();
String query="insert into signup value ('"+name+"','"+fname+"','"+dob+"', '"+email+"', '"+gender+"', '"+city+", "+state+", "+pcode+")";
c.s.executeQuery (query);
}
}
catch (Exception e1) {
System.out.println(e1);
}
}
else if (e.getSource () ==back) {
setVisible (false);
new Logiin();
}}}
public static void main(String[] args) {
// TODO Auto-generated method stub new CreateAcc();
new CreateAcc();
}}
