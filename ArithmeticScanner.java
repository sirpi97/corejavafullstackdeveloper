package Basics;

import java.util.Scanner;

public class ArithmeticScanner 
{
		int no1=20,no2=3,ans;//instance variable
		//without return type without parameters
		Scanner sc=new Scanner(System.in);
	void sum()
	{
		
		System.out.println("Enter the no1:");
		no1=sc.nextInt();
		System.out.println("Enter the no2:");
		no2=sc.nextInt();
		ans=no1+no2;
		System.out.println("Addition="+ans);
	}
	void sub()
    {
		
		System.out.println("Enter the no1:");
		no1=sc.nextInt();
		System.out.println("Enter the no2:");
		no2=sc.nextInt();
		ans=no1-no2;
		System.out.println("sub="+ans);
	}
	void mul()
    {
		
		System.out.println("Enter the n01:");
		no1=sc.nextInt();
		System.out.println("Enter the no2:");
		no2=sc.nextInt();
		ans=no1*no2;
		System.out.println("mul="+ans);
	}
	void div()
    {
		
		System.out.println("Enter the no1:");
		no1=sc.nextInt();
		System.out.println("Enter the no2:");
		no2=sc.nextInt();
		ans=no1/no2;
		System.out.println("div="+ans);
	}
	public void mod()
    {
		
		System.out.println("Enter the no1:");
		no1=sc.nextInt();
		System.out.println("Enter the no2:");
		no2=sc.nextInt();
		ans=no1%no2;
		System.out.println("mod="+ans);
	}
	public static void main(String[] args)
	{
		ArithmeticScanner a=new ArithmeticScanner();
		System.out.println("*************Addition***********");
		a.sum();
		System.out.println("*************Subtraction***********");
		a.sub();
		System.out.println("*************Multiplication***********");
		
		a.mul();
		System.out.println("*************Division***********");
		a.div();
		System.out.println("*************modulo***********");
		a.mod();
		
		
	}

}
