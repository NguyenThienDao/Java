import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class viduxoafile {
	public static void xoaFile(File fx) {
		if(fx.isFile()) {
			// Xoa neu la tap tin
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}else if (fx.isDirectory()) {
			// Lay cac file con
			File[] mangCon = fx.listFiles();
			for(File f: mangCon) {
				// Xoa cac file con
				xoaFile(f);
			}
			// Xoa ban than thu muc sau khi da xoa cac file con
			System.out.println("Da xoa: "+fx.getAbsolutePath());
			fx.delete();
		}
	}
	public static void main(String[] args) throws IOException {
		// Su dung class File xoa tap tin hoac thu muc
		File F0 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 69 (Cach xoa tap tin va thu muc)\\bachup\\F0");
		File F0_1 = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 69 (Cach xoa tap tin va thu muc)\\bachup\\F0_1");
		File vidu = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 69 (Cach xoa tap tin va thu muc)\\bachup\\vidu.txt");
		/*
		F0.deleteOnExit(); // Xoa khong duoc vi co chua thu muc va tap tin
		F0_1.deleteOnExit(); // Xoa duoc vi la thu muc rong
		vidu.deleteOnExit(); // Xoa duoc vi la tap tin
		System.out.println(F0_1.delete()); 
		
		viduxoafile.xoaFile(F0);
		*/
		// Su dung class Files xoa tap tin va thu muc
		Path p0 = F0.toPath();
		Path p0_1 = F0_1.toPath();
		Path p_vidu = vidu.toPath();
		try {
			//Files.deleteIfExists(p0);
			Files.deleteIfExists(p0_1);
			Files.deleteIfExists(p_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
