package SourceCode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TicTacToeGame implements ActionListener {
    Random random=new Random();
    JFrame frame=new JFrame();
    JButton buttons[]=new JButton[9];
    JLabel textfield=new JLabel();
    JPanel Heading_Panel=new JPanel();
    JPanel Button_Panel=new JPanel();
    boolean player1_turn=true;
    TicTacToeGame(){
        //Frame
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());

        //Heading
        textfield.setFont(new Font("Ink Free",Font.BOLD,40));
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TIC-TAC GAME");
        textfield.setOpaque(true);

        //Heading panel
        Heading_Panel.setLayout(new BorderLayout());
        Heading_Panel.setBounds(0,0,800,100);
        Heading_Panel.add(textfield);
        frame.add(Heading_Panel,BorderLayout.NORTH);

        //Button pannel
        Button_Panel.setLayout(new GridLayout(3,3));
        Button_Panel.setBackground(new Color(150,150,150));

        for(int i=0;i<9;i++){
            buttons[i]=new JButton();
            buttons[i].addActionListener(this);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,100));
            Button_Panel.add(buttons[i]);

        }
        frame.add(Button_Panel);
        firstTurn();

    }

    public void actionPerformed(ActionEvent e){
        for (int i=0;i<9;i++){
            if (e.getSource()==buttons[i]){
                if(player1_turn){   //true X turn
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O TURN");
                        check();    //calling check function
                    }
                }
                else{ //O turn false
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        textfield.setText("X TURN");
                        check();    //calling check function
                    }
                }
            }
        }
    }
    public void check() {
        //X Win Conditions

        if(buttons[0].getText()=="X" && buttons[1].getText()=="X" && buttons[2].getText()=="X"){
            XWin(0,1,2);  // calling XWin Function
        }
        if(buttons[3].getText()=="X" && buttons[4].getText()=="X" && buttons[5].getText()=="X"){
            XWin(3,4,5);  // calling XWin Function
        }
        if(buttons[6].getText()=="X" && buttons[7].getText()=="X" && buttons[8].getText()=="X"){
            XWin(6,7,8);  // calling XWin Function
        }
        if(buttons[0].getText()=="X" && buttons[3].getText()=="X" && buttons[6].getText()=="X"){
            XWin(0,3,6);  // calling XWin Function
        }
        if(buttons[1].getText()=="X" && buttons[4].getText()=="X" && buttons[7].getText()=="X"){
            XWin(1,4,7);  // calling XWin Function
        }
        if(buttons[2].getText()=="X" && buttons[5].getText()=="X" && buttons[8].getText()=="X"){
            XWin(2,5,8);  // calling XWin Function
        }
        if(buttons[0].getText()=="X" && buttons[4].getText()=="X" && buttons[8].getText()=="X"){
            XWin(0,4,8);  // calling XWin Function
        }
        if(buttons[2].getText()=="X" && buttons[4].getText()=="X" && buttons[6].getText()=="X"){
            XWin(2,4,6);  // calling XWin Function
        }

        // O Win Conditions

        if(buttons[0].getText()=="O" && buttons[1].getText()=="O" && buttons[2].getText()=="O"){
            OWin(0,1,2);  // calling OWin Function
        }
        if(buttons[3].getText()=="O" && buttons[4].getText()=="O" && buttons[5].getText()=="O"){
            OWin(3,4,5);  // calling OWin Function
        }
        if(buttons[6].getText()=="O" && buttons[7].getText()=="O" && buttons[8].getText()=="O"){
            OWin(6,7,8);  // calling OWin Function
        }
        if(buttons[0].getText()=="O" && buttons[3].getText()=="O" && buttons[6].getText()=="O"){
            OWin(0,3,6);  // calling OWin Function
        }
        if(buttons[1].getText()=="O" && buttons[4].getText()=="O" && buttons[7].getText()=="O"){
            OWin(1,4,7);  // calling OWin Function
        }
        if(buttons[2].getText()=="O" && buttons[5].getText()=="O" && buttons[8].getText()=="O"){
            OWin(2,5,8);  // calling OWin Function
        }
        if(buttons[0].getText()=="O" && buttons[4].getText()=="O" && buttons[8].getText()=="O"){
            OWin(0,4,8);  // calling OWin Function
        }
        if(buttons[2].getText()=="O" && buttons[4].getText()=="O" && buttons[6].getText()=="O"){
            OWin(2,4,6);  // calling OWin Function
        }
    }

    private void XWin(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false); //Disable the buttons after win
        }
        textfield.setText("!! Congratulations, X Wins");
    }
    public void OWin(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false); //Disable the buttons after win
        }
        textfield.setText("!! Congratulations, O Wins");
    }
    public void firstTurn(){
                try {
                    Thread.sleep(2000);
                } catch(Exception e){
                    e.printStackTrace();
                }
                if(random.nextInt(2)==0){
                    player1_turn=true;
                    textfield.setText("X TURN");
                }
                else{
                    textfield.setText("O TURN");
                }
    }
    public static void  main(String[] args){
        // TODO Auto-generated method stub
        new TicTacToeGame();
    }
}
