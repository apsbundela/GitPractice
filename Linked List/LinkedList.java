import java.util.*;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}
class LinkedList{
	Node head;
	
	LinkedList(){
		head = null;
	}
	
	void addAtLast(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else
		{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		System.out.println(data+" added successfully!!!");
	}
	
	void addAtFirst(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}
		System.out.println(data+" added successfully!!!");
	}
	
	void addAfterNode(int data,int elem){
		Node newNode = new Node(data);
		Node temp=head;
		while(temp != null && temp.data != elem){
			temp = temp.next;
		}
		if(temp == null){
			System.out.println(elem+" not found");
		}
		else{
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println(data+" added successfully!!!");
		}
	}
	
	void addBeforeNode(int data,int elem){
		Node newNode = new Node(data);
		Node temp = head;
		Node temp1 = null;
		if(head != null && head.data == elem)
			addAtFirst(data);
		else{
			while(temp != null && temp.data != elem){
				temp1 = temp;
				temp = temp.next;
			}
			if(temp1 == null || temp == null)
				System.out.println(elem+" not found!!!");
			else{
				newNode.next = temp1.next;
				temp1.next = newNode;
				System.out.println(data+" added successfully!!!");
			}
		}
	}
	
	void addAtPosition(int data,int pos){
		Node newNode = new Node(data);
		Node temp = head;
		int count=1;
		if(pos == 1)
			addAtFirst(data);
		else{
			while(temp != null && count != pos-1){
				temp=temp.next;
				count++;
			}
			if(temp == null){
				System.out.println(pos+" not found");
			}else{
				newNode.next = temp.next;
				temp.next = newNode;
				System.out.println(data+" added successfully!!!");
			}
		}
	}
	
	void addAfterPosition(int data, int pos){
		Node newNode = new Node(data);
		Node temp = head;
		int count=1;
		while(count != pos){
			temp=temp.next;
			count++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println(data+" added successfully!!!");
	}
	
	void addBeforePosition(int data, int pos){
		Node newNode = new Node(data);
		Node temp = head;
		int count=1;
		while(count != pos-1){
			temp=temp.next;
			count++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println(data+" added successfully!!!");
	}
	
	void print(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		while(true){
			System.out.println("1. Add at first\n2. Add at last\n3. Add after particular node\n4. Add before particular node\n5. Add at psoition\n6. Add before position\n7. Add after position\n8. Print");
			System.out.print("Enter your choice:");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			int data,elem,position;
			switch(choice){
				case 1:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					ll.addAtFirst(data);
					break;
				case 2:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					ll.addAtLast(data);
					break;
				case 3:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					System.out.print("Enter the data after which the element is to be inserted:");
					elem = sc.nextInt();
					ll.addAfterNode(data,elem);
					break;
				case 4:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					System.out.print("Enter the data before which the element is to be inserted:");
					elem = sc.nextInt();
					ll.addBeforeNode(data,elem);
					break;
				case 5:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					System.out.print("Enter the position at which the element is to be inserted:");
					position = sc.nextInt();
					ll.addAtPosition(data,position);
					break;
				case 6:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					System.out.print("Enter the position before which the element is to be inserted:");
					position = sc.nextInt();
					ll.addBeforePosition(data,position);
					break;
				case 7:
					System.out.print("Enter the data:");
					data = sc.nextInt();
					System.out.print("Enter the position after which the element is to be inserted:");
					position = sc.nextInt();
					ll.addAfterPosition(data,position);
					break;
				case 8:
					ll.print();
					break;
				case 9:
					System.exit(0);
			}
			
		}
	}
}








