import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipfile {
	public static void main(String[] args) throws IOException {
		String soursefile= "C:\\Users\\Admin\\eclipse-workspace\\Bai 76 ( nen file )\\text.txt";
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\Bai 76 ( nen file )\\nen");
		ZipOutputStream zout = new ZipOutputStream(fos);
		
		File filetozip= new File(soursefile);
		FileInputStream iput= new FileInputStream(filetozip);
		
		ZipEntry zet= new ZipEntry(filetozip.getName());
		zout.putNextEntry(zet);
		byte[] bye= new byte[1024];
		int lenght;
		while ((lenght = iput.read(bye))>=0) {
			zout.write(bye, 0, lenght);
		}
		zout.close();
		iput.close();
		fos.close();
	}

}
