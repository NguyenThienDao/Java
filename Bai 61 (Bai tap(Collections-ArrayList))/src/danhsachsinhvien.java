import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class danhsachsinhvien {
	private ArrayList<sinhvien> danhsach;
	
	
	public danhsachsinhvien() {
		this.danhsach= new ArrayList<sinhvien>();
	}
	public danhsachsinhvien(ArrayList<sinhvien> danhsach) {
		this.danhsach = danhsach;
	}
    //1.	Thêm sinh viên vào danh sách.
	public void themsinhvien(sinhvien sv) {
		this.danhsach.add(sv);
	}
	//2.	In danh sách sinh viên ra màn hình.
	public void indanhsachsinhvien() {
		for (sinhvien sinhvien : danhsach) {
			System.out.println(sinhvien);
		}
	}

    //3.	Kiểm tra danh sách có rỗng hay không.
	public void ktdanhsachsinhvien() {
		if(this.danhsach.isEmpty() == true) {
			System.out.println("rong");
		}else {
			System.out.println("ko rong");}
	    }
	//4.	Lấy ra số lượng sinh viên trong danh sách.
	public int laysoluongsinhvien() {
		return this.danhsach.size();
	}
	//5.	Làm rỗng danh sách sinh viên.
	public void lamrongdanhsachsinhvien() {
		this.danhsach.clear();
	}
	//6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
	public void kiemtrasinhviencotontaiko(String msv) {
		for (sinhvien sinhvien : danhsach) {
			if (sinhvien.getMasinhvien().indexOf(msv)>=0) {
				System.out.println(sinhvien);
			}else {System.out.println("khong tim thay! ");}}
		}
	//7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
	public boolean xoamotsinhvien(sinhvien sv) {
		return this.danhsach.remove(sv);
	}
	//8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
	public void timkiemsinhvien(String ten) {
		for (sinhvien sinhvien : danhsach) {
			if(sinhvien.getHovaten().indexOf(ten)>=0) {
				System.out.println(sinhvien);
			}else {System.out.println("khong tim thay! ");}}
	}
	//9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
	public void sapXepSinhVienGiamDanTheoDiem() {
		Collections.sort(this.danhsach, new Comparator<sinhvien>() {
			@Override
			public int compare(sinhvien sv1, sinhvien sv2) {
				// TODO Auto-generated method stub
				if(sv1.getDiemtrungbinh()<sv2.getDiemtrungbinh()) {
					return 1;
				}else if(sv1.getDiemtrungbinh()>sv2.getDiemtrungbinh()) {
					return -1;
				}else {
					return 0;
				}
			}
		});
	}
	}
		
		
	


