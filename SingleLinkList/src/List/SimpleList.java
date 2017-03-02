/*Tien hanh cai dat danh sach lien ket don
 *   + Them mot phan tu vao vi tri bat ki: Neu vi tri nho hon 0 thi them vao dau, lon hon do dai danh
 *       sach thi them vao cuoi danh sach. Truong hop con lai chen binh thuong
 *   + Xoa phan tu o vi tri bat ki: Chi loai bo khi vi tri chi ra nam trong pham vi do dai danh sach
 *       Phuong thuc tra ve nut bi laoi bo
 *   + Tra ve toan bo danh sach: tra ve toan bo cac phan tu co trong danh sach. Gia tri tra ve la mot mang
 *       cac phan tu co kieu Node.
 *   +Tim kien phan tu	
 */

package List;

public class SimpleList {
	private HeaderSimpleNode myList;
	//Phuong thuc khoi dung myList
	public SimpleList(){
		myList=new HeaderSimpleNode();
	}
	
	//Phuong thuc them phan tu vao vi tri position
	public void insert(Node value, int position){
		//Tao mot nut moi
		SimpleNode newNode=new SimpleNode(value);
		
		//Chen vao dau
		if(position<=0) {
			newNode.setNext(myList.getHeader());
			myList.setHeader(newNode);
			if(myList.getNodeNumber() ==0)     //Danh sach rong
				myList.setTailer(newNode);
		}
		//Chen vao cuoi
		else if(position>=myList.getNodeNumber()){
			if(myList.getNodeNumber()==0){     //Danh sach rong
				myList.setHeader(newNode);
				myList.setTailer(newNode);
			}
			else{     //Danh sach khong rong   
				myList.getTailer().setNext(newNode);
				myList.setTailer(newNode);
			}
		}
		//Chen vao giua
		else{
			int index=0;
			SimpleNode prev=null;
			SimpleNode current=myList.getHeader();
			while(index<position){
				index++;
				prev=current;
				current=current.getNext();
			}
			newNode.setNext(current);
			prev.setNext(newNode);
		}
	}
}
