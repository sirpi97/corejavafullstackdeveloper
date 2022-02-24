package Basics;
import java.util.Scanner;
public class LinearSearch
{
	
	public static void main(String args[])
	{
		int i, n, item, array[];
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter number of elements:");
	    n =sc.nextInt(); 
	    array = new int[n]; 
	    System.out.println("Enter " + n + " integers");
	    for (i = 0; i < n; i++)
	    {
	        array[i] = sc.nextInt();
	    }

	      System.out.println("Enter the search value:");
	      item =sc.nextInt();

	      for (i = 0; i < n;i++)
	      {
	         if (array[i] == item) 
	         {
	           System.out.println(item+" is present at location "+(i+1));
	           break;
	         }
	      }
	      if (i == n)
	        System.out.println(item + " doesn't exist in array.");
	   }
	}
	
	
