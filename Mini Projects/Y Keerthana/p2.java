

//CURRENCY CONVERTER






package currency;
	import java.util.*;
	public class CurrencyConverter{
	public static void main(String []args){
	double dollar,pond,euro,yen,ringgit,rupiah,won,dong,lkr,npr;
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter the Amount in rupee:");
	double Amount=sc.nextDouble();
	System.out.println("Choose the currency to converter");
	System.out.println("Enter 1 :Dollar");
	System.out.println("Enter 2 :Pound");
	System.out.println("Enter 3 :Euro");
	System.out.println("Enter 4 :Yen");
	System.out.println("Enter 5 :Ringgit");
	System.out.println("Enter 6 :rupiah");
	System.out.println("Enter 7 :won");
	System.out.println("Enter 8 :dong");
	System.out.println("Enter 9 :lkr");
	System.out.println("Enter 10 :npr");




	 int choice=sc.nextInt();
	switch(choice){
	case 1:
	{
	  doller=Amount/82.8;
	System.out.println("Converting"+Amount+"Rupees into Dollar: "+String.format("%.2f",dollar)+ "  Dollars");
	break;
	}
	case 2:
	{
	  pond=Amount/105.6;
	System.out.println("Converting"+Amount+"Rupees into pound: "+String.format("%.2f",pond)+ "  pounds");
	break;
	}

	case 3:
	{
	  euro=Amount/91;
	System.out.println("Converting"+Amount+"Rupees into euro: "+String.format("%.2f",euro)+ "  euros");
	break;
	}

	case 4:
	{
	  yen=Amount/0.58;
	System.out.println("Converting"+Amount+"Rupees into yen: "+String.format("%.2f",yen)+ " yen");
	break;
	}

	case 5:
	{
	  ringgit=Amount/18.15;
	System.out.println("Converting"+Amount+"Rupees into ringgit: "+String.format("%.2f",ringgit)+ "  Ringgit");
	break;
	}

	case 6:
	{
	 rupiah =Amount/0.005;
	System.out.println("Converting"+Amount+"Rupees into Doller: "+String.format("%.2f",rupiah)+ "  Dollers");
	break;
	}

	case 7:
	{
	  won=Amount/0.06;
	System.out.println("Converting"+Amount+"Rupees into won: "+String.format("%.2f",won)+ "  wons");
	break;
	}

	case 8:
	{
	  dong=Amount/0.003;
	System.out.println("Converting"+Amount+"Rupees into dong: "+String.format("%.2f",dong)+ "  Dong");
	break;
	}
	case 9:
	{
	  lkr=Amount/0.25;
	System.out.println("Converting"+Amount+"Rupees into lkr: "+String.format("%.2f",lkr)+ " lkr");
	break;
	}
	case 10:
	{
	 npr=Amount/0.62;
	System.out.println("Converting"+Amount+"Rupees into npr: "+String.format("%.2f",npr)+ " npr");
	break;
	}
	default:
	{
	   System.out.println(" Invalid input: please enter valid input");
	}
	}
	}
	}
