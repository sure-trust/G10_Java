package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public  class RulesPage extends JFrame implements ActionListener {
	
	String Uname;
	JButton proceed,Ruleback;
	RulesPage(String Uname){
		this.Uname=Uname;
		
		
	//heading
	JLabel heading=new JLabel("Rules and Regulations");
	 heading.setBounds(400,20,400,40);
	 heading.setFont(new Font("Algerian",Font.BOLD,40));
	 heading.setForeground(new Color(106,0,119));
	 add(heading);
	 
	 //paragraph
	 JLabel heading2=new JLabel("instruction");
	 heading2.setBounds(430,70,500,30);
	 heading2.setFont(new Font("Algerian",Font.BOLD,40));
	 heading2.setForeground(new Color(106,0,119));
	 add(heading2);
	 
	JLabel rules=new JLabel("");
	rules.setBounds(30,100,700,350);
	rules.setFont(new Font("Arial",Font.PLAIN,15));
	rules.setText("<HTML>"+"1.Quiz Format: 10 multiple-choice questions, each with four options."+"<br><br>"
			+ "2.Answer Selection: Choose an answer per question; it's irreversible.\r\n"+"<br><br>"
			+ "3.Scoring: No negative marking; attempt all questions confidently.\r\n"+"<br><br>"
			+ "4.Fair Play: Strictly avoid collaboration or cheating; violations lead to disqualification.\r\n"+"<br><br>"
			+ "5.Proceed to Start: Click \"Proceed\" to begin the quiz or \"Back\" to return.\r\n"
			+"</HTML>");
	add(rules);
	//Buttons
	 proceed=new JButton(" next page>>");
	 proceed.setBounds(600,300,200,40);
	 proceed.setForeground( new Color(255,255,255));
	 proceed.setBackground( new Color(106,0,119));
	 proceed.addActionListener(this);
	 add(proceed);
	 
	 Ruleback=new JButton(" next page>>");
	 Ruleback.setBounds(600,300,200,40);
	 Ruleback.setForeground( new Color(255,255,255));
	 Ruleback.setBackground( new Color(106,0,119));
	 Ruleback.addActionListener(this);
	 add(Ruleback);
	 
	 //Background
	 getContentPane().setBackground(Color.white);
	 setLayout(null);
	 //frame
	 setLocation(50,100);
	 setSize(1200,535);
	 setVisible(true);
}



public void actionPerformed(ActionEvent e) {
	if(e.getSource()==proceed) {
		
	}
	else if(e.getSource()==Ruleback) {
		setVisible(false);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new RulesPage("User");
	}

}
