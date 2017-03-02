package BinarySearchTree;
import java.util.Scanner;
import java.util.Stack;

public class BST {
	//Ham khoi tao cay
	public void init_tree(Node root){
		root=null;
	}
	
	//Kiem tra cay rong
	public int empty_tree(Node root){
		if(root==null) return 1;
		else return 0;
	}
	
	//Kiem tra mot cay nhi phan co la cay nhi phan tim kiem khong?
	public boolean bstChecker(Node root) {
		final int MIN_INT = Integer.MIN_VALUE;
		final int MAX_INT = Integer.MAX_VALUE;
		
		Stack<NodeBounds> stack = new Stack<NodeBounds>();
		stack.push(new NodeBounds(root, MIN_INT, MAX_INT));

		// depth-first traversal
		while (!stack.empty()) {
		    NodeBounds nb = stack.pop();
		    Node node = nb.node;
		    int lowerBound = nb.lowerBound;
		    int upperBound = nb.upperBound;

		    
		    if ((node.data < lowerBound) || (node.data> upperBound)) {
		        return false;
		    }

		    if (node.left != null) {
		       
		        stack.push(new NodeBounds(node.left, lowerBound, node.data));
		    }
		    if (node.right != null) {
		        
		        stack.push(new NodeBounds(node.right, node.data, upperBound));
		    }
		}
		return true;
	}
	
	//Ham tim chieu cao cua cay
	public int height(Node root){
		if(root==null) return 0;
		int ld=height(root.left);
		int rd=height(root.right);
		return 1+(ld>rd?ld:rd);
	}
	
	//Ham kiem tra cay nhi phan tim khiem can bang
	public boolean isAVL(Node root){
		if(root==null) return false;
		if(bstChecker(root)==true){
			int heightL=height(root.left);
			int heightR=height(root.right);
			if(Math.abs(heightL-heightR)<1) return true;
			else return false;
		}
		else return false;
	}
	
	//Them 1 nut vao cay
	public Node insertnode(Node root,int x){
		Node p=make_node(x);
		Node q,f;
		if(root==null) root=p;
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
	}
	
	//Khoi tao 1 nut
	public Node make_node(int x){
		Node p=new Node();
		p.data=x;
		p.left=null;
		p.right=null;
		return p;
	}
	
	//Duyet cay
	public void LNR(Node root){
		if(root==null) return;
		LNR(root.left);
		System.out.print(" "+root.data);
		LNR(root.right);
	}
	
	
	//Tim kiem, neu thay tra ve nut tim thay,nguoc lai tra ve null
	public Node search(Node root, int x){
		if(root!=null){
			if(root.data==x) {
				Node p=root;
				return p;
			}
			if(root.data>x) return search(root.left,x);
			if(root.data<x) return search(root.right,x);
		}
		return null;	
	}
	
	//Tim min cua 1 cay tro boi node T
	public Node findMin(Node T){
		/*Luon di theo con trai*/
		if(T==null) return null;
		else
			if(T.left==null) return T;
			else return findMin(T.left);
	}
	
	public Node delete(Node T,int x){
		Node tmp;
		if(T==null) System.out.println("Not found");
		else if(x<T.data)   /*Di ben trai*/
			T.left=delete(T.left,x);
		else if(x>T.data)   /*Di ben phai*/
			T.right=delete(T.right,x);
		else           /*Tim duoc phan tu can xoa*/
		if(T.left!=null && T.right!=null ){
			/*Tinh huong: phan tu the cho la phan tu min o cay con phai*/
			tmp=findMin(T.right);
			T.data=tmp.data;
			T.right=delete(T.right,T.data);
		}
		else {  /*Co 1 con hoac khong co con*/
			tmp=T;
			if(T.left==null) T=T.right;
			else if(T.right==null) T=T.left;
		}
		return T;
	}
	
}
	