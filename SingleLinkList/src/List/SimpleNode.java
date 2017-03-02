/*Mot nut trong danh sach lien ket don duoc cai dat trong chuong trinh
 * Mot nut cua danh sach lien ket don bao gom:
 * 		+ Gia tri cua nut, co gia tri la mot doi tuong kieu
 * 		+ Nut tiep theo cua nut do
 */

package List;

public class SimpleNode {
	private Node value;      //Gia tri cua mot node la mot doi tuong kieu Node
	private SimpleNode next; //Node tiep theo cua danh sach lien ket 
	
	//Cac phuong thuc khoi dung
	public SimpleNode(){
		value=new Node();
		next=null;
	}
	public SimpleNode(Node value){
			this.value=value;
			next=null;
	}
	
	//Phuong thuc truy nhap thuoc tinh Value
	public Node getValue(){
		return value;
	}
	public void setValue(Node value){
		this.value=value;
	}
	
	//Phuong thuc truy nhap thuoc tinh Next
	public SimpleNode getNext(){
		return next;
	}
	public void setNext(SimpleNode next){
		this.next=next;
	}
}
