package Basics;

import java.util.Scanner;

public class Emp {

	
	int Empid;
	String EmpName;
	float It;
	double salary;
	char grade;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		System.out.println("enter the empid=");
		
		Empid=sc.nextInt();
		System.out.println("enter the empname=");
		EmpName=sc.next();
		System.out.println("enter the it=");
		It=sc.nextInt();
		System.out.println("enter the salary=");
		salary=sc.nextDouble();
		System.out.println("enter the grade=");
		grade=sc.next().charAt(0);
	}
	void put()
	{
		System.out.println("empid="+Empid);
		System.out.println("Name="+EmpName);
		System.out.println("it="+It);
		System.out.println("salary="+salary);
		System.out.println("Grade="+grade);
	}
	public static void main(String[] args)
	{
		Emp emp=new Emp();
		emp.get();
		emp.put();
}


	}

