package Single_link_list;

public class Method {
	//Khoi tao danh sach lien ket don
	public static void initSLL(SLL list){
		list.pHead=list.pTail=null;
	}
	
	//Kiem tra danh sach lien ket don rong
	public boolean isSLLEmpty(SLL list){
		if(!list.pHead) {return true;}
		return false;
	}
	
	//In danh sach ra man hinh
	public static void viewSLL(SLL list){
		
	}
}
