
class SortQ1 {

	static void sort(int arr[]) {
		
		int n = arr.length;
		for(int i=0; i < n-1; i++) {
			
				for( int j=0; j < n-1-i ; j++) {
				
					if(arr[j] > arr[j+1]) {
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =  temp;
					
				}
					for( int k=0;k<n ; k++ )
				System.out.print(arr[k]+" ");
				System.out.println();
			}
			
			//System.out.println();
		}
			

	}

	public static void main( String args[]) {
		
		int arr[] = {64,34,25,12,22,11,10};
		sort( arr);
	}

}