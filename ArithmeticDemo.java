package Basics;

public class ArithmeticDemo {

	int no1=20,no2=3,ans;//instance variable
	//without return type without parameters
	
	void sum()
	{
		ans=no1+no2;
		System.out.println("no1="+no1);
		System.out.println("no2="+no2);
		System.out.println("Addition="+ans);
	}
		//without return type with parameters
		void sub(int num1,int num2)
		{
			int subans=num1-num2;
			System.out.println("num1="+num1);
			System.out.println("num2="+num2);
			System.out.println("Subtraction="+subans);
		}
		int multi()
		{
			ans=no1*no2;
			System.out.println("no1="+no1);
			System.out.println("no2="+no2);
			System.out.println("Multiplication="+ans);
			return ans;
		}
		double div(double n1,double n2)
		{
			double divans=n1/n2;
			System.out.println("n1="+n1);
			System.out.println("n2="+n2);
			System.out.println("Division="+divans);
			return divans;
			
		}
		public static void main(String[] args)
		{
			ArithmeticDemo a=new ArithmeticDemo();
			System.out.println("*************Addition***********");
			a.sum();
			System.out.println("*************Subtraction***********");
			a.sub(40,20);
			System.out.println("*************Multiplication***********");
			
			a.multi();
			System.out.println("*************Division***********");
			a.div(20.4,2.0);
			
		}

}
