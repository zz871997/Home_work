//Nhap 1 danh sach ho ten sinh vien 1 lop hoc vao 1 mang n phan tu.Sap xep
//theo thu tu a,b,c roi dung thuat tim kiem nhi phan , tim kiem chinh xac va in ra man hingh thu tu
//sinh vien

package vidu;
import java.util.Scanner;
public class Students {
	private String[] name;
	private int numberStudent;
	public void Input(){
			Scanner scan=new Scanner(System.in);
			System.out.println("Nhap so sinh vien: ");
			numberStudent=scan.nextInt();
			scan.nextLine();
			System.out.println("Nhap ten sinh vien: ");
			name=new String[numberStudent];
			for(int i=0;i<numberStudent;i++){
				System.out.println("Sinh vien thu "+(i+1));
				name[i]=scan.nextLine();
			}
	}
	
	public void showList(){
		for(int i=0;i<numberStudent;i++){
			System.out.println((i+1)+". "+name[i]);
		}
	}
	
	public void Sort(){
		for(int i=numberStudent;i>0;i--){
			for (int j=0;j<i-1;j++){
				if(name[j].compareTo(name[j+1])>0){
					String temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
				}
			}
		}
	}
	//Phuong thuc tim kiem nhi phan
	public int BS(String hoten){
		int start=0;
		int end=numberStudent-1;
		int mid=-1;
		while(start<=end){
			mid=(start+end)/2;
			if(name[mid].equals(hoten)){
				return mid+1;
			}
			else if(hoten.compareTo(name[mid])>0) start=mid+1;
			else end=mid-1;
		}
		return -1;

        /*int d = 0, c = numberStudent - 1, g = -1;
        while (d <= c) {
            g = (d + c) / 2;
            if (name[g].equals(hoten)) {
                return g + 1;
            }
            if (hoten.compareTo(name[g]) > 0) {
                c = g - 1;
            } else {
                d = g + 1;
            }
        }
        return -1;*/
	}
	
	public static void main(String[] args) {
		Students st1=new Students();
		st1.Input();
		System.out.println("Danh sach sinh vien vua nhap la: ");
		st1.showList();
		st1.Sort();
		System.out.println("Danh sach sinh vien sau khi sap xep lai la: ");
		st1.showList();
		System.out.println("Nhap ten sinh vien can tim");
		Scanner scan1=new Scanner(System.in);
		String hoten=scan1.nextLine();
		int k=st1.BS(hoten);
		if(k!=-1){
			System.out.println("So thu tu cua sinh vien trong danh sach la:");
			System.out.println(k);
		}
		else System.out.println("Sinh vien khong co trong danh sach");
	}
		
	}

