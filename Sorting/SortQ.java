class SortQ {

	static void sort(int arr[]) {
		for (int i=0; i < arr.length; i++) {
			for (int j=i+1; j<=arr.length-1; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					for(int k=0; k < arr.length-1; k++) {
						System.out.print(arr[k]+" ");
					}
					
					System.out.println();
				}	
			}
		}
	}
	
	public static void main(String args[]) {
		int arr[]={64,34,25,12,22,11,10};
		sort(arr);
	}

}