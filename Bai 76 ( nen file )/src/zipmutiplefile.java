import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipmutiplefile {
	public static void main(String[] args) throws IOException {
		List<String> srcfiles = Arrays.asList("C:\\Users\\Admin\\eclipse-workspace\\Bai 76 ( nen file )\\text1.txt"," C:\\Users\\Admin\\eclipse-workspace\\Bai 76 ( nen file )\\text2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\eclipse-workspace\\Bai 76 ( nen file )\\filetong.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String srcFile : srcfiles) {
            File filetozip = new File(srcFile);
            FileInputStream fis = new FileInputStream(filetozip);
            ZipEntry zipEntry = new ZipEntry(filetozip.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
    }
}




