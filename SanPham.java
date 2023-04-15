import java.util.Scanner;

public class SanPham {
	    private String tenSp;
	    private double donGia;
	    private double giamGia;

	    public double getThueNhapKhau() {
	        return donGia * 0.1;
	    }
	    public SanPham(String tenSp, double donGia, double giamGia) {
	    	this.donGia = donGia;
	    	this.giamGia = giamGia;
	    	this.tenSp = tenSp;
	    }
	    public SanPham() {
			// TODO Auto-generated constructor stub
		}
		public String getTenSp() {
			return tenSp;
		}

		public void setTenSp(String tenSp) {
			this.tenSp = tenSp;
		}

		public double getDonGia() {
			return donGia;
		}

		public void setDonGia(double donGia) {
			this.donGia = donGia;
		}

		public double getGiamGia() {
			return giamGia;
		}

		public void setGiamGia(double giamGia) {
			this.giamGia = giamGia;
		}
	    
	     public void nhap() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập tên sản phẩm: ");
	        tenSp = sc.nextLine();

	        System.out.print("Nhập đơn giá: ");
	        donGia = sc.nextDouble();

	        System.out.print("Nhập giảm giá: ");
	        giamGia = sc.nextDouble();
	    }
         public void xuat() {
	        System.out.println("Tên sản phẩm: " + this.tenSp);
	        System.out.println("Đơn giá: " + this,donGia);
	        System.out.println("Giảm giá: " + this.giamGia);
	        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
	   
	    }
         public static void main(String[] args) {
			SanPham sp = new SanPham();
			sp.nhap();
			sp.xuat();
		}		
	}


