import java.util.*;
class Queue
{
	int size;
	int rear,front;
	int arr[];
	
	Queue(int size)
	{
		this.size = size;
		arr = new int[size];
		rear=-1;
		front=-1;
	}
	
	boolean IsEmpty()
	{
		if((front==-1 && rear==-1)|| front >rear)
			return true;
		else
			return false;
	}
	
	boolean IsFull()
	{
		if(rear==size-1)
		return true;
		else
		return false;
	}
	
	void enqueue(int x)
	{
		if(IsFull())
		{
			System.out.println("Queue is Full");
		}
		else
		{
			if(front==-1)
			 front=0;
			
			arr[++rear]=x;
			System.out.println(x+" is Pushed");
		
		}
	}
	
	void dequeue()
	{
		if(IsEmpty())
			System.out.println("Queue is Empty");
		else
		{
			if(front >=rear){
				
				front = -1;
				rear = -1;
			}else{
				front++
			}
		}
	
	}
	
	void peek()
	{
		if(IsEmpty())
			System.out.println("Queue is Empty");
		else
		{
			System.out.println(arr[front]+" is Peeked");
		}
	
	}
	
	void print()
	{
		if(IsEmpty())
			System.out.println("Queue is Empty");
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n = sc.nextInt();
		Queue q = new Queue(n);
		
		do
		{
			System.out.println("Enter choice \n1.enqueue\n2.dequeue\n3.peek\n4.Print\n5.Exit");
			int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("Enter value");
				int value = sc.nextInt();
				q.enqueue(value);
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				q.print();
				break;
			case 5:
				System.exit(0);
				break;
			
		}
			
		}while(true);
	}
}