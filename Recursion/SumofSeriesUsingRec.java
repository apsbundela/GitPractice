
import java.util.Scanner;
class SumofSeriesUsingRec
{

	static int  sum(int num)
	{
		if(num==1)
		return num;
		else
		{
			return num+sum(num-1);
		}
	
	}
		
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print Series sum");
		int num = sc.nextInt();
		System.out.println("Sum Of Series is :"+sum(num));
	}
}