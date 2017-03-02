//Thiet lap cac phuong thuc cua danh sach lien ket doi

package Double_Link_List;
import java.util.Scanner;
public class Method {
	
	//Khoi tao
	public static void inIt(DList L){
		L.Head=null;
		L.Tail=null;
	}
	
	//Kiem tra rong
	public static boolean IsEmpty(DList L){
		if(L.Head==null) return true;
		else return false;
	}
	
	//Tao 1 nut chua thong tin
	public static Node Make_Node(int x){
		Node p=new Node();
		p.data=x;
		p.Left=null;
		p.Right=null;
		return p;
	}
	
	//Do dai danh sach
	public static  int Lenght(DList L){
		Node ph=L.Head;     
		Node pt=L.Tail;		
		int i=0;          
		if(ph!=null) i=1;
		while(ph!=null){
			if(ph==pt) break;
			ph=ph.Right;    
			i++;
			/*if(ph==pt) break;
			pt=pt.Left;
			i++;   */         
		}
		return i;
	}
	
	//Chen phan tu vao v tri dau tien
	public static  void Insert_First(DList L,int x){
		Node p;
		p=Make_Node(x);
		if(IsEmpty(L)) {   
			L.Head=p;
			L.Tail=p;
		}
		else{
			p.Right=L.Head;
			L.Head.Left=p;
			L.Head=p;
		}
	}
	
	//Chen phan tu vao cuoi danh sach
	public static  void Insert_Last(DList L,int x){
		Node p;
		p=Make_Node(x);
		if(IsEmpty(L)) {   
			L.Head=p;
			L.Tail=p;
		}
		else{
			L.Tail.Right=p;   
			p.Left=L.Tail;
			L.Tail=p;
		}
	}
	
	//Chen xphan tu vao vi tri bat ki k
	public static void Insert_k(DList L,int x, int k){
		Node ph=L.Head, pt, r;
		int i=1, l=Lenght(L);
		if((k<1)||(k>l+1)) System.out.println("Vi tri khong hop le");
		else{
			r=Make_Node(x);                   
			if(k==1) Insert_First(L,x);       
			else if(k==l+1) Insert_Last(L,x);  
			else{
				while((ph!=null)&&(i!=k-1)){  //Duyet den phan tu k-1
					i++;
					ph=ph.Right;
				}
				pt=ph.Right;            //Xac dinh vi tri k
				r.Right=pt;             
				r.Left=ph;
				ph.Right=r;
				pt.Left=r;
			}	
		}
	}
	
	//Xoa phan tu dau/cuoi danh sach
	   // Xoa dau
	public static void Del_First(DList L){
		if(!IsEmpty(L)){
			L.Head=L.Head.Right; 
		}
	}
	
	   // Xoa cuoi
	public static void Del_Last(DList L){
		if(!IsEmpty(L)){     
			L.Tail=L.Tail.Left;
			L.Tail.Right=null;
		}
	}
	
	//Xoa phan tu o vi tri k
	public static void Del_k (DList L,int k){
		Node ph=L.Head, pt;
		int i=1,l=Lenght(L);
		if((k<1)||(k>l)) System.out.println("Vi tri khong hop le");
		else{
			if(k==1) Del_First(L);        
			else if(k==l) Del_Last(L);    
			else{
				while((ph!=null)&&(i!=k-1)){
					i++;
					ph=ph.Right;
				}
				pt=ph.Right.Right;      //Xac dinh vi tri k+1
				ph.Right=pt;
				pt.Left=ph;
			}
		}
	}
	
	//Tim kiem phan tu x co trong danh sach khong?
	public static int Search(DList L,int x){
		Node p=L.Head;
		int i=1;
		while((p!=null)&&(p.data!=x)){      //Duyet cho toi khi het danh sach hoac tim thay x
			p=p.Right;
			i++;
		}
		if(p!=null) return i;      //Tra ve vi tri tim thay
		else return 0;             //Khong tim thay
	}
	
	
	//Cac phuong thuc phu: Nhap va in danh sach
	//Nhap danh sach-----Viec nhao ket thuc khi nhap vao so 0
	public static void Input(DList L){
		Scanner scan=new Scanner(System.in);
		int i=0;
		int x;
		do{
			i++;
			System.out.println("Nhap phan tu thu: "+i);
			x=scan.nextInt();
			if(x!=0) Insert_k(L,x,Lenght(L)+1);
		}while(x!=0);    //Nhap ket thuc khi nhap vao 0
	}
	
	//In danh sach
	public static void PrintList(DList L){
		Node p=L.Head;
		while(p!=L.Tail.Right){
			System.out.print(p.data+" -><- ");
			p=p.Right;
		}
		System.out.println("null");
	}
	
	
	//Chuong trinh DEMO
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		DList L=new DList();
		inIt(L);
		Input(L);
		PrintList(L);
		
		int check;
		System.out.println("Hay chon phuong thuc voi danh sach lien ket");
		System.out.println("1. Kiem tra danh sach rong");
		System.out.println("2. Dua ra do dai danh sach");
		System.out.println("3. Chen 1 phan tu vao vi tri k trong danh sach");
		System.out.println("4. Xoa phan tu o vi tri k trong danh sach");
		System.out.println("5. Tim kiem phan tu");
		System.out.println("6. Thoat");
		
		do{
			System.out.println("Ban chon: ");
			check=scan1.nextInt();
			switch(check){
			case 1:{
				if(IsEmpty(L)) System.out.println("List is empty!!!");
				else System.out.println("List isn't empty!!!");
				break;
			}
			case 2:{
				System.out.println("Do dai danh sach la: "+Lenght(L));
				break;
			}
			case 3:{
				System.out.println("Nhap phan tu can chen vao danh sach: ");
				int x=scan1.nextInt();
				System.out.println("Nhap vi tri can chen: ");
				int k=scan1.nextInt();
				Insert_k(L,x,k);
				System.out.println("Danh sach sau khi chen: ");
				PrintList(L);
				break;
			}
			case 4:{
				System.out.println("Nhap vi tri can xoa: ");
				int k=scan1.nextInt();
				int x;
				Del_k(L,k);
				System.out.println("Danh sach sau khi xoa:");
				PrintList(L);
				break;
			}
			case 5:{
				System.out.println("Nhap phan tu can tim: ");
				int x=scan1.nextInt();
				int k=Search(L,x);
				if(k==0) System.out.println("Khong tim thay phan tu can tim");
				else System.out.println("Tim thay "+x+" tai vi tri "+k);
				break;
			}
			case 6: break;	
			}
		}while(check!=6);
	}
}
