import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
	private Map<String, String> data= new TreeMap<>();
	
	public String themtudien(String tukhoa, String ynghia) {
		return data.put(tukhoa, ynghia);
	}
	public void xoatu(String tukhoa) {
		this.data.remove(tukhoa);
	}
	public String timyngiatukhoa(String tukhoa) {
		return this.data.get(tukhoa);
	}
	public void indanhsachtukhoa() {
		Set<String> ds= this.data.keySet();
		System.out.println(Arrays.toString(ds.toArray()));
	}
	public int soluong() {
		return this.data.size();
	}
	public void xoatatca() {
		this.data.clear();
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int luachon=0;
		TuDien tudien= new TuDien();
		do {
			System.out.println("---------------");
			System.out.println("MENU ");
			System.out.println("Tra tu đien Anh - Viet:\n"
					+ "1. Them tu (tu khoa, y nghia)\n"
					+ "2. Xoa tu\n"
					+ "3. Tim y nghia cua tu khoa ⇒ Tra tu\n"
					+ "4. In ra danh sach tu khoa\n"
					+ "5. Lay so luong tu\n"
					+ "6. Xoa tat ca cac tu khoa\n"
					+ "0. Thoat khoi choung trinh\n"
					+ "");
			luachon=sc.nextInt();sc.nextLine();
			if (luachon==1) {
				System.out.println("Nhap tu khoa");
				String tukhoa=sc.nextLine();
				System.out.println("Nhap y nghia");
				String ynghia= sc.nextLine();
				tudien.themtudien(tukhoa, ynghia);
			}else if(luachon==2) {
				System.out.println("Nhap tu khoa can xoa");
				String tukhoa=sc.nextLine();
				tudien.xoatu(tukhoa);
			}else if(luachon==3) {
				System.out.println("Nhap tu khoa");
				String tukhoa=sc.nextLine();
				System.out.println("y nghia la: "+tudien.timyngiatukhoa(tukhoa));
			}else if(luachon==4) {
				tudien.indanhsachtukhoa();
			}else if(luachon==5) {
				System.out.println("so luong la: "+ tudien.soluong());
			}else if(luachon==6) {
				tudien.xoatatca();
			}
		} while (luachon!=0);
	}

}
