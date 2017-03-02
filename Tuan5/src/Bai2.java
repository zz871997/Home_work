//NHap va in ra ma tran m x n (m,n>3)
import java.util.Scanner;
public class Bai2 {
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
		
	//phuong thuc kiem tra phan tu nho nhat cua hang thu i
		public static int min(int[][] a, int i){
			int nhonhat=a[i][0];
			for(int j=0;j<a[i].length;j++){
				if(nhonhat>a[i][j]) nhonhat=a[i][j];			
			}
			return nhonhat;
		}
		
	//Phuong thuc tim phan tu lon nhat cua cot thu j
		public static int max(int[][] a,int j){
			int lonnhat=a[0][j];
			for(int i=0;i<a.length;i++){
				if(lonnhat<a[i][j]) lonnhat=a[i][j];
			}
			return lonnhat;
		}
	
	//Phuong thuc tim diem yen ngua (la diem nho nhat trong hang va lon nhat trong cot)
		public static void Diem(int[][] a){
			int dem=0;
			for (int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					if(min(a,i)==max(a,j)) {
						System.out.println("Phan tu yen ngua la "+min(a,i)+" o hang "+i+" va cot"+j);
						dem++;
						}
				}
			}
			if(dem==0) System.out.println("Mang khong co phan tu yen ngua nao");
		}
		
	//Phuong thuc main
		public static void main(String[] args) {
			Scanner scan1=new Scanner(System.in);
			int m=scan1.nextInt();
			Scanner scan2=new Scanner(System.in);
			int n=scan2.nextInt();
			int[][] a=new int[m][n];
			inputMatrix(a);
			outputMatrix(a);
			
			System.out.print("Phan tu nho nhat cua cac hang la:");
			for(int i=0;i<m;i++){
				System.out.print(" "+min(a,i));
			}
			System.out.println();
			
			System.out.print("Phan tu lon nhat cua cac cot la:");
			for(int j=0;j<n;j++){
					System.out.print("  "+max(a,j));
				}
			System.out.println();
				
			Diem(a);
			
			
		}
}
