import java.util.Scanner;
class SimpleList
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data =d;
			next=null;
		}
	}
		void addAtFirst(int x)
		{
			Node newnode = new Node(x);
			if(head==null)
				head=newnode;
			else
			{
				newnode.next=head;
				head=newnode;
			}
		}
		
		void addAtLast(int x)
		{
			Node newnode = new Node(x);
			Node temp=head;
			if(head==null)
			{ 
				head=newnode;
			}
			else
			{
				
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				newnode.next=temp.next;
				temp.next =newnode; 
			}
		}
		
		void addAtSpecficPos(int data,int pos)
		{
			Node temp = head;
			Node newnode = new Node(data);
			if(pos==1)
			{
				addAtFirst(data);
			}
			else
			{
				int count =1;
				while(count!=pos-1)
				{
					temp=temp.next;
					count++;
				}
				
				newnode.next=temp.next;
				temp.next=newnode;
			}
		}
		
		void addAfterNode(int data,int ele)
		{
			Node newnode = new Node(data);
			Node temp = head;
			while(temp.data!=ele)
			{
				temp=temp.next;
			}
				newnode.next=temp.next;
				temp.next=newnode;
		}	
		
		void addAtFirst()
		{
					
		}
		void display()
		{	
			System.out.println("\nList is");
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.println();
		}
			
		void DeletAtFirst()
		{
			if(head==null)
				System.out.println("List is Empty");
			else
			{
				head=head.next;
			}
		}
		public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);
			int choice;
			SimpleList l = new SimpleList();
			do
			{
				System.out.println("\nEnter Choice \n0.Exit\n1. DisplayI\n2. AddAtFirst\n3. AddAtLast\n4. AddAtSpecificPos");
				choice = sc.nextInt();
				
				switch(choice)
				{
					case 0:
							System.exit(0);
							break;
					case 1:
							l.display();
							break;
					case 2:
							System.out.println("Enter Element");
							int ele = sc.nextInt();
							l.addAtFirst(ele);
							break;
					case 3:
							System.out.println("Enter Element");
							 ele = sc.nextInt();
							l.addAtLast(ele);
							break;
					case 4:
							
							System.out.println("Enter data & Position where you wish to link it");
							int data = sc.nextInt();
							int pos =sc.nextInt();
							l.addAtSpecficPos(data,pos);
				}
			}while(true);
		}
	
}
	
	