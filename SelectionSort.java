package Basics;

public class SelectionSort 
{
	public static void Selectionsort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				int smallest=a[j];
				
				if(a[j]<a[i])
				{
			    smallest=a[j];
				a[j]=a[i];
				a[i]=smallest;
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int[] a= {13,16,11,20,42,46,76,23,43,53};
		System.out.println("Array before selection sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		Selectionsort(a);
		System.out.println("Array after selection sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}