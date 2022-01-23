class BinaryTree {

	// Root of Binary obj
	Node root;
static class Node {
	int data;
	Node left, right;

	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

	BinaryTree() { root = null; }

	/* Given a binary obj, print its nodes according to the
	"bottom-up" postorder traversal. */
	void printPostorder(Node node)
	{
		if (node == null)
			return;

		// first recur on left subobj
		printPostorder(node.left);

		// then recur on right subobj
		printPostorder(node.right);

		// now deal with the node
		System.out.print(node.data + " ");
	}

	/* Given a binary obj, print its nodes in inorder*/
	void printInorder(Node node)
	{
		if (node == null)
			return;

		/* first recur on left child */
		printInorder(node.left);

		/* then print the data of node */
		System.out.print(node.data + " ");

		/* now recur on right child */
		printInorder(node.right);
	}

	/* Given a binary obj, print its nodes in preorder*/
	void printPreorder(Node node)
	{
		if (node == null)
			return;

		/* first print data of node */
		System.out.print(node.data + " ");

		/* then recur on left subobj */
		printPreorder(node.left);

		/* now recur on right subobj */
		printPreorder(node.right);
	}

	// Wrappers over above recursive functions
	void printPostorder() { printPostorder(root); }
	void printInorder() { printInorder(root); }
	void printPreorder() { printPreorder(root); }
	
	Node insertData(Node root,int key)
	{
		if(root==null)
		{
			root = new Node(key);
			return root;
		}
		
		if(key<=root.data)
		{
			root.left=insertData(root.left,key);
		}
		else
			root.right=insertData(root.right,key);
		return root;
	}
	
	void insert(int key)
	{
		root = insertData(root,key);
	}
	
	public static void main(String[] args)
	{
		BinaryTree obj = new BinaryTree();
		obj.insert(5);
		obj.insert(9);
		obj.insert(3);
		System.out.println("Preorder traversal");
		obj.printPreorder();
		/*obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);

		System.out.println("Preorder traversal");
		obj.printPreorder();

		System.out.println("\nInorder traversal");
		obj.printInorder();

		System.out.println("\nPostorder traversal");
		obj.printPostorder();*/
	}
}