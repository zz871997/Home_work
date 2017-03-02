//Dinh nghia mot nut

package List;

public class Node {
	private int value;
	//Cac phuong thuc khoi dung
	public Node(){
		value=0;
	}
	public Node(int value){
		this.value=value;
	}
	
	//Phuong thuc truy nhap thuoc tinh value
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value=value;
	}
}
