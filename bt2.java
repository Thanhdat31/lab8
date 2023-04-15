package lab8;

import java.util.Scanner;

public class bt2 {
	    private String tensp;
	    private int gia;
	    private int soluong;

	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Tên sản phẩm: ");
	        tensp = scanner.nextLine();
	        System.out.print("Giá sản phẩm: ");
	        gia = scanner.nextInt();
	        System.out.print("Số lượng sản phẩm: ");
	        soluong = scanner.nextInt();
	    }

	    public void xuat() {
	        System.out.println("Tên sản phẩm: " + tensp);
	        System.out.println("Giá sản phẩm: " + gia);
	        System.out.println("Số lượng sản phẩm: " + soluong);
	    }
	
	public class Main {
	    public static void main(String[] args) {
	       
	        bt2 sp1 = new bt2();
	        bt2 sp2 = new bt2();

	        
	        System.out.println("Nhập thông tin sản phẩm thứ nhất:");
	        sp1.nhap();
	        System.out.println("Nhập thông tin sản phẩm thứ hai:");
	        sp2.nhap();

	      
	        System.out.println("Thông tin sản phẩm thứ nhất:");
	        sp1.xuat();
	        System.out.println("Thông tin sản phẩm thứ hai:");
	        sp2.xuat();
	    }
	}

}
