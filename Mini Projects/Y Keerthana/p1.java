//NUMBER GUESSING GAME


import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args){
        System.out.println("!!! welcome to the Number Guessing Game !!!");
        System.out.println("Choose the Number Between 1 to 100:");
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int min=1;
        int max=100;
        int RandomNumber=random.nextInt( max-min+1)+min;
        boolean condition=true;
        
        while(condition){
            System.out.println("Enter the Number:");
            int UserNumber=sc.nextInt();
            
            if(UserNumber<RandomNumber){
                System.out.println("** Number Is Too Low,Try Again **");
            }
            
            else if(UserNumber>RandomNumber){
                System.out.println("** Number Is Too High,Try Again **");
            }
            else{
                condition=false;
                System.out.println("*** Congratulations ! You've Guessed the Correct Number***");
            }
        }
    }
}


