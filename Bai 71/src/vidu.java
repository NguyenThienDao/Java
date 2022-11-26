import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class vidu {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\eclipse-workspace\\Bai 71\\file.txt");
		pw.print("Xin chao");
		pw.print(3.14);
		pw.print(' ');
		pw.print("la so PI");
		pw.println();
		Student st = new Student(100,"Nguyen Van A");
		pw.print(st);
		pw.flush();
		pw.close();
	}

}
