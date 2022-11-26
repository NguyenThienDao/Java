import java.util.Arrays;
import java.util.TreeSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_TreeSet {

	Set<String> thungPhieuDuThuong = new TreeSet<String>();

	public RutThamTrungThuong_TreeSet() {
		
}public void themmasoduthuong(String giatri) {
	this.thungPhieuDuThuong.add(giatri);
	
}public boolean xoamasoduthuong(String giatri) {
	return this.thungPhieuDuThuong.remove(giatri);
	
}public void kiemtramsoduthuong(String giatri) {
    this.thungPhieuDuThuong.contains(giatri);
	if(this.thungPhieuDuThuong.contains(giatri)==true) {
		System.out.println("Phieu du thuong "+giatri+" nay co. ");
	}else if(this.thungPhieuDuThuong.contains(giatri)==false) {
		System.out.println("Phieu du thuong "+giatri+" nay khong co. ");
	}
	
}public void xoatatca() {
	this.thungPhieuDuThuong.clear();
	
}public int soluongphieuduthuong() {
	return this.thungPhieuDuThuong.size();
	
}
public String rutthamtrungthuong() {
	String ketQua = "";
	Random rd = new Random();
	int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
	ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
	return ketQua;
}
public void intatca() {
	System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
}

	public static void main(String[] args) {
		int luachon = 0;
		Scanner sc = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		do {
			System.out.println("--------------------------------------");
			System.out.println("MENU: ");
			System.out.println("1. Thêm mã số dự thưởng.");
			System.out.println("2. Xóa mã số dự thưởng.");
			System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
			System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
			System.out.println("5. Số lượng phiếu dự thưởng.");
			System.out.println("6. Rút thăm trúng thưởng.");
			System.out.println("7. In ra tất cả các phiếu.");
			System.out.println("0. Thoát khỏi chương trình");
			luachon = sc.nextInt();
			sc.nextLine();
			if(luachon==1|| luachon==2 || luachon==3) {
				System.out.println("Nhap vao gia tri: ");
				String giatri= sc.nextLine();
				if(luachon==1) {
					rt.themmasoduthuong(giatri);
				}else if(luachon==2) {
					rt.xoamasoduthuong(giatri);
				}else if(luachon==3) {
					rt.kiemtramsoduthuong(giatri);}
				}else if(luachon==4) {
					rt.xoatatca();
				}else if(luachon==5) {
					System.out.println("So luong phieu du thuong la: "+rt.soluongphieuduthuong());
				}else if(luachon==6) {
					System.out.println("Ma so trung thuong la: "+ rt.rutthamtrungthuong());
				}else if(luachon==7) {
					rt.intatca();
				}
		}while(luachon!=0);
	}	
}

