package vidu;

import java.util.Scanner;

public class bai4ngay10thang3 {
	public static void main(String[] args) {
		student sv1 = new student();
		student sv2 = new student();
		sv1.nhap();
		sv2.nhap();
		sv1.in();
		sv2.in();
	}
}
	class student{
		String hoTen; String ngaysinh;String gioitinh;String lop;
	    double diemToan, diemLy, diemHoa;
	    void nhap() {
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Nhap ho va ten:");
	    	hoTen = scanner.next();
	    	System.out.println("Nhap ngay sinh:");
	    	ngaysinh = scanner.next();
	    	System.out.println("Nhap gioi tinh:");
	    	gioitinh = scanner.next();
	    	System.out.println("Nhap lop hoc:");
	    	lop = scanner.next();
	    	System.out.println("Nhap diem toan:");
	    	diemToan = scanner.nextDouble();
	    	System.out.println("Nhap diem ly:");
	    	diemLy = scanner.nextDouble();
	    	System.out.println("Nhap diem Hoa:");
	    	diemHoa = scanner.nextDouble();
	    }
	    double Diemtrungbinh(double diemToan, double diemLy, double diemHoa) {
	    	return(diemToan + diemLy + diemHoa)/3;
	    }
	    void in() {
	    	System.out.println("Ho va Ten:" + hoTen);
	    	System.out.println("Ngay sinh:" + ngaysinh);
	    	System.out.println("Gioi tinh:" + gioitinh);
	    	System.out.println("Lop:" + lop);
	    	System.out.println("Diem Toan:" + diemToan);
	    	System.out.println("Diem Ly:" + diemLy);
	    	System.out.println("Diem Hoa:" + diemHoa);
	    	System.out.println("Diem trung binh:" + Diemtrungbinh(diemToan, diemLy, diemHoa));
	    }
	    void sapxep() {
	    	int n=0;
	    	student[] a = new student[n];
	    	for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i].Diemtrungbinh(n, i, i)<a[j].Diemtrungbinh(n, i, i));
					{
						student temp =  new student();
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("Danh sach sau khi sap xep la:");
			for(int i=0;i<n;i++)
			{
				a[i].in();
				System.out.println("Diem TB la: "+a[i].Diemtrungbinh(n, i, i));
			}
		}
	}