class SL {

	Node head;
		class Node {
			int data;
			Node next;
				Node(int d){
					
					 data = d;
					 next = null;
				}
		}
		
	void insertAtFirst(int ele) {
			Node newnode = new Node(ele); 
		if(head == null)
			head = newnode;
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	
	
	
	void insertAtLast(int ele) {
			Node newnode = new Node(ele);
			
			if(head == null) 
				head = newnode;
			else {
					Node temp = head;
					while(temp.next != null) {
					temp = temp.next;
					}
				
				temp.next = newnode; 
			}

	}
	
	void insertAtPos(int pos , int ele) {
		Node newnode = new Node(ele);
		Node temp = head;
		int count = 1;
		if(pos == 1) {
			insertAtFirst(ele);
		}else {
			
			while( temp!=null && count != pos-1){
				
				temp = temp.next;
				count++;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			
		}
	}
		void deleteAtFirst() {
			
			if(head == null)
				System.out.println("Not found");
			else {
				head = head.next; 
			}
		}
		
		void deletAtLast() {
			
			if(head == null){
				System.out.println("Not found");
			}else{
				
				Node temp = head;
				while(temp.next.next != null){
					temp = temp.next;
				}
				
				temp.next = null;
			}
		}
		
		void deletAtPos(int pos) {
			Node temp = head;
			int count = 1;
				if(head == null)
					System.out.println("Not found");
				else{
					if(pos == 1)
							deleteAtFirst();
					else{
						while( temp != null && count != pos-1) {
							temp = temp.next;
							count++;
						}
						
						temp.next = temp.next.next;
					}
					
				}
		}
		void display(){
			
			Node temp = head;
			while( temp!= null){
				
				System.out.print(temp.data+" ");
				temp =temp.next;
			}
		}
		
		public static void main (String args[]){
		
			SL l = new SL();
			l.insertAtLast(44);
			l.insertAtLast(33);
			l.insertAtLast(22);
			l.insertAtLast(11);
			l.insertAtLast(10);
			l.insertAtFirst(0);
			l.display();
			System.out.println("\nAfter Delete fisrt position");
			l.deleteAtFirst();
			l.display();
			System.out.println("\nAfter Delete Last position");
			l.deletAtLast();
			l.display();
			System.out.println("\nAfter add at position 1  position");
			l.insertAtPos(1,102);
			l.display();
			System.out.println("\nAfter delete at position 1  position");
			l.deletAtPos(1);
			l.display();
		}
	

}

