package Basics;
import java.util.Scanner;
public class RelationalDemo
{
	Scanner sc=new Scanner(System.in);
	void Demo1()
	{
		int num1;
		int num2;
	
	num1=sc.nextInt();
	num2=sc.nextInt();
	
	if(num1>num2)
	{
	System.out.println("num1 is greater");
	}
	else
	{
	System.out.println("num2 is greater");
	}
	}
	public static void main(String[] args)
	{
		RelationalDemo rd=new RelationalDemo();
		rd.Demo1();
	}
}


