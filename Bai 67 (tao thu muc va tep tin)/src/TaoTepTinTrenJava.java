import java.io.File;
import java.io.IOException;

public class TaoTepTinTrenJava {
	public static void main(String[] args) throws IOException {
		// Lưu ý:
		// MS Windows: \ => \\ | Ví dụ: "C:\\Thu muc 1\\Thuc muc\\Ten tap tin.xxx";
		// Linux, MacOS: / | Ví dụ: /Thu muc 1/Thuc muc 2 /Ten tap tin.xxx"
		
		//kiem tra thu muc hoac tap tin co ton tai hay ko'
		File folder1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai-67");
		File folder2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai-68");
		System.out.println("kiem tra folder1 co ton tai hay ko: "+folder1.exists());
		System.out.println("kiem tra folder2 co ton tai hay ko: "+folder2.exists());
		
		//tao thu muc
		//phuong thuc mkdir() => tao 1 thu muc 
		File d1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai-67\\Directory1");
		d1.mkdir();
		
		//phuong thuc mkdirs() => tao nhieu thu muc cung mot luc
		File d2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai-67\\Directory1\\Directory2\\Directory3\\Directory4");
		d2.mkdirs();
		
		//tao tap tin(co phan mo rong: .exe, .txt, .doc, .xls .....)
		File file1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai-67\\Directory1\\vidu1.txt");
		File file2 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai-67\\Directory1\\vidu2.txt");
		file1.createNewFile();
		file2.createNewFile();
	}

}
