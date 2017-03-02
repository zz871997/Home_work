/*Dinh nghia dinh tieu de cua danh sach lien ket don
 *  Dinh tieu de cua danh sach lien ket don la doi tuong luu tru cac thong tin
 *  	+ Chi den nut thuc su dau tien cua danh sach
 *      + Chi den  nut cuoi cung cua danh sach
 *      + Luu tru so luong nu thuc su trong danh sach
 */

package List;

public class HeaderSimpleNode {
	private int nodeNumber;
	private SimpleNode header;
	private SimpleNode tailer;
	
	//Phuong thuc khoi dung
	public HeaderSimpleNode(){
		nodeNumber=0;
		header=null;
		tailer=null;
	}
	
	//Phuong thuc truy nhap thuoc tinh nodeNumber
	public int getNodeNumber(){
		return nodeNumber;
	}
	public void setNodeNumber(int nodeNumber){
		this.nodeNumber=nodeNumber;
	}
	
	//Phuong thuc truy nhao thuoc tinh header
	public SimpleNode getHeader(){
		return header;
	}
	public void setHeader(SimpleNode header){
		this.header=header;
	}
	
	//Phuong thuc truy nhap thuoc tinh tailer
	public SimpleNode getTailer(){
		return tailer;
	}
	public void setTailer(SimpleNode tailer){
		this.tailer=tailer;
	}
}
