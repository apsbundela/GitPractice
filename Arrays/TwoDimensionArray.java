import java.util.*;
class TwoDimensionArray
{
	
	
	 static void setArray(int [][]arr,int r,int c)
	{Scanner sc = new Scanner(System.in);
		for(int i=0; i<r;i++)
			for(int j=0; j<c;j++)
				arr[i][j]=sc.nextInt();
	}
	
	static void showArray(int arr[][],int r,int c)
	{
		for(int i=0; i<r;i++)
		{
			for(int j=0; j<c;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static void addition(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2)
	{	
		int arr3[][]= new int [r1][c1];
		int sum=0;
			for(int i=0; i<r1;i++)
			{
				for(int j=0; j<c1;j++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			System.out.println("SUM  ");
			
		for(int i=0; i<r1;i++)
		{
			for(int j=0; j<c1;j++)
			{
				System.out.print(arr3[i][j] +" ");
			}
			System.out.println();
		}
	}	
	
	static void substraction(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2)
	{	
		int arr3[][]= new int [r1][c1];
		int sum=0;
			for(int i=0; i<r1;i++)
			{
				for(int j=0; j<c1;j++)
				{
					arr3[i][j]=arr1[i][j]-arr2[i][j];
				}
			}
			System.out.println("\nSUBstraction ");
			
		for(int i=0; i<r1;i++)
		{
			for(int j=0; j<c1;j++)
			{
				System.out.print(arr3[i][j] +" ");
			}
			System.out.println();
		}
	}	
	
	static void multiplication(int arr1[][],int r1,int c1,int arr2[][],int r2,int c2)
	{	
		int arr3[][]= new int [r1][c1];
		int sum=0;
			for(int i=0; i<r1;i++)
			{
				for(int j=0; j<c1;j++)
				{
					arr3[i][j]=arr1[i][j]*arr2[i][j];
				}
			}
			System.out.println("\nmultiplication ");
			
		for(int i=0; i<r1;i++)
		{
			for(int j=0; j<c1;j++)
			{
				System.out.print(arr3[i][j] +" ");
			}
			System.out.println();
		}
	}	

	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Set ROW & COLUMN values of array1");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int arr1[][]= new int [r1][c1];
		System.out.println("Set ROW & COLUMN values of array2");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int arr2[][]= new int [r2][c2];
		System.out.println("SET 2D ARRAY1 ELEMENT");
		setArray(arr1,r1,c1);
		System.out.println("SET 2D ARRAY1 ELEMENT");
		setArray(arr2,r2,c2);
		addition(arr1,r1,c1,arr2,r2,c2);
		substraction(arr1,r1,c1,arr2,r2,c2);
		multiplication(arr1,r1,c1,arr2,r2,c2);
	}
}