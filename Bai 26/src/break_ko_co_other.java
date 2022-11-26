public class break_ko_co_other {
public static void main(String[] args) {
	int out, in = 0;
	một: for (out = 0; out < 10; out++) {
	hai: for (in = 0; in < 20; in++) {
			if (in > 10)
				break;
/*		
 *  nếu đúng điều kiện như in> 10 thì nó sẽ thoát cái vòng lập gần nó nhất. là cái 
 *  for thứ hai từ trên đếm xuống. Vì nó break cái vòng lập hai thôi nên nó sẽ thực 
 *  hiện hai câu lệnh phía dưới.
*/		
		}
		System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
	}
	System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
}
}

