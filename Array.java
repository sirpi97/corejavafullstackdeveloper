package Basics;
import java.util.Scanner;
public class Array {
	void arraydeclaration()
	{
		int array[]=new int[5];
		int i;
		array[0]=100;
		array[1]=200;
		array[2]=300;
		array[3]=400;
		array[4]=500;
		for(i=0;i>array.length;i++)
		{
			System.out.println("array["+i+"]"+array[i]);
		}
		
		for(int i1:array)
		{
			System.out.println(i1);
		}
	}
	
	void getarray()
	{
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i:arr)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("sum of array:"+sum);
	}

	public static void main(String[] args) 
	{
		Array ad=new Array();
		ad.getarray();
	}

}

	