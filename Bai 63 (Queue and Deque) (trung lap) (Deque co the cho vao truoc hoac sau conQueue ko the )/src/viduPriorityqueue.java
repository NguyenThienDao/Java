import java.util.PriorityQueue;
import java.util.Queue;

public class viduPriorityqueue {
	public static void main(String[] args) {
		Queue<String> danhsachsv= new PriorityQueue<String>();
		danhsachsv.offer("Nguyen Van B");
		danhsachsv.offer("Nguyen Van C");
		danhsachsv.offer("Lan");
		danhsachsv.offer("Nhung");
		
		while(true) {
			String ten= danhsachsv.poll();//lay ra va xoa. peek lay ra nhung ko xoa
			if(ten==null) {
				break;
			}
			System.out.println(ten);
		}
	}

}
