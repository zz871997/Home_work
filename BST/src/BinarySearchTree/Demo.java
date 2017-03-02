package BinarySearchTree;
import java.util.Scanner;
import java.util.Stack;
public class Demo {
	public static void main(String[] args) {
		BST bst=new BST();
		Node root,p1,p2,p3,p4,p5;
		root=bst.make_node(7);
		p1=bst.insertnode(root, 5);
		p2=bst.insertnode(root, 9);
		p3=bst.insertnode(root, 2);
		p4=bst.insertnode(root, 8);
		p5=bst.insertnode(root, 12);
		
		System.out.println("Duyet cay: ");
		bst.LNR(root);
		System.out.println();
		
		if(bst.bstChecker(root)==true) System.out.println("La cay nhi phan tim kiem");
		else System.out.println("Khong ohai cay nhi phan tim kiem");
		
		if(bst.isAVL(root)==true) System.out.println("La cay nhi phan tim kiem can bang");
		else System.out.println("Khong phai cay nhi phan tim kiem can bang");
		
		Node p=bst.search(root, 8);
		if(p==null) System.out.println("Khong tim thay");
		else System.out.println("tim thay, voi gia tri cua p la "+p.data);
		
		bst.delete(root,7);
		bst.LNR(root);
	}
}
