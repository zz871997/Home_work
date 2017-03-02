//Thiet lap cac phuong thuc cua danh sach lien ket don

package Single_Link_List;
import java.util.Scanner;
public class LinkeList {
	Node head;
	public LinkeList(){
		this.head=null;
	}
	
	//Kiem tra danh sach rong
	public boolean isEmpty(){
		if(head==null) return true;
		else return false;
	}
	
	//Chen phan tu vao dau
	public void Insert_Head(int x){
		if(isEmpty())
            head=new Node(x,null);
        else
            head=new Node(x,head);
	}
	
	//Chen phan tu vao cuoi
	public void Insert_Tail(int x){
		Node temp;
		if(isEmpty()) head=new Node(x,null);
		else {
			temp=head;
			while (temp.next!=null) temp=temp.next;
			temp.next=new Node(x,null);
		}		
	}
	
	//Chen phan tu vao giua
	public void Insert(int x, int position){
		Node temp;
		int count;
		if(isEmpty()){
			if(position==0) head=new Node(x,null);
			else return;
 		}
		else{
			if(position==0) Insert_Head(x);
			else if(position==1) head.next=new Node(x,head.next);
			else {
				count=0;
				temp=head;   
				while(temp!=null){    //Vong lap xac dinh vi tri cua phan tu truoc phan tu can chen
					temp=temp.next;
					count++;
					if(count+1==position) break;
				}
				if(count+1!=position) return;
				else{
					Node p=new Node(x,temp.next);
					temp.next=p;
				}
			}
		}
	}
	
	//Xoa phan tu dau
	 public void Delete_Head(){
		 if(!isEmpty()){
			 if(head.next==null) head=null;
			 else head=head.next;
		 }
	 }
	 
	 //Xoa phan tu cuoi
	 public void Delete_Tail(){
		 Node temp;
		 if(!isEmpty()){
			 if(head.next==null) head=null;
			 else{
				 temp=head;
				 while(temp.next.next!=null) temp=temp.next;
				 temp.next=null;
			 }
		 }
	 }
	 
	 //Dem so phan tu 
	 public int Length(){
		 Node p=head;
		 int i=0;
		 while(p!=null){
			 if(p==null) break;
			 p=p.next;
			 i++;
		 }
		return i;
	 }
	 
	 //Xoa phan tu o giua
	 public void Delete(int position){
		 int count=1;
		 Node temp;
		 if(isEmpty()) return;
		 
		 else if(position<1) return;
		 else if(position==1) Delete_Head();
		 else if(position==Length()) Delete_Tail();
		 else {
			 temp=head;
			 while(temp.next.next!=null){
				 count++;
				 if(count==position) break;
				 temp=temp.next;
			 }
			 if(count!=position) return;
			 else temp.next=temp.next.next;
		 }
		 //else if(position==1) Delete_Head();
		 
		 
		 /*else{
			 if(position<1) return;
			 else{
				 if(position==1) head=head.next;
				 else{
					 temp=head;
					 while(temp.next.next!=null){
						 count++;
						 if(count==position) break;
						 temp=temp.next;
					 }
					 if(count!=position) return;
					 else temp.next=temp.next.next;
				 }
			 }
		 }*/
	 }
	 
	 //Tim mot phan tu x co trong danh sach khong?
	 public void Find(){
		 int count=0;
		 int x,check=0;
		 Node temp;
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Nhap phan tu can tim kiem: ");
		 x=scan.nextInt();
		 if(isEmpty()) System.out.println("List is empty!!!");  
		 else{
			 temp=head;
			 while(temp!=null){
				 count++;
				 if(temp.data==x){
					 check=1;
					 break;
				 }	 
				 temp=temp.next;
			 }
			 if(check==1) System.out.println("Phan tu can tim co trong danh sach, o vi tri "+count);
			 else System.out.println("Phan tu can tim khong co trong danh sach");
			//return -1;
			// System.out.println("Phan tu can tim khong co trong danh sach");
		 }
	 }
	 
	 //In ra danh sach
	 public void PrintList(){
		 Node temp=head;
		 while(temp!=null){
			 System.out.print(temp.data+" -> ");
			 temp=temp.next;
		 }
		 System.out.println("null");
	 }
}
