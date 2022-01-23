
class FindMisssingElementInArray
{
	static int missyou1(int arr[])
	{	int sum=0;
		for(int i=0	;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		int miss = (((arr.length+1)*(arr.length+1+1))/2) -sum;  // n(n+1)/2
		return miss;
	}
		
	static void missyou2(int arr[])
	{
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{int temp=0;
					if(arr[i]>arr[j])
					{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
				}
			}
			for(int k=0;k<arr.length;k++)
			{
					if(arr[k+1]-arr[k]!=1)
					{
						System.out.println("Missed Elemenet "+(arr[k]+1));
						break;
					}
					
					
			}
	}	
	public static void main(String args[])
	{
		int arr1[] = new int[]{1,2,4,6,3,7,8};
		int arr2[]=new int[]{1,2,4,5};              // 4 3 1 5   1 3 4 5 
		System.out.println("Missed Elemenet "+missyou1(arr1));
		missyou2(arr2);
	}

}