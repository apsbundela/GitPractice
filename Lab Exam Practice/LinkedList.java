
 class BT
 {
	Node root;
	class Node()
	{
		int data;
		Node left,right;
		Node(int d)
		{
			data =d;
			left=right=null;
		}
	}
	
	void printPreorder(Node node)
	{
		if(node==null)
			return;
		
		System.out.print(node.data+" ");
		preorder(node.left);
		preoder(node.right); 
			
		
	}
	
	void printInorder(Node node)
	{
		if(node==null)
			return;
		printInorder(node.left);
			System.out.print(node.data+" ");
		printInorder(node.right);
	}
	
	void printPostorder(Node node)
	{
		if(node==null)
			return;
			printPostorder(node.left);
			prnttPostorder(node.right);
			System.out.println(node.data+ " ");
	}
	void preorder(){ printPreorder(root)}
	void inorder(){ printPreorder(root)}
	void postorder() {printPostorder(root)}
	
	
	
	public static void main(String args[])
	{
		BT b = new BT();
		b.root= new Node(5);
		b.root.left= new Node(6);
		b.root.right=new Node(8);
		b.root.left.left(7);
		System.out.println("PreOrder Traversal");
		b.preorder();
		System.out.println("InOrder Traversal");
		b.inorder();
		System.out.println("PostOrder Traversal");
		b.postorder();
		
	}
 
 }