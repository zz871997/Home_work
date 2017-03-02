

import java.util.Scanner;
public class Bai1 {
	//phuong thuc in ra 20 dau *
	void printStars(){
		for(int i=1;i<=20;i++){
			System.out.println("*");
		}
	}
	
	//phuong thuc nhap vao 1 ma tran
	public static void inputMatrix(int[][] a){
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=scan.nextInt();
			}
		}
	}
	
	//phuong thuc in ra ma tran dung dinh dang
	public static void outputMatrix(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}
	
	
	
	//phuong thuc kiem tra ma tran cheo(la ma tran cuong va cac phan tu khong nam tren duong cheo chinh bang 0
	/* De kiem tra ma tran cheo, truoc het ta kiem tra co la ma tran vuong khong?*/
	/* Neu la ma tran vuong ta duyet cac phan tu tren duong cheo chinh (tam giac tren):
	 * 			for(int i=0;j<a.length;i++)
	 * 				for (int j=0;j<i;j++)    //Day la tam giac tren
	 * Duyet cac phan tu tam giac duoi:
	 * 			for(int i=0;j<a.length;i++)
	 * 				for (int j=0;j>i;j++)    //Day la tam giac duoi
	 * Va sau do kiem tra xem cac phan tu tam giac tren va duoi co bang 0 hay khong
	 */
	
	
	//Phuong thuc main
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		int m=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		int n=scan2.nextInt();
		int[][] a=new int[m][n];
		inputMatrix(a);
		outputMatrix(a);	
	}
	
	
}
