package Sourcecode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


import javax.swing.JFrame;

public class Text extends JFrame implements ActionListener {
	JTextField textName,textCity;
	JButton next;
	
	
	
Text(){
	//name
	JLabel name=new JLabel(" Name :");
	name.setFont(new Font("Raleway",Font.BOLD,20));
	name.setBounds(120,140,250,30);
	add(name);
	
	textName=new JTextField();
	textName.setFont(new Font("Raleway",Font.BOLD,15));
	textName.setBounds(400,140,250,30);
	add(textName);
	//City
	JLabel City=new JLabel(" City :");
	City.setFont(new Font("Raleway",Font.BOLD,20));
	City.setBounds(120,380,250,30);
	add(City);
	
	textCity=new JTextField();
	textCity.setFont(new Font("Raleway",Font.BOLD,15));
	textCity.setBounds(400,380,250,30);
	add(textCity);
	//Buttons
			next=new JButton("Next");
			next.setBounds(90,90,220,40);
			next.setFont(new Font("Osward",Font.PLAIN,20));
			next.setForeground(Color.white);
			next.setBackground(new Color(33,58,102));
			next.addActionListener(this);
			add(next);
			JLabel text=new JLabel(" text :");
			text.setFont(new Font("Raleway",Font.BOLD,20));
			text.setBounds(120,140,250,30);
			add(text);
			
	//frame
			getContentPane().setBackground(Color.WHITE);
			setVisible(true);
			setSize(800,650);
			setLocation(250,0);
			setLayout(null);

}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==next) {
		String name=textName.getText();
		String city=textName.getText();
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Fill all the necessary fields!!");
			}
			else {
				Conn c=new Conn();     //Calling the construstor of connection page
				String query="insert into signup values ('"+name+"','"+city+")";
			    c.s.executeQuery(query);}
			} catch(Exception e1){
				System.out.println(e);
			}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Text();

	}

}
