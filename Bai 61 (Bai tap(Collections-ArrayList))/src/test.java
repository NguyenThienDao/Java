import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		danhsachsinhvien dssv= new danhsachsinhvien();
		int luachon= 0;
		do {
			System.out.println("MENU ---------------");
			System.out.println("Hay lua chon cac chuc nang sau:");
			System.out.println(
					  "1.	Thêm sinh viên vào danh sách.\n"
					+ "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
					+ "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
					+ "0.   Thoát khỏi chương trình");
			luachon= sc.nextInt();
			sc.nextLine();
			if (luachon ==1) {
				//1.	Thêm sinh viên vào danh sách.
				System.out.println("Nhap ma sinh vien: ");String masinhvien = sc.nextLine();
				System.out.println("Nhap hovaten: ");String hovaten = sc.nextLine();
				System.out.println("Nhap nam sinh: ");int namsinh = sc.nextInt();
				System.out.println("Nhap diem trung binh: ");Double diemtrungbinh = sc.nextDouble();
				sinhvien sv= new sinhvien(masinhvien,
						hovaten, namsinh, diemtrungbinh);
				dssv.themsinhvien(sv);
			}else if(luachon ==2) {
				int luachon1 = 100;
				//2.	In danh sách sinh viên ra màn hình.
				do {
					dssv.indanhsachsinhvien();
					System.out.println("chon 0 de thoat");
					luachon1 = sc.nextInt();
				} while (luachon1!=0);
			}else if(luachon ==3) {
			    //3.	Kiểm tra danh sách có rỗng hay không.
				dssv.ktdanhsachsinhvien();
			}else if(luachon ==4) {
				//4.	Lấy ra số lượng sinh viên trong danh sách.
				System.out.println("So luong sinh vien trong danhs  sach la: " +dssv.laysoluongsinhvien());
			}else if(luachon ==5) {
				//5.	Làm rỗng danh sách sinh viên.
				dssv.lamrongdanhsachsinhvien();
			}else if(luachon ==6) {
				//6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
				System.out.println("Nhap ma sinh vien: ");String masinhvien = sc.nextLine();
				sinhvien sv= new sinhvien(masinhvien);
			    dssv.kiemtrasinhviencotontaiko(masinhvien);
			}else if(luachon ==7) {
				//7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
				System.out.println("Nhap ma sinh vien: ");String masinhvien = sc.nextLine();
				sinhvien sv= new sinhvien(masinhvien);
			    dssv.xoamotsinhvien(sv);
			}else if(luachon ==8) {
				//8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
				System.out.println("Nhap hovaten: ");String hovaten = sc.nextLine();
				System.out.println("ket qua tim kiem: ");
				dssv.timkiemsinhvien(hovaten);
			}else if(luachon ==9) {
				//9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
				dssv.sapXepSinhVienGiamDanTheoDiem();
				dssv.indanhsachsinhvien();
			}
			
		} while (luachon !=0);
		
	}

}
