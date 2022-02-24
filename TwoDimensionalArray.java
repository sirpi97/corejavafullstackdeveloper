package Basics;
import java.util.Scanner;
public class TwoDimensionalArray 
{
	Scanner sc=new Scanner(System.in);
	int row,column;
	void twoDarray()
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	void accept()
	{
		System.out.println("Enter row size :");
		int row=sc.nextInt();
		System.out.println("Enter column size :");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int sum[][]=new int[row][col];
		System.out.println("Enter matrix Element :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
		System.out.println("sum of two matrix :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.println(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
 public static void main(String[] args)
	{
	 TwoDimensionalArray td=new TwoDimensionalArray();
	 //td.twoDarray();
	 td.accept();
	 

	}

}
