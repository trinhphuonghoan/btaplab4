package vidu;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		SSP sp1 = new SSP("laptop", 99, 10);
		SSP sp2 = new SSP("tivi", 90);
		sp1.xuat();
		sp2.xuat();
	}
}
	class SSP{
		private String tenSP;
		private double dongia, giamgia;
		public String getTenSP() {
			return this.tenSP;
		}
		public void setTenSP(String tenSP) {
			this.tenSP = tenSP;
		}
		public double getDongia() {
			return this.dongia;
		}
		public void setDongia() {
			this.dongia = dongia;
		}
		public double getGiamgia() {
			return this.giamgia;
		}
		public void setGiamgia() {
			this.giamgia = giamgia;
		}
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
		public SSP(String tenSP, double dongia, double giamgia) {
			this.tenSP = tenSP;
			this.dongia = dongia;
			this.giamgia = giamgia;
		}
		public SSP(String tenSP, double dongia) {
			this(tenSP,dongia,0);
		}
	}