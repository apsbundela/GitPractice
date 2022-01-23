
import java.util.*;
class Stack2
{
	int arr[];
	int top;
	int size;
	Stack2(int size)
	{
		arr=new int[size];
		top=-1;
		this.size =size;
	}
	boolean IsFull()
	{
		return top==size-1;
	}
	boolean IsEmpty()
	{
		return top==-1;
	}
	
	void push(int ele)
	{
		if(IsFull()==true)
		System.out.println("OverFlow");
		
		else
		{
			arr[++top]=ele;
			System.out.println(ele +"Is pushed");
		}
	}
	
	void pop()
	{
		top =top-1;
		System.out.println(arr[top-1] +"Is pushed");
	}
	
	public static void main(String args[])
	{
		Stack s = new Stack(5);
		s.push(45);
	}

}