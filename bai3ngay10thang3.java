package vidu;

import java.util.Scanner;

public class bai3ngay10thang3 {
	public static void main(String[] args) {
		matran mt = new matran();
		mt.nhap();
		mt.xuat();
		System.out.println(mt.donvi());
		if(mt.donvi())
		{
			System.out.println("Ma tran tren ko la ma tran don vi!");
		}
		else
		{
			System.out.println("Ma tran tren la ma tran don vi!");
		}
	}
}
 	class matran{
 		private int i, j, n;
 	    private static int [][] A= new int [9][9];
 		void nhap() {
 			Scanner scanner = new Scanner(System.in);
 			do {
 				System.out.println("Nhap n:");
 				n = scanner.nextInt();
 			}while(n<0);
 			System.out.println("Nhap vao cac phan tu cua ma tran:");
 			for (i=0;i<n;i++) {
 				for(j=0;j<n;j++) {
 					System.out.println("A[" + i + "][" + j + "] = ");
 					A[i][j] = scanner.nextInt();
 				}
 			}
 		}
 		
 		void xuat() {
 			System.out.println("Ma tran vua nhap la:");
 			for(i=0; i<n; i++){
 	            for(j=0; j<n; j++){
 	                System.out.print(A[i][j] + " ");
 	            }
 	            System.out.println();
 	        }
 		}
 		boolean donvi() {
 			int i,j=0;
 			for(i=0;i<n;i++)
 			{
 				if(A[i][j]!=1)
 					return false;
 			}
 			for(i=0;i<n;i++)
 			{
 				for(j=0;j<n;j++)
 				{
 					if(i!=j && A[j][i]!=0)
 						return false;
 				}
 			}
 			return true;
 		}
 	}