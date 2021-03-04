package vidu;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		SPP sp1 = new SPP("laptop", 99, 10);
		SPP sp2 = new SPP("tivi", 90);
		sp1.xuat();
		sp2.xuat();
	}
}
	class SPP{
		public String tenSP;
		public double dongia, giamgia;
		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap ten san pham:");
			tenSP = scanner.next();
			System.out.println("Nhap gia san pham:");
			dongia = scanner.nextDouble();
			System.out.println("Nhap giam gia:");
			giamgia = scanner.nextDouble();
		}
		double thue() {
			return (dongia/10);
		}
		void xuat() {
			System.out.println("San Pham:" + tenSP);
			System.out.println("Gia:" + dongia);
			System.out.println("Giam gia:" + giamgia);
			System.out.println("Thue nhap khau:" + thue());
		}
		public SPP(String tenSP, double dongia, double giamgia) {
			this.tenSP = tenSP;
			this.dongia = dongia;
			this.giamgia = giamgia;
		}
		public SPP(String tenSP, double dongia) {
			this(tenSP,dongia,0);
		}
	}