
import java.util.Scanner;
class FibboSeriesUsingRec
{
	  int a = -1;
	  int b =  1;
	  int c;
	  static int count =0;
	 void fibo(int t1)
	{
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		count++;
		if(t1!=count)
		fibo(t1);
		else
		return;
	}
	
	
	public static void main(String args[])
	{	Scanner sc = new Scanner(System.in);
		FibboSeriesUsingRec f = new FibboSeriesUsingRec();
		System.out.println("Enter value upto which you want fibo series :");
		int t1 = sc.nextInt(); 
		System.out.println("Fibonicci Series ");
		f.fibo(t1);
	}

}
