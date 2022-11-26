import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
	//10.ghi xuống file.
	public void ghidulieuxuongfile(String tenfile) throws IOException {
		OutputStream op= new FileOutputStream(tenfile);
		ObjectOutputStream oop= new ObjectOutputStream(op);
		
		for (sinhvien sinhvien : danhsach) {
			oop.writeObject(sinhvien);
		}
		oop.flush();
		oop.close();
	}
	//doc du lieu tu file 
	public void docdulieuxuongfile(File f) throws IOException, ClassNotFoundException {
		InputStream ips= new FileInputStream(f);
		ObjectInputStream oips= new ObjectInputStream(ips);
		sinhvien sv= null;
		while (true) {
			Object oj= oips.readObject();
			if (oj !=null) {
				this.danhsach.add(sv);
			}else if (oj==null) {
				break;
			}
		}
		oips.close();
	}
	}
		
		
	


