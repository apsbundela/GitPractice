
class SelectionSort
{
	static void selectionSort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min =i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min]>arr[j])
					min=j;
			}
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;			
		}
	}

	static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int arr[] = {5,3,8,4,6};
		selectionSort(arr);
		System.out.println("After sorting  array");
		display(arr);
	}

}