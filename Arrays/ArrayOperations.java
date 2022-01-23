
import java.util.*;
class ArrayOperations
{	Scanner sc = new Scanner(System.in);
	void setElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}	
	}
	
	void showElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
	
	void InsertElment(int arr[],int key)
	{	
		int arr1[] = new int[arr.length+1];
		arr1=arr;
		arr1[arr1.length-1]=key;
	}
	
	void DeletElement(int arr[],int ele,int size)
	{	

		int i;
		for(i=0;i<size;i++)
		{
			if(arr[i]==ele)
			break;
		}
		
		for(int j=i;j<size;j++)
		{
			arr[j]=arr[j+1];
		}
		size=size-1;
	}	
	
	int search(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
				return 1;
		}
		return -1;
	}
	
	void sumElement(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of Array Element is  :" +sum);
	}
	
	void reverse(int arr[])
	{
		for(int i=0;i<arr.length/2;i++) 
		{	int temp =arr[i];
			arr[i]=	arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
	void copy(int arr[],int arr1[])
	{
		arr1 = arr;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		System.out.println("After Deleting Element Array is"+Arrays.toString(arr1));
	}
	
	void merge(int arr[],int size)
	{	System.out.println("Enter Size of Array1");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size+size1];
		
		for(int i=0;i<(arr1.length);i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		
		for(int j=0;j<arr.length;j++)
		{	
			arr2[j]=arr[j];
		}
		
		for(int k=arr.length,l=0; k<size+size1;k++,l++)
		{
			arr2[k]=arr1[l];
		}
		System.out.println("After Merging two ArrayS "+Arrays.toString(arr2));
	}
		
	static int MenuList()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter Choice");
		System.out.println("0.Exit");
		System.out.println("1.showElement");
		System.out.println("2.InsertElment");
		System.out.println("3.DeletElment");
		System.out.println("4.SearchElement");
		System.out.println("5.SumArrayOfElment");
		System.out.println("6.Reverse Array");
		System.out.println("7.Copy array");
		System.out.println("8.MergeArray");
		return sc.nextInt();
	}	

	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int SIZE = sc.nextInt();
		int arr[] = new int[SIZE];
		System.out.println("Enter Element");
		ArrayOperations a = new ArrayOperations();
		a.setElement(arr);
		int choice;
		while((choice=ArrayOperations.MenuList())!=0)
		{
			switch(choice)
			{
				case 1:
					a.showElement(arr);
					break;
				case 2:	
					System.out.println("Enter Element to insert"); 
					int key =sc.nextInt();
					a.InsertElment(arr,key);
					break;
				case 3:
					System.out.println("Enter Element to delete"); 
					int ele =sc.nextInt();
					a.DeletElement(arr,ele,SIZE);
					break;
				case 4:
					System.out.println("Enter Element to search");
					int res =a.search(arr,sc.nextInt());
					if(res==1)
						System.out.println("Found");
					else
						System.out.println("Not Found");
					break;
				case 5:
						a.sumElement(arr);
						break;
				case 6:
					a.reverse(arr);
					break;
				case 7:	int arr1[] = new int[SIZE];
						a.copy(arr,arr1);
						break;
				case 8:
						a.merge(arr,SIZE);
						break;
			}
		}
	
	}

}