
import java.util.*;
class BinarySearch
{
	static int binarySearch(int key ,int []arr,int min,int max)
	{	
		if( min<=max)
		{
			int mid = min+(max-min)/2;
			if(key==arr[mid])
				return mid;
			if(key>arr[mid])
				return binarySearch(key,arr,mid+1,max);
				return binarySearch(key,arr,min,mid-1);
		}
			return -1;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Eneter Size Of Array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Eneter Element Of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key to search");		
		int key=sc.nextInt();
		int min = 0;
		int max = arr.length-1;
		int res =binarySearch(key,arr,min,max);
	if(res==-1)
		System.out.println("Key is Invalid");
	else
		System.out.println("Key is Found at "+res+"Index");
	}

}