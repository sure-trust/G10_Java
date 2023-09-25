import java.util.*;
public class Currencyconverter {
    public static void main(String[] args){

        double doller,pound,euro,yen,ringgit,rupiahs,won,dongs,rupees,Rupees;
        Scanner sc=new Scanner(System.in);

        System.out.println("please Enter the Amount in Rupees : ");
        double Amount=sc.nextDouble();  // Enter by user

        System.out.println("Choose the currency to convert :");
        System.out.println("Enter 1 : Dollar");
        System.out.println("Enter 2 : Pound");
        System.out.println("Enter 3 : Eura");
        System.out.println("Enter 4 : Yen");
        System.out.println("Enter 5 : Ringgit");
        System.out.println("Enter 6 : Rupiah");
        System.out.println("Enter 7 : Won");
        System.out.println("Enter 8 : Dong");
        System.out.println("Enter 9 : Sri Lankan Rupee");
        System.out.println("Enter 10 : Nepalese Rupee");

        System.out.println("Choose a number between (1-10) representing a Currency : ");
        int choice=sc.nextInt();  // Choice from above option

        switch(choice){
            case 1:  // convert in Dollar
            {
                doller=Amount/82.8;
                System.out.println("converting " +Amount+" Rupees in Doller :"+doller+" Dollers");
                break;
            }
            case 2:
            {
                pound=Amount/105.6;
                System.out.println("converting " + Amount+" Rupees in Pound :"+pound+" Pounds");
                break;
            }
            case 3:
            {
                euro=Amount/91;
                System.out.println("converting " + Amount+" Rupees in Euro :"+euro+" Euros");
                break;
            }
            case 4:
            {
                yen=Amount/0.58;
                System.out.println("converting " + Amount+" Rupees in Yen :"+yen+" yens");
                break;
            }
            case 5: {
                ringgit = Amount / 18.15;
                System.out.println("converting " + Amount + " Rupees in Ringgit :" +ringgit+" Ringgits");
                break;
            }
            case 6: {
                rupiahs = Amount / 0.005;
                System.out.println("converting " + Amount + " Rupees in Rupiah :" +rupiahs+" Rupiahs");
                break;
            }
            case 7: {
                    won = Amount / 0.061;
                    System.out.println("converting " + Amount + " Rupees in Won :" +won+" Wons");
                    break;
            }
            case 8: {
                dongs = Amount / 0.003;
                System.out.println("converting " + Amount + " Rupees in Dong :" +dongs+" Dongs");
                break;
            }
            case 9: {
                rupees = Amount / 0.25;
                System.out.println("converting " + Amount + " Rupees in Sri Lankan Rupee :" +rupees+" Rupees");
                break;
            }
            case 10: {
                Rupees = Amount / 0.62;
                System.out.println("converting " + Amount + " Rupees in Nepalese Rupee :" +Rupees+" Rupees");
                break;
            }
            default:
                System.out.println("Invalid Input : please Enter between 1 to 5");
        }
        System.out.println("PROJECT BY : RAMAYYAGARI DHANUSREE");
    }
}
