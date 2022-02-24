package Basics;

import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		int no,ans,ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1:");
		no=sc.nextInt();
		//System.out.println("Enter no2;");
		//no2=sc.nextInt();
		System.out.println("MENU");
		System.out.println("1.cube of number");
		System.out.println("2.square of number");
		System.out.println("3.table of any number");
		System.out.println("4.reverse number");
		System.out.println("5.sum of digit");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("1.cube of number");
			ans=no*no*no;
			System.out.println("cube of  given number:"+ (no*no*no));
			break;
		case 2:
			System.out.println("2.square of number");
			ans=no*no;
			System.out.println("square of  given number:"+ (no*no));
			break;
		case 3:
			System.out.println("3.table of number");
			
			System.out.println("table of  any number:");
			break;
		case 4:
			System.out.println("4.reverse of number");
			int reverse = 0;
			while(no!=0)
			{
				int remainder=no%10;
				reverse=reverse*10+remainder;
				no=no/10;
			}
			System.out.println("reverse of  given number:"+reverse);
			break;
		case 5:
			System.out.println("5.sum of digit");
			int sum = 0;
			while(no!=0)
			{
				int digit=no%10;
				sum=sum+digit;
				no=no/10;
			}
			System.out.println("sum of digit:"+sum);
			break;

			
		}

	}

}
