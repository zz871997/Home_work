package BinaryTree;

public class BinaryTree {
	public BinaryTreeNode root;
	//Khoi dung
	public BinaryTree(){
		root=null;
	}
	public BinaryTree(Node value){
		root=new BinaryTreeNode(value);
	}
	
	//Phuong thuc tra ve node co gia tri value
	public BinaryTreeNode getNode(Node value){
		return 	searchNode(root,value);
	}
	//Phuong thuc tim kiem de quy mot node co gia tri value tren 1 cay con co goc la treeNode
	public BinaryTreeNode searchNode(BinaryTreeNode treeNode,Node value){
		if(treeNode.getValue().equals(value)) return treeNode;
		if(treeNode==null) return null;
		BinaryTreeNode result=null;
		//Tim kiem ben nhanh ben trai
		result=searchNode(treeNode.getLeft(),value);
		if(result==null) result=searchNode(treeNode.getRight(),value);
		return result;
	}
	
	//Phuong thuc them node con ben trai node treeNode
	public boolean insertLeft(BinaryTreeNode treeNode, Node value){
		if(treeNode==null) return false;
		BinaryTreeNode newNode=new BinaryTreeNode();
		treeNode.setLeft(newNode);
		return true;
	}
	
	//Phuong thuc them node con ben phai node treeNode
	public boolean insertRight(BinaryTreeNode treeNode, Node value){
		if(treeNode==null) return false;
		BinaryTreeNode newNode=new BinaryTreeNode();
		treeNode.setRight(newNode);
		return true;
	}
	
	//Phuong thuc duyet cay theo thu tu truoc
	public Node[] preTravese(){
		Node[] result=null;
		preOrder(root,result);
		return result;
	}
	//Phuong thuc duyet cay con treeNode theo thu tu truoc va ket qua tra ve nam trong result
	public void preOrder(BinaryTreeNode treeNode,Node[] result){
		if(treeNode!=null){
			
		}
	}
	
	
}
