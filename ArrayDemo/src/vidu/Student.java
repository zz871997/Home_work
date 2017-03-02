/*So sinh vien nhap tu ban phim. Khai bao 1 mang gom danh sach ho ten sinh vien, ten tung sinh vien nhap
 *  tu ban phim. Sau khi nhap xong, chuong trinh hoi ten sinh vien muon tim kiem. Tim va in ra co hay khong
 */

package vidu;

import java.util.Scanner;
public class Student{
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int i;		
		boolean kq=false;
		
		System.out.println("Nhap so sinh vien");
		int n=in.nextInt();
		in.nextLine();
		String a[] =new String[n];
		for(i=0;i<n;i++){
			System.out.println("Nhap sinh vien thu "+i);
			a[i]=in.nextLine();
		}
		
		System.out.println("Nhap sinh vien can tim kiem");
		String b=in.nextLine();
		for(i=0;i<n;i++){
			if(b.equals(a[i])){
				System.out.println("Co trong danh sach");
				kq=true;
			}
		}
		if(kq==false) System.out.println("Khong co trong danh sach");
	}
}