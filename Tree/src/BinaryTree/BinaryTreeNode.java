package BinaryTree;

public class BinaryTreeNode {
	public Node value;
	BinaryTreeNode left,right;
	
	//Cac phuong thuc khoi dung
	public BinaryTreeNode(){
		value=new Node();
		left=null;
		right=null;
	}
	
	public BinaryTreeNode(Node value){
		this.value=value;
		left=null;
		right=null;
	}
	
	//Phuong thuc truy nhap thuoc tinh value
	public Node getValue(){
		return value;
	}
	public void setValue(Node value){
		this.value=value;
	}
	
	//Phuong thuc truy nhap thuoc tinh Left
	public BinaryTreeNode getLeft(){
		return left;
	}
	public void setLeft(BinaryTreeNode left){
		this.left=left;
	}
	
	//Phuong thuc truy nhap thuoc tinh Right
	public BinaryTreeNode getRight(){
		return right;
	}
	public void setRight(BinaryTreeNode right){
		this.right=right;
	}
}
