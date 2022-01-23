

class Stack1
{
	private int SIZE;
	private long arr[];
	private int top;
	
	public Stack1(int SIZE)
	{
		this.SIZE=SIZE;
		this.top=-1;
		arr = new long[SIZE];
	}
	
	boolean isEmpty()
	{
		return (top<0);
	}
	boolean isFull()
	{
		return (top>SIZE-1);
	}
	void push(long ele)
	{
		if(isFull()==true)
		System.out.println("Stack is OverFlow");
		else
		{
			arr[++top]=ele;                 
			System.out.println("Push :"+arr[top]);
		}
	}
	
	public void pop()
	{
		if(isEmpty()==true)
		System.out.println("Stack is UnderFlow");
		else
		{
			System.out.println("Pop :"+arr[--top]);
		}
	}
}

class StackImp1
{
	public static void main(String args[])
	{
		Stack1 s = new Stack1(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		//s.pop();
	}
}
