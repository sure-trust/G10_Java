package quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quizpage extends JFrame implements ActionListener {

    String questions[][]=new String[10][5];
    String Correctanswer[][]=new String[10][2] ;//Correct answer
    String Useranswer[][]=new String[10][1]; // user answer
    JLabel qno,question;
    JRadioButton op1,op2,op3,op4;
    ButtonGroup groupops;
    JButton next,previous,Submit;

    static int user_ans=0;
    static public int timer=20;
    static public int count=0;
    static public int score=0;
    String name; //intializing globally
    Quizpage(String Uname){
        this.name=Uname;

        //Image
        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("5.jpg"));
        JLabel image=new JLabel(icon);
        image.setBounds(0,0,1400,350);
        add(image);

        //Number of question
        qno=new JLabel();
        qno.setBounds(30,400,500,30);
        qno.setFont(new Font("Arial",Font.PLAIN,15));
        qno.setForeground(new Color(0,0,0));
        add(qno);

        //Questions
         question=new JLabel();
        question.setBounds(50,400,500,30);
        question.setFont(new Font("Arial",Font.PLAIN,15));
        question.setForeground(new Color(0,0,0));
        add(question);

        // printing questions

        questions[0][0]="What is the size of float and double in java?";
            questions[0][1]="32 and 64";
            questions[0][2]="32 and 32";
            questions[0][3]="64 and 64";
            questions[0][4]="64 and 32";

        questions[1][0]="Exception created by try block is caught in which block?";
            questions[1][1]="catch";
            questions[1][2]="throw ";
            questions[1][3]="try";
            questions[1][4]="none ";

        questions[2][0]="Which of the following is not a Java features?";
            questions[2][1]="Dynamic";
            questions[2][2]="Architecture Neutral";
            questions[2][3]="Use of pointers";
            questions[2][4]="Object-Oriented";

        questions[3][0]="Which is used to find and fix bugs in the Java Programs ?";
            questions[3][1]="JVM";
            questions[3][2]="JRE";
            questions[3][3]="JDK";
            questions[3][4]="JDB";

        questions[4][0]="Which package contains the Random class ?";
            questions[4][1]="java.util package";
            questions[4][2]="java.lang package";
            questions[4][3]="java.awt package";
            questions[4][4]="java.io package";

        questions[5][0]="In java, which keyword is used to access the all the proporties of interface with class?";
            questions[5][1]="import";
            questions[5][2]="access";
            questions[5][3]="implements";
            questions[5][4]="extends";

        questions[6][0]="which class produces objects with respect to their geographical location ?";
            questions[6][1]="Simple TimeZone";
            questions[6][2]="Date";
            questions[6][3]="Local";
            questions[6][4]="TimeZone";

        questions[7][0]="Out of these classes, which one is used for reading strings and characters in Java from the console?";
            questions[7][1]="StringReader";
            questions[7][2]="InputStreamReader";
            questions[7][3]="BufferedStreamReader";
            questions[7][4]="BufferedReader";

        questions[8][0]="Out of these methods of the string class, which one can be used for testing the string for equality ?";
            questions[8][1]="isequals()";
            questions[8][2]="isequal()";
            questions[8][3]="equals()";
            questions[8][4]="equal()";

        questions[9][0]=" Which keyword is used for accessing the features of a package ?";
            questions[9][1]="package";
            questions[9][2]="import";
            questions[9][3]="extends";
            questions[9][4]="export";

        // printing answer
        Correctanswer[0][1]="32 and 64";
        Correctanswer[1][1]="try";
        Correctanswer[2][1]="Use of pointers";
        Correctanswer[3][1]="JDB";
        Correctanswer[4][1]="java.util package";
        Correctanswer[5][1]="implements";
        Correctanswer[6][1]="Local";
        Correctanswer[7][1]="BufferedReader";
        Correctanswer[8][1]="equals()";
        Correctanswer[9][1]="import";

         // print option
            op1=new JRadioButton("Option 1");
            op1.setBounds(60,450,500,30);
            op1.setBackground(Color.WHITE);
            op1.setFont(new Font("Arial",Font.PLAIN,15));
            add(op1);

            op2=new JRadioButton("Option 2");
            op2.setBounds(60,490,500,30);
            op2.setBackground(Color.WHITE);
            op2.setFont(new Font("qual()Arial",Font.PLAIN,15));
            add(op2);

            op3=new JRadioButton("Option 3");
            op3.setBounds(60,530,500,30);
            op3.setBackground(Color.WHITE);
            op3.setFont(new Font("Arial",Font.PLAIN,15));
            add(op3);

            op4=new JRadioButton("Option 4");
            op4.setBounds(60,570,500,30);
            op4.setBackground(Color.WHITE);
            op4.setFont(new Font("Arial",Font.PLAIN,15));
            add(op4);

        //option select only one
             groupops=new ButtonGroup();
            groupops.add(op1);
            groupops.add(op2);
            groupops.add(op3);
            groupops.add(op4);
    //3 Button - next, previous, submit test
        next=new JButton("Next>>");
        next.setBounds(1000,510,200,40);
        next.setFont(new Font("Lucida Bright",Font.BOLD,15));
        next.setBackground(new Color(75,0,223));
        next.setForeground(new Color(255,255,255));
        next.addActionListener(this);
        add(next);

        previous=new JButton("<< Previous");
        previous.setBounds(1000,450,200,40);
        previous.setFont(new Font("Lucida Bright",Font.BOLD,15));
        previous.setBackground(new Color(75,0,223));
        previous.setForeground(new Color(255,255,255));
        previous.addActionListener(this);
        add(previous);

        Submit=new JButton("Submit Test");
        Submit.setBounds(1000,570,200,40);
        Submit.setFont(new Font("Lucida Bright",Font.BOLD,15));
        Submit.setBackground(new Color(75,0,223));
        Submit.setForeground(new Color(255,255,255));
        Submit.addActionListener(this);
        add(Submit);

   // calling start function

        start(0);

        // Background
        getContentPane().setBackground(Color.white);
        setLayout(null);

        // Frame
        setLocation(0,0);
        setSize(1270,680);
        setVisible(true);
    }

    // Button Actions
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==next) {
            repaint();
            user_ans=1;
            if(groupops.getSelection()==null){ // if user do not answer
                Useranswer[count][0]="";
            }
            else{ // if user answer
                Useranswer[count][0]=groupops.getSelection().getActionCommand();
            }
            if(count==8){
                next.setEnabled(false);   //disable the button
                Submit.setEnabled(true);
            }
            count++;
            start(count);
        }
        else if(e.getSource()==Submit) {
            user_ans=1;
            if(groupops.getSelection()==null){ // if user do not answer
                Useranswer[count][0]="";
            }
            else{ // if user answer
                Useranswer[count][0]=groupops.getSelection().getActionCommand();
            }
            for(int i=0;i<Useranswer.length;i++){
                if(Useranswer[i][0].equals(Correctanswer[i][1])){
                        score+=10;
                    }
                else{
                        score+=0;
                    }
                }
            setVisible(false);
            new Thankyoupage(name,score);
        }
        else if(e.getSource()==previous){
            repaint();
            user_ans=1;
            if(groupops.getSelection()==null){ // if user do not answer
                Useranswer[count][0]="";
            }
            else{ // if user answer
                Useranswer[count][0]=groupops.getSelection().getActionCommand();
            }
            count--;
            start(count);
        }
    }

    //Timer graphic

    public void paint(Graphics g){
        super.paint(g);
        String clock ="Time Left : "+timer+" seconds";  //20
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.PLAIN,15));

        if(timer>0){
            g.drawString(clock,1020,410);
        }
        else{
            g.drawString("Time is up!!",1020,410);
        }


        timer--; // decrement the timer value
        try{
            Thread.sleep(1000); // millisecond 1 second=1000ms
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }

    // when timer is up !!

        if(user_ans==1) {    //if user enter anything
            user_ans=0;
            timer=20;
        }else if(timer<0){   // timer ups
            timer=20;
            if(count==8){
                next.setEnabled(false);   //disable the button
                Submit.setEnabled(true);
            }
            if(count==9){ //qno=10
                if(groupops.getSelection()==null){ // if user do not answer
                    Useranswer[count][0]="";
                }
                else{ // if user answer
                    Useranswer[count][0]=groupops.getSelection().getActionCommand();
                }
                for(int i=0;i<Useranswer.length;i++){
                    if(Useranswer[i][0].equals(Correctanswer[i][1])){
                        score+=10;
                    }
                    else{
                        score+=0;
                    }
                }
                setVisible(false);
                new Thankyoupage(name,score);
            }
            else{
                //Reading the answer from user
                if(groupops.getSelection()==null){ // if user do not answer
                    Useranswer[count][0]="";
                }
                else{ // if user answer
                    Useranswer[count][0]=groupops.getSelection().getActionCommand();
                }

                count++; //0+1=1
                start(count);  //recursion
            }
        }
    }

    // create one function to start test
    public void start(int count){ //count 0
        qno.setText(String.valueOf(count+1+". "));   //0+1
        question.setText(questions[count][0]);

        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);

        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);

        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);

        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);

    }
    public static void main(String[] args){
        //TODO Auto-generated method stub
        new Quizpage("User");
    }
}