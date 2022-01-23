
class BinaryTree {

	Node root;
	
	static class Node {
		
		int data;
		Node left ,right;
			Node( int d){
				data = d;
				left = right = null;
			}
	}
	
	 Node insert(Node root ,int ele){
		
		
		if(root == null){
			root = new Node(ele);
			return root;
		}
		if(root.data>=ele)
			root.left = insert(root.left,ele);
		else
			root.right = insert(root.right,ele);
		
			return root;
	}
	
	 void preorder(Node root){
		
		if(root == null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void inorder(Node root){
		
		if(root == null)
			return;
		
		preorder(root.left);
		System.out.print(root.data +" ");
		preorder(root.right);
	}
	
	void postorder(Node root){
		
		if(root == null)
			return;
		
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data +" ");
	}


	void callInsert(int ele){ root = insert(root,ele);}
	void callPreorder(){ preorder(root);}
	void callInorder(){ inorder(root);}
	void callPostorder(){ postorder(root);}
	
	public static void main(String args[]){
		
		BinaryTree b = new BinaryTree();
		b.callInsert(14);
		b.callInsert(12);
		b.callInsert(10);
		b.callInsert(19);
		b.callInsert(20);
		System.out.println("Preoder Traversal");
		b.callPreorder();
		System.out.println("\nInorder Traversal");
		b.callInorder();
		System.out.println("\nPostorder Traversal");
		b.callPostorder();
		
	}
}