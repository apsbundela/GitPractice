
import java.util.Scanner;
class SearchingElementIndexInArray
{
	public static int search(int arr[])
	{Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to Search");
		int key = sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			return i;
		}
		return -1;
	}

	public static void main(String args[])
	{
		int arr[] = new int[]{10,20,80,30,60,50,110,130,170};
		int index = search(arr);
			System.out.println("Key At Index :"+index);
	
	}
}