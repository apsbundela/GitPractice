
class LinkedList {
	
	Node head;
	static class Node {
		
		int data;
		Node next;
			Node(int data) {
				this.data=data;
				next = null;
			}
	}
	 void deletAtFirst(){
		
		if(head!=null)
			head = head.next;	
	}
	
	void insert(int ele) {
		
		Node newnode = new Node(ele);
		if(head == null){
			head = newnode;
		}
		else{
			newnode.next = head;
			head = newnode;
		}	
	}
/*	void deletAtPos(int pos) {
		
		int temp = head;
		int count=1;
		if(pos==1){
			deletAtFirst();			
	
	}*/
	
	void display(){
		Node temp = head;
		while(temp !=null) {
			
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}

class Solution {

		public static void main(String args[]) {
			LinkedList  l = new LinkedList();
			l.insert(83);
			l.insert(86);
			l.insert(33);
			l.insert(22);
			l.insert(11);
			l.insert(44);
			l.deletAtFirst();
			l.display();
			
	}
}
	


