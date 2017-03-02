//Nhap day so nguyen n phan tu.Sap xep tang dan

package vidu;
import java.util.Scanner;
public class BAi2 {
		//Phuong thuc main
	public static void main(String[] args) {
		int i,j;
		System.out.println("Nhap so phan tu ");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		int[] a=new int[n];
		for (i=0;i<n;i++){
			System.out.println("a["+i+"]= ");
			a[i]=scan.nextInt();
		}
		System.out.println("MAng vua nhap la:  ");
		for(i=0;i<n;i++){
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		int tg;
		for(i=0;i<n-1;i++){
			for (j=n-1;j>i;j--){
				if(a[j]<a[j-1]){
					tg=a[j];
					a[j]=a[j-1];
					a[j-1]=tg;
				}
			}
		}
		
		System.out.println("MAng dc sap xep la:");
		for(i=0;i<n;i++){
			System.out.print(a[i]+"  ");
		}
		
	}

}
