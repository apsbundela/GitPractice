import java.util.*;

class CreatStack
{
	int top;
	int size;
	char arr[];
	
	CreatStack(){};
	CreatStack(int n)
	{
		top=-1;
		size=n;
		arr=new char[size];
	}
	
	boolean isEmpty()
	{
		if(top<0)
			return true;
		return false;
	}
	
	boolean isFull(){
		if(top==size-1)
			return true;
		return false;
	}
	
	void push(char ele){
		if(isFull())
			System.out.println("Overflow");
		else
			arr[++top]=ele;
	}
	
	char pop(){
		if(isEmpty())
			System.out.println("Underflow");
		else
		{
			
			char c =arr[top--];
			return c;
		}
		return 0;
	}
}

class ReverseStringUsingStack{
	
	public static void rev(StringBuffer str)
	{
		int n = str.length();
		CreatStack obj = new CreatStack(n);
		//push Element into the stack
		for(int i=0;i<str.length();i++)
		{
			obj.push(str.charAt(i));
		}
		//pop Element
		for(int i=0;i<str.length();i++)
		{
			char c=obj.pop();
			str.setCharAt(i,c);
			
		}
	}
	
	 public static void main(String args[])
	{
		StringBuffer str = new StringBuffer("ayush");
		rev(str);
		
		System.out.println("After Reverse String");
		System.out.println(str);
		
	}
}

