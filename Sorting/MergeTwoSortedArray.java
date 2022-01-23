
class MergeTwoSortedArray
{
	static void merge(int arr1[],int arr2[],int n,int m)
	{
		int result[] = new int[n+m];
		int i=0,j=0,k=0;
		
		while(i<n && j<m)
		{
			if(arr1[i]<arr2[j])
			{
				result[k]=arr1[i];
				i++;
			}
			else
			{
				result[k]=arr2[j];
				j++;
			}
			k++;
		} 
		
		while(i<n)
		{
			result[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m)
		{
			result[k]=arr2[j];
			j++;
			k++;
		}
		
		for(int l=0;l<result.length;l++)
		{
			System.out.print(result[l]+" ");
		}
	}
	public static void main(String args[])
	{
		int arr1[]={2,3,4,5,6};
		int arr2[]={7,8,9,10};
		merge(arr1,arr2,arr1.length,arr2.length);
	}

}