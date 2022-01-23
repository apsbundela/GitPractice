
class SearchOperation37
{
	static int finElement(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			return i;
			
		}
			return 0;
	}
	
	public static void main (String args[])
	{
		int arr[] = new int []{20,35,37,40,45,50,51,55,67};
		int key = 37;
		System.out.println("key is at index "+finElement(arr,key));
	
	}


}