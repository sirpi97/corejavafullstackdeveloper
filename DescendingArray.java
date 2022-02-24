package Basics;
import java.util.Scanner;

public class DescendingArray
{
    public static void main(String[] args)
    {
    	
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int size=sc.nextInt();  
        int arr[]=new int[size];  
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<size;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for (int i = 0; i <size; i++)
        {
        	
        	for (int j = i+1; j <size; j++)
        	{
        		if(arr[i] < arr[j])
        		{
        			int m = arr[i];    
        			arr[i] = arr[j];    
        			arr[j] = m;
        			}
            	}
        	}        
        	System.out.println("Descending order: ");    
        	for (int i = 0; i <size; i++) 
        	{     
        		System.out.print(arr[i]);
        	}
    }
}

 
