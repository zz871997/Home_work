package ET;
import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.String;
public class ET {
	/*Tao phuong thuc CreatSubTree co nhiem vu tao cay bieu thuc co 3 node.Node goc la
	 * toan tu Pop ra tu OperatorStack, 2 node la la ca toan hang Pop tu NodeStack. 
	 * Cuoi cung dua node goc vao tro lai NodeStack
	 */
	//Stack<BinaryTreeNode> opStack=new Stack<BinaryTreeNode>();    //Chua ca toan tu
	//Stack<BinaryTreeNode> nodeStack=new Stack<BinaryTreeNode>();  //Chua cac node tao nen cau truc cay
	public void CreatSubTree(Stack<BinaryTreeNode> opStack,Stack<BinaryTreeNode> nodeStack){
		//Stack<BinaryTreeNode> opStack=new Stack<BinaryTreeNode>();    //Chua ca toan tu
		//Stack<BinaryTreeNode> nodeStack=new Stack<BinaryTreeNode>();  //Chua cac node tao nen cau truc cay
		BinaryTreeNode node=opStack.pop();
		node.right=nodeStack.pop();
		node.left=nodeStack.pop();
		nodeStack.push(node);
		
	}
	
	//Ham kiem tra co la toan tu khong?
	public boolean isOperator(char s){
		if(s=='+'||s=='-'||s=='*'||s=='/') return true;
		else return false;
	}
	//Ham kiem tra co la toan hang khong?
	public boolean isOperand(char s){
		if((s>='a'&&s<='z')||(s>='0'&&s<='9')) return true;
		else return false;
	}
	
	//Do uu tien
	public int GetPriority(char s){
		if(isOperator(s)==true){
			if(s=='+'||s=='-') return 4;
			else return 5;
		}
		else return -1;
	}
	
	public BinaryTreeNode Infix2ExpressionTree(String infixExpression){
		ArrayList prefix=new ArrayList();
		Stack<BinaryTreeNode> operatorStack=new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> nodeStack=new Stack<BinaryTreeNode>();
		String FormatExpression=infixExpression;
		for(int i=0;i<infixExpression.length();i++){
			char s=infixExpression.charAt(i);
			if(isOperand(s)==true) nodeStack.push(new BinaryTreeNode(s));
			else if(s=='(') operatorStack.push(new BinaryTreeNode(s));
			else if(s==')') {
				while (operatorStack.peek().Value!='(') CreatSubTree(operatorStack,nodeStack);
				operatorStack.pop();
			}
			else if(isOperator(s)==true){
				while((operatorStack.isEmpty()==false) && GetPriority(operatorStack.peek().Value)>=GetPriority(s) ) {
					CreatSubTree(operatorStack,nodeStack);
				}
				operatorStack.push(new BinaryTreeNode(s));
			}
		}
		while(operatorStack.isEmpty()==false) CreatSubTree(operatorStack,nodeStack);
		return nodeStack.peek();
	}
	
	//In bieu thuc dang trung to
	public void printInorder(BinaryTreeNode root){
		if(root==null) return;
		printInorder(root.left);
		System.out.print(" "+root.Value);
		printInorder(root.right);
	}
	
	//In bieu thuc dang tien to
	public void printPreorder(BinaryTreeNode root){
		if(root==null) return;
		System.out.print(" "+root.Value);
		printPreorder(root.left);
		printPreorder(root.right);
	}
	
	//In bieu thuc dang hau to
	public void printPostorder(BinaryTreeNode root){
		if(root==null) return;
		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(" "+root.Value);
	}
	

	//Ham kiem tra tinh hop le cua bieu thuc
	//Ham kiem tra dau (
	public int check1(Stack a,String str){
		for(int i=0;i<str.length();i++){
			char s=str.charAt(i);
			if(s=='(') a.push(s);
			else if(s==')'){
				if(a.isEmpty()==false) {
					if((char)a.pop()!='(') return 0;
				}
				else a.push(s);
			}
		}
		if(a.isEmpty()==true) return 1;
		else return 0;
	}
	//Ham kiem tra neu bieu thuc bat dau bang *,/ hoac ket thuc bang *, / ,+,- thi khong hop le
	//Va khong ton tai cac cap +*,+/,-*,-/,(*,(/,  **,*/,*),//,/*,/)
	public int check2(String str){
		char[] c=new char[str.length()];
		for(int i=0;i<str.length();i++){
			char s=str.charAt(i);	
			c[i]=s;
		}
		if(c[0]=='*'||c[0]=='/'||c[c.length-1]=='*'||c[c.length-1]=='/'||c[c.length-1]=='+'||c[c.length-1]=='-') return 0;
		
		for(int i=0;i<str.length();i++){
			if(c[i]=='+'||c[i]=='/'||c[i]=='('){
				if(c[i+1]=='*'||c[i+1]=='/') return 0;
			}
			if(c[i]=='*'||c[i]=='/'){
				if(c[i+1]=='*'||c[i+1]=='/'||c[i+1]==')') return 0;
			}
		}
		return 1;
	}
	
}
