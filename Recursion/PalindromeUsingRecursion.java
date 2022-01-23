import java.util.Scanner;
class PalindromeUsingRecursion
{
	int rem;
	int sum=0;
	 int palindrome(int num)
	{	
		if(num==0)
			return sum;
			rem=num%10;
			sum = (sum*10)+rem;
			palindrome(num/10);
		return sum;
	}	
	public static void main(String args[])
	{	PalindromeUsingRecursion p = new PalindromeUsingRecursion();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int temp = num;
		int sum2 = p.palindrome(num);
		if(temp ==sum2)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}

/*	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = sc.nextInt();
		int rem,n;
		int sum=0;
		 n = num;
		while(num!=0)
		{	
			rem = num%10;
			sum = sum *10+rem;
			num=num/10;
		}
		
		if(n==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
*/