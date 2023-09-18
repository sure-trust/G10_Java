//RULES PAGE




package quiz;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Rulespage extends JFrame implements ActionListener{

    String Uname;// new variable
    JButton proceed,Ruleback;
    Rulespage(String Uname){
        this.Uname=Uname;      // Store whatever coming from previous page

        // Background
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("image2.png"));
        JLabel image=new JLabel(icon);
        image.setPreferredSize(new Dimension(400,400));
        image.setBounds(730,120,500,400);
        add(image);

        //Heading
        JLabel heading=new JLabel("INSTRUCTION");
        heading.setBounds(450,20,500,45);
        heading.setFont(new Font("Castellar",Font.BOLD,40)); 
        heading.setForeground(new Color(106,0,119));
        add(heading);

        // paragraph
        JLabel  Heading2=new JLabel("Welcome "+Uname+" To Brainly Quize");
        Heading2.setBounds(420,90,500,30);
        Heading2.setFont(new Font("Lucida Bright",Font.BOLD,20));
        Heading2.setForeground(new Color(0,0,0));
        add(Heading2);

        // Text
        JLabel rules=new JLabel("");
        rules.setBounds(30,100,700,350);
        rules.setFont(new Font("Arial",Font.PLAIN,20));
        rules.setText(
                "<HTML>"+"1. Quiz Format: 10 multiple-choice questions, each with four options."+"<br><br>"
                        +"2. Answer Selection: Choose an answer per question; it's irreversible."+"<br><br>"
                        +"3. Scoring: No negative marking; attempt all questions confidently."+"<br><br>"
                        +"4. Fair Play: Strictly avoid collaboration or cheating; violations lead to disqualification."+"<br><br>"
                        +"5. Proceed to Start: Click \"Proceed\" to begin the quiz or \"Back\" to return."+
                        "<HTML>");

         add(rules);

        //Buttons
        proceed=new JButton("Next Page >>");
        proceed.setBounds(100,440,250,40);
        proceed.setFont(new Font("Lucida Bright",Font.BOLD,15));
        proceed.setBackground(new Color(106,0,119));
        proceed.setForeground(new Color(255,255,255));
        proceed.addActionListener(this);
        add(proceed);

        Ruleback=new JButton("Back");
        Ruleback.setBounds(430,440,200,40);
        Ruleback.setFont(new Font("Lucida Bright",Font.BOLD,15));
        Ruleback.setBackground(new Color(106,0,119));
        Ruleback.setForeground(new Color(255,255,255));
        Ruleback.addActionListener(this);
        add(Ruleback);

        // Background
        getContentPane().setBackground(Color.white);
        setLayout(null);

        // Frame
        setLocation(50,100);
        setSize(1200,550);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==proceed) {
            setVisible(false);
            new Quizpage(Uname);
        }
        else if(e.getSource()==Ruleback) {
            setVisible(false);
        }
    }
    public static void main(String[] args){
            new Rulespage("User");
    }
}
