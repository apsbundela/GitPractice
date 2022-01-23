
class DL
{
Node head;
	static  class Node
	{
				
		int data;
		Node prv,next;
		
		Node(int d)
		{
			data=d;
			prv=null;
			next=prv;
		}
	}
	void insert(int data)
	{
		Node newNode = new Node(data);
		newNode.next=head; //common for this particula case
		newNode.prv=null;   
		  
		if(head!=null)
			head.prv=newNode;  
		head=newNode;		
	}
	
	void append(int data)
	{
		Node newNode = new Node (data);
		Node n= head;
		newNode.next = null;  //common for this particular case
		
		if(head==null)
		{
			newNode.prv=null;
			head= newNode;
		}
		
		while(n.next!=null)
			n=n.next;
		
		n.next=newNode;
		newNode.prv=n;
			
	}
		
		
	void insertAfterNode(Node n,int data)
	{
		// n=head;
		 Node newNode = new Node(data);
		 newNode.next=n.next;
		n.next=newNode;
		newNode.prv=n;
		if(newNode.next!=null)
			newNode.next.prv=newNode;
	}
		
	
	void display(Node head)
	{
		Node n = head;
		Node p=null;
		System.out.println("Forward display");
		while(n!=null)
		{
			System.out.print(n.data+" ");
			p=n;
			n=n.next;
		}
		
		System.out.println("\nBackWard display");
		while(p!=null)
		{
			System.out.print(p.data+" ");
			
			p=p.prv;
		}
	}
	
	public static void main (String args[])
	{
		DL l = new DL();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.append(50);
		l.insertAfterNode(l.head,16);
		l.display(l.head);
	
	}

}