package Basics;
import java.util.Scanner;

public class ArrayElement
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("array elements are:");
		for(int i:arr)

		{
			System.out.println(i);
			
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("maximum element in an given array:"+min);
	}
	
	
	
}
	  
		  
	  
		
	