import java.util.Scanner;
class BTPractice
{
	Node root;
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
		
		Node insertion(Node root,int key)
		{
			if(root==null)
			{
				root=new Node(key);
				return root;
			}
			
			if(key<root.data)
				root.left=insertion(root.left,key);
			else
				root.right=insertion(root.right,key);
				
			return root;
		}
		
		void preOrder(Node root)
		{
			if(root==null)
				return ;
			System.out.print(root.data+" ");	
			preOrder(root.left);
			preOrder(root.right);
			
			
		}
		void callInsertion(int key)
		{
			root=insertion(root,key);
		}
		void callPreorder()
		{
			preOrder(root);
		}
		public static void main (String args[])
		{	
			Scanner sc = new Scanner(System.in);
			BTPractice obj = new BTPractice();
			int choice;
			do
			{	System.out.println("\nEnter Choice");
				System.out.println("0.Exit\n1insert\n2.preorder");
				choice = sc.nextInt();
				switch(choice)
				{
					case 0:
							System.exit(0);
							break;
					case 1: 
							System.out.println("Enter nodes");
							for(int i=0;i<5;i++)
							{
								int value=sc.nextInt();
								obj.callInsertion(value);
								
							}
							break;
					case 2:
							System.out.println("Traversal in preorder");
							obj.callPreorder();
							break;
				
				}
				
				
			}while(true);
		}
		
		
	
	
	


}