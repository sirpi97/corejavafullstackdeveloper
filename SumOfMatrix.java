package Basics;
import java.util.Scanner;
public class SumOfMatrix 
{
	
	public static void main(String[] args) 
	{
		
		
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows in matrix : "); //rows and columns in matrix1 and matrix2 must be same for addition.
        int rows = sc.nextInt();
        System.out.print("Enter number of columns in matrix : ");
        int columns = sc.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int add[][]=new int[rows][columns];
        int sub[][]=new int[rows][columns];
        int mul[][]=new int[rows][columns];
        int div[][]=new int[rows][columns];
        int mod[][]=new int[rows][columns];

           
        System.out.println("Enter the elements in first matrix :");
        for (int i = 0; i < rows; i++) 
        {
        	for (int j = 0; j < columns; j++) 
        	{
        		matrix1[i][j] = sc.nextInt();
        	}
        }
        System.out.println("Enter the elements in second matrix :");
        for (int i = 0; i < rows; i++) 
        {
        	for (int j = 0; j < columns; j++) 
        	{
                 matrix2[i][j] = sc.nextInt();
        	}
        }
        
        int[][] resultMatix = new int[rows][columns];
        for (int i = 0; i < rows; i++) 
        {
        	
            for (int j = 0; j < columns; j++) 
            {
                 resultMatix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
              
        System.out.println("enter the First matrix is : ");
        for (int i = 0; i < rows; i++) 
        {
             for (int j = 0; j < columns; j++) 
             {
                  System.out.print(matrix1[i][j] + " ");
             }
             System.out.println();
        }
	
 
        System.out.println("enter the Second matrix is : ");
        for (int i = 0; i < rows; i++) 
        {
             for (int j = 0; j < columns; j++) 
             {
                  System.out.print(matrix2[i][j] + " ");
             }
             System.out.println();
        }
        /*System.out.println("The sum of the two matrices is : ");
        for (int i = 0; i < rows; i++) 
        {
             for (int j = 0; j < columns; j++) 
             {
                  System.out.print(resultMatix[i][j] + " ");
             }
         System.out.println();
        }
	}
}*/
        System.out.println("Addition of the Two Matrices:");
		for(int i=0;i<rows;i++)  // row
		{
			for(int j=0;j<columns;j++) // column
			{
				add[i][j] =  matrix1[i][j]+matrix2[i][j];
				System.out.print(add[i][j]+" "); 
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Subtraction of Two Matrices:");
		for(int i=0;i<rows;i++)  // row
		{
			for(int j=0;j<columns;j++) // column
			{
				sub[i][j] =  matrix1[i][j]-matrix2[i][j];
				System.out.print(sub[i][j]+" "); 
			}
			
			System.out.println();
		}
		
		System.out.println();

		System.out.println("Multiplication of Two Matrices:");
		for(int i=0;i<rows;i++)  // row
		{
			for(int j=0;j<columns;j++) // column
			{
				mul[i][j] = matrix1[i][j]*matrix2[i][j];
				System.out.print(mul[i][j]+" "); 
			}
			
			System.out.println();
		}
		
		System.out.println();

		System.out.println("Division of Two Matrices:");
		for(int i=0;i<rows;i++)  // row
		{
			for(int j=0;j<columns;j++) // column
			{
				div[i][j] =matrix1[i][j]/matrix2[i][j];
				System.out.print(div[i][j]+" "); 
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Modulus of Two Matrices:");
		for(int i=0;i<rows;i++)  // row
		{
			for(int j=0;j<columns;j++) // column
			{
				mod[i][j] =matrix1[i][j]%matrix2[i][j];
				System.out.print(mod[i][j]+" "); 
			}
			
			System.out.println();
		}

	}
}
 