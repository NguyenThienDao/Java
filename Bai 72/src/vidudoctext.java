import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class vidudoctext {
	public static void main(String[] args) throws IOException  {
		/*cach 1
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 72\\file.txt");
		BufferedReader br = Files.newBufferedReader(f.toPath(),StandardCharsets.UTF_8);
		String line=null;
		do {
			line = br.readLine();
			if (line==null) {
				break;
			}else {
				System.out.println(line);
			}
		} while (true);
		*/
		 // cach 2 
		File f2= new File("C:\\Users\\Admin\\eclipse-workspace\\Bai 72\\file.txt");
		List<String> alltext = Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
		for (String line : alltext) {
			System.out.println(line);
		}
	}
}
