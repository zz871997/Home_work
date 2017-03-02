package BinaryTree;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTree tree=new BTree();
		Node root,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11;
		root=tree.make_node(8);

		p1=tree.InsertLeft(root,6);
		p2=tree.InsertRight(root,12);
		p3=tree.InsertLeft(p1, 3);
		p4=tree.InsertRight(p1, 7);
		p5=tree.InsertLeft(p2, 9);
		p6=tree.InsertRight(p2, 23);
		p7=tree.InsertLeft(p3, 1);
		p8=tree.InsertRight(p3, 4);
		p9=tree.InsertLeft(p6, 20);
		p10=tree.InsertRight(p7, 2);
		p11=tree.InsertRight(p8,5);
		
		//Node p7=tree.InsertRight(p6, 7);
		//Node p8=tree.InsertLeft(p7, 8);
		//Node p9=tree.InsertRight(p7,9);
		//Node p10=tree.InsertLeft(p1, 11);
		
		
		/*                1           ~~~~              root
		 *              /  \                            /  \
		 *             2    3                          p1   p2
		 *            / \   /                         / \   /
		 *           4   5 6                         p3 p4 p6
		 *              /   \                           /   \
		 *             10    7                         p5   p7
		 *                  / \                             / \
		 *                 8   9                          p8   p9
		 */
		
		
		System.out.println("Duyet truoc: ");
		tree.printPreorder(root);
		System.out.println();
		System.out.println("******************************");
		
		System.out.println("Duyet sau: ");
		tree.printPostorder(root);
		System.out.println();
		System.out.println("******************************");
		
		System.out.println("Duyet giua: ");
		tree.printInorder(root);
		System.out.println();
		System.out.println("******************************");
		
		System.out.println();
		//tree.getDataLeft(p4);
		
		System.out.println("So nut cua cay la: "+tree.countNodes(root));
		System.out.println("Chieu cao cua cay la: "+tree.height(root));
		
		System.out.println("Gia tri cua nut la sau nhat la: "+tree.maxLeaf(root).data);
		if(tree.bstChecker(root)==true) System.out.println("La cay nhi phan tim kiem");
		else System.out.println("khong phai");
		
		//System.out.println("To tien chung gan nhat cua p3 va p7 co gia tri la: "+
		//tree.LeastCommonAncestor(root, p3, p7).data);
	}
}
