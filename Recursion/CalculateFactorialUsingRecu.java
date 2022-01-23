import java.util.Scanner;
class CalculateFactorialUsingRecu
{
	static int fact(int num)
	{
		if(num==1)
		return num;
		else
		{
			return num*fact(num-1);
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Of which factorial you need :");
		int num = sc.nextInt();
		System.out.println("Factorial is :"+fact(num));
	}


}