package vidu;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		SanPham sp = new SanPham();
		sp.nhap();
		sp.xuat();
	}
}
	class SanPham{
		String tenSP;
		double donGia, giamGia;
		void nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhap ten San Pham:");
			tenSP = scanner.next();
			System.out.println("Nhap don gia:");
			donGia = scanner.nextDouble();
			System.out.println("Nhap giam gia:");
			giamGia = scanner.nextDouble();
		}
		double thue() {
			return (donGia/10);
		}
		void xuat() {
			System.out.println("San Pham:" + tenSP);
			System.out.println("Gia:" + donGia);
			System.out.println("Giam Gia:" + giamGia);
			System.out.println("Thue nhap khau:" + thue());
		}
		
	}

