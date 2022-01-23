class InsertionSort {


	
     static void sort(int arr[]){
		
		int n = arr.length;
		for(int i=1; i<n-1; i++){
		
		int temp = arr[i];
		int j = i-1;
			while(j>=0 && arr[j]>temp){
				
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		
	}
	static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	/*static void sort(int arr[]) {
		int n = arr.length;
		for(int i=1; i<n ; i++) {
		 int temp = arr[i];
		   int j = i - 1;
			while( j>=0 && arr[j] > arr [temp]) {
			
			arr[j+1] = arr[j];
			j--;
			
			}
			
		}
		
	}*/
	
	public static void main (String args[]) {
	
	int arr[] = {1,2,5,9,10};
	sort(arr);
	display(arr);
	
	}
}