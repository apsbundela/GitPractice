
class LinkedList {

	Node head;
		static class Node {
			Integer data;
			Node next;
				Node(Integer data) {
					this.data = data;
					this.next  = null;
				}
				
			public Node next() {
				return this.next;
			}
			public Node setNext(Node next){
				
				return this.next = next;
			}
		}
		
		void atLast(Integer data) {
		
			Node newnode = new Node(data);
			Node temp = head;
				if(head == null)
					head = newnode;
				else {
					while(temp.next != null) {
						
						temp = temp.next;
					}	
					temp.next = newnode;
				}
		}
		
		void display(){
			Node temp = head;
			System.out.print("[ ");
			while(temp != null){
				System.out.print( temp.data+" ");
				temp = temp.next;
			}
		System.out.print("]");
		}
		
		 void swap(){
			Node f = head;
			
			if(f == null)
				return;
			
			Node s = f.next();
			if( s == null)
				return;
			Node n = s.next();
			
			//intial swap
			
			f.setNext(n);
			s.setNext(f);
			head = s;
			
			//second part to swap
			Node p = f;
			while( p.next !=null){
				f = p.next();
				s = f.next();
				
				if(s == null)
					return;
				n = s.next();
				
				f.setNext(n);
				s.setNext(f);
				p.setNext(s);
				
				p=f;
			}
		}
		public static void main(String args[]) {
			
			LinkedList l = new LinkedList();
			l.atLast(1);
			l.atLast(2);
			l.atLast(3);
			l.atLast(4);
	
			l.swap();
			l.display();
		}

}