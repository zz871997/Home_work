//Nhap vao cac phan tu cua 2 ma tran cung so hang va so cot. in 2 ma tran ra man hinh va tinh tong 2 ma tran

package vidu;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
	
		int [][] a=new int[n][m];
		int [][] b=new int[n][m];
		int [][] c=new int[n][m];
		int i,j;
		//NHap ma tran a
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.println("a["+i+"]["+j+"]= ");
				a[i][j]=scan.nextInt();
			}
		}
		System.out.println("MA tran a la: ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//NHap ma tran b
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.println("b["+i+"]["+j+"]= ");
				b[i][j]=scan.nextInt();
			}
		}
		System.out.println("MA tran b la: ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//Tinh tong 2 ma tran
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Tong 2 ma tran la: ");
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	
}