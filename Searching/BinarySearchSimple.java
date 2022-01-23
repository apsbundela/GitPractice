

class BinarySearchSimple
{
	static int search(int[]arr,int l,int h,int key)
	{
		while(l<=h)
		{
			int m = l +(h-l)/2;
			
			if(m==key)
				return m;
			if(key>m)
			l=m+1;
		
			if(key<m)
			h=m-1;
		}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[] = new int[]{10,20,30,40};
		int key=20;
		int l=0;
		int h=arr.length-1;
		int res =search(arr,l,h,key);
		if(key==res)
			System.out.println("FOUND");
		else
			System.out.println("NOT FOUND");
	}







}