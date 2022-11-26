import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class vidufile {
	File file;
	
	public vidufile(String tenfile) {
		this.file = new File(tenfile);
	}
	public boolean kiemtrafilecothucthi() {
		return this.file.canExecute();
	}
	public boolean kiemtrafilecothedoc() {
		return this.file.canRead();
	}
	public boolean kiemtrafilecotheghi() {
		return this.file.canWrite();
	}
	public String induongdan() {
		return this.file.getAbsolutePath();
	}
	public String intenfile() {
		return this.file.getName();
	}
	public void kiemtrathumuchayteptin(String tenfile) {
		if (this.file.isDirectory()) {
			System.out.println("Đây là thư mục.");
		}else if(this.file.isFile()) {
			System.out.println("Đây là tệp tin. ");
		}
	}
	public void indanhsachcacfilecon(String tenfile) {
		if (this.file.isDirectory()) {
			System.out.println("Các tập tin con/ thư mục con là: ");
			File[] mangcon= file.listFiles();
			for (File file : mangcon) {
				System.out.println(file.getAbsolutePath());}
			} else if(this.file.isFile()) {
				System.out.println("Đây là tệp tin ko in được.");
			}
		}
	public void incaythumuc() {
		this.inchitietcaythumuc(file,1);
	}
	public void inchitietcaythumuc(File f, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|__");
		System.out.println(f.getName());
		if (f.canRead()&&f.isDirectory()) {
			File[] mangCon = f.listFiles();
			for (File fx : mangCon) {
				inchitietcaythumuc(fx, bac + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int luachon=0;
		System.out.println("nhap ten file: ");
		String tenfile= sc.nextLine();
		vidufile vdf= new vidufile(tenfile);
		do {
			System.out.println("MENU ---------- ");
			System.out.println("1. Kiểm tra file có thể thực thi: ");//canExecute();
			System.out.println("2. Kiểm tra file có thể đọc: ");//canRead();
			System.out.println("3. Kiểm tra file có thể ghi: ");//canWrite();
			System.out.println("4. In đường dẫn: ");//getAbsolutePath();
			System.out.println("5. In tên file: ");//getName();
			System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");//isDirectory() => thu muc, isFile() => tap tin
			System.out.println("7. In ra danh sách các file con: ");//
			System.out.println("8. In ra cây thư mục: ");//
			System.out.println("0. Thoát chương trình.");//
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: {System.out.println(vdf.kiemtrafilecothucthi());
				break;
			}
			case 2: {System.out.println(vdf.kiemtrafilecothedoc());
				break;
			}
			case 3: {System.out.println(vdf.kiemtrafilecotheghi());
				break;
			}
			case 4: {System.out.println(vdf.induongdan());
				break;
			}
			case 5: {System.out.println(vdf.intenfile());
				break;
			}
			case 6: {vdf.kiemtrathumuchayteptin(tenfile);
				break;
			}
			case 7: {vdf.indanhsachcacfilecon(tenfile);
				break;
			}
			case 8: {vdf.incaythumuc();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + luachon);
			}
		} while (luachon!=0);
	}

}
