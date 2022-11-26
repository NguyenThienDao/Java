import java.util.LinkedList;
import java.util.Queue;

public class viduqueue {
	public static void main(String[] args) {
		Queue<String> danhsachsv= new LinkedList<String>();
		danhsachsv.offer("Nguyen van A");
		danhsachsv.offer("Nguyen van B");
		danhsachsv.offer("Nguyen van C");
		danhsachsv.offer("Nguyen van D");
		
		while(true) {
			String ten= danhsachsv.poll();//lay ra va xoa. peek lay ra nhung ko xoa
			if(ten== null) {
				break;
			}
			System.out.println(ten);
		
		}
	}

}
