package Basics;
import java.util.Scanner;
public class AscendingArray 
{
  public static void main(String[] args)
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the elements you want : ");
	  int size = sc.nextInt();
	  int arr[] = new int[size]; 
	  System.out.println("Enter all the elements:");
	  for (int i = 0; i < size; i++)
	  {
		  arr[i] = sc.nextInt();
	  }
	  for (int i = 0; i < size; i++) 
	  {
		   for (int j = i + 1; j < size; j++) 
      {
			  if (arr[i] > arr[j])
			  	{
			  		int m = arr[i];
			  		arr[i] = arr[j];
			  		arr[j] = m;
			  		}
			  	
      			}
	  }
	  System.out.println("Ascending Order:");
	  for (int i = 0; i < size; i++) 
	  {
      System.out.println(arr[i]);
	  }
  }
}
  

