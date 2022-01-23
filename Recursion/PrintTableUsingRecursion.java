
import java.util.Scanner;
class PrintTableUsingRecursion
{
	static void table(int num,int i)
	{
		if(i==11)
			return;
		System.out.println(num +"*" +i +"="+(num*i));
		table(num,++i);
		
	}

	public static void main(String args[])
	{
		System.out.println("Enter Number to print table");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i=1;
		table(num,i);
		
	}
	
}