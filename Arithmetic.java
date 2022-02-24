package Basics;
import java.util.Scanner;
public class Arithmetic {
	
	
	public static void main(String[] args)
	{
		int no1,no2,ans,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		no1=sc.nextInt();
		System.out.println("Enter no2;");
		no2=sc.nextInt();
		System.out.println("MENU");
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Moulus");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		
		case 1:
			System.out.println("Addition");
			ans=no1+no2;
			System.out.println("Addition="+ans);
			break;
		case 2:
			System.out.println("Subtraction");
			ans=no1-no2;
			System.out.println("Subtraction="+ans);
			break;
		case 3:
			System.out.println("Multiplication");
			ans=no1*no2;
			System.out.println("Multiplication="+ans);
			break;
		case 4:
			System.out.println("Division");
			ans=no1/no2;
			System.out.println("Division="+ans);
			break;
		case 5:
			System.out.println("Modulos");
			ans=no1%no2;
			System.out.println("Modulos="+ans);
			break;
		default:
				System.out.println("Invalid choice");
				break;
			
		}
	}
}
			

		
		




		
		
	


