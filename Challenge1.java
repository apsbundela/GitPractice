public class Challenge1 {
	
	int caluculateLength(int arr[]){
		int n = arr.length;
		int s = 0 , e = n-1;
		
		while( s < n-1 && arr[s] <= arr[s + 1]){
			s++;
		}
		//array is already sorted
		if( e == n-1)
			return 0;
		
	
		while( e >= s && arr[e] >= arr[e-1]){
			e--;
		}
		if( e == 0)
			return n-1;
		int result = Math.min( n-1-s ,e);
		
		int i = 0, j = e;
		while(i <= s && j < n){
			if(arr[j] >= arr[i]){
				result = Math.min(result , j-i -1);
				i++;
			}else {
				j++;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		
		 Challenge1 c = new Challenge1();
		int arr[]= {1,2,3,10,4,2,3,5};
		System.out.println(c.caluculateLength(arr));

	}
} 