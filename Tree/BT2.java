class BT2
{
	Node root;
	class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data=d;
			left=right=null;
		
		}
	
	}
	
	Node insert(Node root,int value)
	{
		if(root==null)
		{
			root= new Node (value);
			return root;
		}
		
		if(root.data>=value)
			root.left= insert(root.left,value);
		else
			root.right=insert(root.right,value);
		
		return root;
	}
	
	Node deleteData(Node root ,int key)
	{
		if(key<root.data)
			root.left=deleteData(root.left,key);
		else
			root.right=deleteData(root.right,key);
		
		//Code for case 1 and 2
		if(root.left==null)
			return root.right;
	else if(root.right==null)
			return root.left;
	
		//for case 3
		

		root.data=minValue(root.right);
		
		//deleting an element inorder 
		// and replacing it with successor node
		root.right=deleteData(root.right,root.data);
		return root;
	
	}
	
	int minValue(Node root)
	{
		int x =root.data;
		while(root.left!=null)
		{	
			x=root.left.data;
			root=root.left;
		}
		return x;
		
	}
	void printInorder(Node root)
	{
		if(root==null)
			return;
		printInorder(root.left);
		System.out.print(root.data + " ");
		printInorder(root.right);
	}
	
	void delete(int key)
	{
		root=deleteData(root,key);
	}
	
	void insert(int key)
	{
		root= insert(root,key);
	}
	
	void inorder(){ printInorder(root); }
	
	public static void main(String args[])
	{
		BT2 obj = new BT2();
		obj.insert(3);
		obj.insert(4);
		obj.insert(1);
		obj.insert(2);
		System.out.println("Before ");
		obj.inorder();
		obj.delete(4);
		System.out.println("after ");
		obj.inorder();
	}



}