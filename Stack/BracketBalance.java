
class Stack {
	
	int arr[];
	int top;
	int size;
		Stack(int n) {
			size = n;
			top = -1;
			arr = new int[size];
		}
		
	boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
	}
	
	boolean isFull() {
		if(top == size-1)
			return true;
		return false;
	}

	void push(int ele) {
		
		if(isFull())
			System.out.println("OverFlow");
		else{
			arr[++top] = ele;
		}		
	}
	
	void pop() {
		if(isEmpty())
			System.out.println("UnderFlow");
		else
			top--;
	
	}
	
	int peek() {
	
		return arr[top];
	}	
}

class BracketBalance{
	
	static void isbalanced(StringBuffer str){
		int n = str.length();
		Stack s = new Stack(n);
		boolean flag = true; 
			for(int i=0; i<n; i++) {
				if(str.charAt(i)== '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
					s.push(str.charAt(i));
				else if(str.charAt(i)== ']' || str.charAt(i) == '}' || str.charAt(i) == ')') {
					
				 if(str.charAt(i) == ']' && s.peek() == '[')
					s.pop();
				else if(str.charAt(i) == '}' && s.peek() == '{')
					s.pop();
				else if(str.charAt(i) == ')' && s.peek() == '(')
					s.pop();
				else{
					flag = false;
					break;
				}	
					
				}
			}
			
				if(s.isEmpty() && flag)
					System.out.println("Balanced");
				else
					System.out.println("Not balanced");
	}
	public static void main(String args[]){
		StringBuffer str = new StringBuffer("[{()}]");
		isbalanced(str);
	
	}
	
}







/*class StackBracket
{
	int top;
	int size;
	char arr[];
	
	StackBracket(int size)
	{
		this.size=size;
		top=-1;
		arr=new char[size];
	}
	boolean isEmpty()
	{
		if(top<0)
			return true;
		return false;
	}
	
	boolean isFull()
	{
		if(top==size-1)
			return true;
		return false;
	}
	
	void push(char ele)
	{
		if(isFull())
			System.out.println("Overflow");
		else
		{
			arr[++top]=ele;
		}
	}
	
	void pop()
	{
		if(isEmpty())
			System.out.println("UnderFlow");
		else
		{
			top--;
		}
	}
	
	char peek()
	{
		char c=arr[top];
		return c; 
	}
}
public class BracketBalance {
	
	static boolean isbalanced(String str)
	{
		StackBracket s = new StackBracket(str.length());
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='[' || str.charAt(i)=='{'|| str.charAt(i)=='(')
			{
				s.push(str.charAt(i));
			}
			else if(str.charAt(i)==']' || str.charAt(i)=='}'|| str.charAt(i)==')')
			{
				if(str.charAt(i)==']' && s.peek()==']')
					s.pop();
			}
			
			
		}
		return s.isEmpty() ?true:false;
	}
	
	public static void main(String[] args) {
		String str = new String("[{()()}]");
		boolean b =isbalanced(str);
		if(b==true)
		System.out.println("balanced");
		if(b==false)
			System.out.println("imbalanced");
	}
}*/