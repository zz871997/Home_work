package BinaryTree;


import java.util.Stack;
public class BTree {
	//Ham khoi tao cay
	public void init_tree(Node root){
		root=null;
	}
	
	/*Node root;
	public BTree(){
		this.root=null;
	}*/
	
	//Kiem tra cay rong
	public int empty_tree(Node root){
		if(root==null) return 1;
		else return 0;
	}
	
	//Khoi tao 1 nut
	public Node make_node(int x){
		Node p=new Node();
		p.data=x;
		p.left=null;
		p.right=null;
		return p;
	}
	
	//Chen mot nut chua du lieu x vao cay co goc la root va tra ve dia chi nut moi chen
	/*public Node Insert_node(Node root,int x){
		Node p=make_node(x);
		Node q,f;
		if(root==null){
			root=p;
		}
		else{
			q=root;
			f=null;
			while(q!=null){
				f=q;
				if(x<q.data) q=q.left;
				else q=q.right;
			}
			if(x<f.data) f.left=p;
			else f.right=p;
		}
		return p;
	}*/
	
	//Chen nut trai
	public Node InsertLeft(Node root,int x){
		Node newNode,p;
		newNode=make_node(x);
		if(root==null) return root=newNode;
		p=root;
		while(p.left!=null) p=p.left; //Neu p.left da co data thi day xuong, chen vao p.left
		p.left=newNode;
		return newNode;
	}
	
	//Chen nut phai
	public Node InsertRight(Node root,int x){
		Node newNode,p;
		newNode=make_node(x);
		if(root==null) return newNode;
		p=root;;
		while(p.right!=null) p=p.right;
		p.right=newNode;
		return newNode;
	}
	
	
	
	//Ham lay gia tri nut trai/phai
	public void getDataLeft(Node root){
		if(root.left==null) {
			System.out.println("Ben trai nut da cho khong co nut trai");
		}
		else{
			System.out.println("Gia tri nut trai nut da cho la: "+root.left.data);
		}
	}
	public void getDataRight(Node root){
		if(root.right==null) {
			System.out.println("Ben phai nut da cho khong co nut phai");
		}
		else{
			System.out.println("Gia tri nut phai nut da cho la: "+root.right.data);
		}
	}
	
	
	//Duyet truoc
	public void printPreorder(Node root){
		if(root==null) return;
		System.out.print(" "+root.data);
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	//Duyet sau
	public void printPostorder(Node root){
		if(root==null) return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(" "+root.data);
	}
	
	//Duyet giua
	public void printInorder(Node root){
		if(root==null) return;
		printInorder(root.left);
		System.out.print(" "+root.data);
		printInorder(root.right);
	}
	
	//Ham dem so nut tren cay
	public int countNodes(Node root){
		if(root==null) return 0;
		else{
			int ld=countNodes(root.left);
			int rd=countNodes(root.right);
			return 1+ld+rd;
		}
	}
	
	//Ham tim chieu cao cua cay
	public int height(Node root){
		if(root==null) return 0;
		int ld=height(root.left);
		int rd=height(root.right);
		return 1+(ld>rd?ld:rd);
	}
	
	//Ham kiem tra nut la
	public int isLeaf(Node root){
		if(root==null) return 0;
		if((root.left==null)&&(root.right==null)) return 1;
		else return 0;
	}
	//Ham tim nut la sau nhat. Ham tra ve nut la sau nhat
	public Node maxLeaf(Node root){
		if(root==null) return null;
		else{
			if(isLeaf(root)==1) return root;
			Node r=maxLeaf(root.right);
			Node l=maxLeaf(root.left);
			return (height(r)>=height(l)?r:l);
		}
	}
	
	//Ham kiem tra 1 nut nay co phai nut con cua nut kia khong?
	public boolean isParent(Node root, Node p){
		if(root==null) return false;
		if(root==p) return true;
		return ((isParent(root.left,p))||(isParent(root.right,p)));
	}
	
	public Node LeastCommonAncestor(Node root, Node p1, Node p2){
		if(isParent(root.left,p1)&&(isParent(root.left,p2))) 
			return LeastCommonAncestor(root.left,p1,p2);
		if(isParent(root.right,p1)&&(isParent(root.right,p2))) 
			return LeastCommonAncestor(root.right,p1,p2);
		return root;
	}
	
	
	
	
	
	public boolean bstChecker(Node root) {
		final int MIN_INT = Integer.MIN_VALUE;
		final int MAX_INT = Integer.MAX_VALUE;
		// start at the root, with an arbitrarily low lower bound
		// and an arbitrarily high upper bound
		Stack<NodeBounds> stack = new Stack<NodeBounds>();
		stack.push(new NodeBounds(root, MIN_INT, MAX_INT));

		// depth-first traversal
		while (!stack.empty()) {
		    NodeBounds nb = stack.pop();
		    Node node = nb.node;
		    int lowerBound = nb.lowerBound;
		    int upperBound = nb.upperBound;

		    // if this node is invalid, we return false right away
		    if ((node.data < lowerBound) || (node.data> upperBound)) {
		        return false;
		    }

		    if (node.left != null) {
		        // this node must be less than the current node
		        stack.push(new NodeBounds(node.left, lowerBound, node.data));
		    }
		    if (node.right != null) {
		        // this node must be greater than the current node
		        stack.push(new NodeBounds(node.right, node.data, upperBound));
		    }
		}
		return true;
	}
}
