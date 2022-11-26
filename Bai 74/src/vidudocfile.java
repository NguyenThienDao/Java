import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class vidudocfile {
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		File file= new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 74\\file.data");
		InputStream is = new FileInputStream(file);
		ObjectInputStream ois =new ObjectInputStream(is);
		
		sinhvien st = (sinhvien) ois.readObject();
		System.out.println(st);
		System.out.println(st);
		ois.close();
		
	}

}
