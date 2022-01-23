
class SumOfSeries 
{
	
	static double sum(double n)
	{
		if(n==1)
		return n;
		if(n%2==0)
		return (-1/n+sum(n-1));
		else
		return (1/n+sum(n-1));
	}
	public static void main(String args[])
	{
		double n=4;
		double res =sum(n);
		System.out.println(res);
	}
}