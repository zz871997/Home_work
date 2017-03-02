package ET;
import java.util.*;
public class Demo {
	public static void main(String[] args) {
		String input="3+5)*2-7+";
		ET et=new ET();
		Stack a=new Stack();
		
		if(et.check2(input)==1&& et.check1(a, input)==1) {
			System.out.println("Bieu thuc hop le");
			
			BinaryTreeNode root;
			root=et.Infix2ExpressionTree(input);
			System.out.print("Dang tien to: ");
			et.printPreorder(root);
			System.out.println();
			
			System.out.print("Dang trung to: ");
			et.printInorder(root);
			System.out.println();
			
			System.out.print("Dang hau to: ");
			et.printPostorder(root);
			
		}
		else System.out.println("Bieu thuc khong hop le");
		
	}
}
