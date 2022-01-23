
import java.util.Scanner;
class NumberSeries
{
		static void	printNumberSeries(int num)
		{
			if(num==1)
			{
			System.out.println(num);
			return;
			}
			else
			{
				 printNumberSeries(num-1);
				System.out.println(num);
			}
		}
	

	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print Series");
		int num = sc.nextInt();
		System.out.println("Series is :");
		printNumberSeries(num);
		
		
	}

}