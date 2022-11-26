import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class viduDeque {
	public static void main(String[] args) {
		Deque<String> danhsachsv= new ArrayDeque<String>();
		danhsachsv.offer("Nguyen Van B");
		danhsachsv.offer("Nguyen Van C");
		danhsachsv.offer("Lan");
		danhsachsv.offer("Nhung");
		danhsachsv.offerFirst("Hung");
		danhsachsv.offerLast("Nam");
		//Nam > Nhung > Lan > Nguyen Van C > Nguyen Van B > Hung
		
		
		while(true) {
			String ten = danhsachsv.poll();  // => lấy ra và xóa
			if(ten==null) {
				break;
			}
			
			System.out.println(ten);
	}
		

}
}
