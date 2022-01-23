


class Stack
{
	int arr[];
	int size;
	int top;
	Stack(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	
	int isFull()
	{	
		if(top==size-1)
		return 0;
		return 1;
	}
	
	int isEmpty()
	{
		if(top==-1)
		return 0;
		return 1;
	}
	
	void push(int ele)
	{
		if(isFull()!=0)
		{	
			top++;
			arr[top]=ele;
		}
		else
		{
			System.out.println("OverFlow");
		}
	}
	void pop()
	{
		if(isEmpty()!=0)
		{
			top--;
		}
		else
		{
			System.out.println("UnderFlow");
		}
	}
	int peek()
	{
		return arr[top];
	}
	public static void main(String args[])
	{
		Stack s = new Stack(5);
		s.push(23);
		s.push(78);
		s.pop();
		System.out.println(s.peek());
	
	}

}