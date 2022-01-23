                               
class DL2
{
	Node head;
	static class Node
	{
		int data;
		Node prev,next;
		Node(int d)
		{
			 data=d;
			prev=null;
			next=prev;
		}
	}
	
	void addAtFirst(int data)
	{	
		Node newnode = new Node(data);
		newnode.next=head;
		newnode.prev=null;
		
		
		if(head!=null)
		{
			head.prev=newnode;
		}
		head = newnode;
	}
	
	void addAtLast(int data)
	{
		Node newnode = new Node(data);
		Node temp =head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newnode;
		
		newnode.prev=temp;
	}
	
	void deleteAtFirst()
	{
		head.next.prev=null;
		head = head.next;
		
	}
	
	void deleteAtLast()
	{
		Node temp =head;
		
	}
	void display()
	{
		Node temp=head;
		Node p=null;
		System.out.println("\nForward Direction");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			p=temp;
			temp=temp.next;
			
		}
		
		System.out.println("\nBackWard Direction");
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.prev;
		}
	}
	
	public static void main(String args[])
	{
		DL2 l = new DL2();
		l.addAtFirst(10);
		l.addAtFirst(20);
		l.addAtFirst(30);
		l.display();
		l.deleteAtFirst();
		l.display();
		
	}


}