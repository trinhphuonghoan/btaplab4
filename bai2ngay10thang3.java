package vidu;

import java.util.Scanner;

public class bai2ngay10thang3 {
	public static void main(String[] args) {
		thoigian time = new thoigian();
		time.nhap();
		time.xuat();
	}
}
	class thoigian {
		private int gio = 0, phut = 0, giay = 0;
		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap gio:");
			gio = scanner.nextInt();
			System.out.println("Nhap phut:");
			phut = scanner.nextInt();
			System.out.println("Nhap giay:");
			giay = scanner.nextInt();
		}
		
		void xuat() {
			System.out.println("Bay gio la:" +(gio + "gio" + "," + phut + "phut" + "," + giay + "giay"));
			
		}
	}