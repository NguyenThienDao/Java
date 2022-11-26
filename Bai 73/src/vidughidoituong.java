import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class vidughidoituong {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 73\file.data");
		OutputStream op= new FileOutputStream(file);
		ObjectOutputStream oop= new ObjectOutputStream(op);
		
		sinhvien sv= new sinhvien("001", "Nguyen Van A", 2000, 10);
		oop.writeObject(sv);
		
		oop.flush();
		oop.close();
		
	}

}
