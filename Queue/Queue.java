
class Queue
{
	int arr[];
	int size;
	int rear,front;
	
	Queue(int size)
	{
		this.size=size;
		arr=new int[size];
		rear  = -1;
		front = -1;
	}
	
	boolean IsFull()
	{
		return (front==0 && rear==size-1);
	}
	boolean IsEmpty()
	{
		return front==-1;
	}
	
	void enqueue(int x)
	{
		if(IsFull())
			System.out.println("Full");
		else
		{
			if(front==-1)
				front =0;
				//rear = rear+1;
				arr[++rear]=x;	
				System.out.println(x+" is Pushed");
		}
		
	}
	
	void dequeue()
	{
		int x;
		x=arr[front];
		if(IsEmpty())
			System.out.println("Empty");
		else
		{
			if(front>=rear)
			{
				front =-1;
				rear=-1;
			}
			else
			{
				front++;
			}	
		}
		System.out.println("\n"+x+" is Deleted");
	}
	
	void display()
	{
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[])
	{
		Queue q = new Queue(5);
		q.enqueue(11);
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(15);
		q.enqueue(16);
		q.display();
		q.dequeue();
		q.enqueue(17);
		q.display();
	}
} 