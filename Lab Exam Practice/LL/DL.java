class DL {
	Node head;
	class Node{
		int data;
		Node prev,next; 
		
			Node(int d){
				 data = d;
				next = prev = null;
			}
	}
	
	void insertAtFirst(int ele){
		
		Node newnode = new Node(ele);
		Node temp = head;
		if(head == null){
			head = newnode;
		}else{
			newnode.next = head;
			head = newnode;
		}
	}
	
	void insertAtLast(int ele){
		
		Node newnode = new Node(ele);
		Node temp = head;
		if(head == null){
			head = newnode;
		}
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.prev = temp;
	}
	
	void insertAtPos(int ele,int pos){
		
		Node newnode = new Node(ele);
		Node temp = head;
		int count = 1;
			if( pos == 1)
				insertAtFirst(ele);
			else{
				while( count != pos-1){
					temp = temp.next;
					count++;
				}
				newnode.next = temp.next;
				temp.next.prev = newnode;
				newnode.prev = temp;
				temp.next = newnode;
			}
	}
	
	void deleteAtFirst(){
		
		if(head == null)
			System.out.println("List is Empty");
		else{
			head.next.prev = null;
			head = head.next;
		}
	}
	
	void deleteAtLast(){
		
		Node temp = head;
		if(head == null)
			System.out.println("List is Empty");
		else{
			
			while(temp.next != null){
				temp = temp.next;
			}
			 temp.prev.next = null;
		}
	}
	
	void deleteAtPos(int pos) {
		
			Node temp = head;
			int count = 1;
			
			if(pos == 1){
				deleteAtFirst();
			}else {
				
				while(count != pos){
					temp = temp.next;
					count++;
				}	
				temp.prev.next = temp.next;
				temp.next.prev = temp.prev;	
			}
		
	}
	void display(){
	
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
		public static void main(String args[]){
		
		DL l = new DL();
		l.insertAtFirst(44);
		l.insertAtFirst(33);
		l.insertAtFirst(22);
		l.insertAtLast(100);
		l.display();
		System.out.println("\nAfter inserting at 2 pos Node");
		l.insertAtPos(99,2);
		l.display();
		System.out.println("\nAfter deleting at 1 Node");
		l.deleteAtFirst();
		l.display();
		System.out.println("\nAfter deleting  Last node");
		l.deleteAtLast();
		l.display();
		System.out.println("\nAfter deleting  Specific 2 node");
		l.deleteAtPos(2);
		l.display();
		}

}

