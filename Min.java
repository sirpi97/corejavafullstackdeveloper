package Basics;
import java.util.Scanner;
public class Min {
	
	//public static void main(String[]  args)
	//{
		int no1,no2,no3;
		Scanner sc=new Scanner(System.in);
		void Maxno()
		{
			System.out.println("enter the no1:");
			no1=sc.nextInt();
			System.out.println("enter the no2:");
			no2=sc.nextInt();
			System.out.println("enter the no3:");
			no3=sc.nextInt();
			if(no1>no2)
			{
				if(no1>no3)
				{
				System.out.println("no 1 is greater");
				}
			}
			else
			{
				if(no2>no3)
				{
			
				System.out.println("no 2 is greater");
				}
			else
			{
				System.out.println("no 3 is greater");
			}
		}
		}
			
		public static void main(String[] args)
		{
			Min ev=new Min();
			ev.Maxno();
			}
	}
	
	


