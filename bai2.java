package vidu;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		SP sp1 = new SP();
		SP sp2 = new SP();
		sp1.nhap();
		sp2.nhap();
		sp1.xuat();
		sp2.xuat();
	}
}
class SP{
	String tenSP;
	double dongia, giamgia;
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
		System.out.println("San pham:" + tenSP);
		System.out.println("Gia:" + dongia);
		System.out.println("Giam gia:" + giamgia);
		System.out.println("Thue NK:" + thue());
	}
}