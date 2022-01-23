
class BubbleSort
{
	static void bubbleSorting(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			   boolean isSwap = false;
			for(int j=0; j<n-1-i; j++) {
			  if( arr[j] > arr[j+1] ){
					int temp = arr[j];
					  arr[j] = arr[j+1];
					arr[j+1] = temp;

				isSwap = true;
			    }
			}
			if(isSwap == false)break;
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
		int arr[] = {23,66,8,9,22,4,222,90};
		bubbleSorting(arr);
		System.out.println(" Sorted array");
		display(arr);
	}

}