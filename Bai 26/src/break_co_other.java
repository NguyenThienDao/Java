public class break_co_other {
	public static void main(String[] args) {
		int out, in = 0;
		một: for (out = 0; out < 10; out++) {
		hai: for (in = 0; in < 20; in++) {
				if (in > 10)
					break một;
				/*đúng diều kiện thì nó sẽ thoát ra khỏi cái vòng lập hai, nhưng vì break cộng thêm cái 
				 * vòng lập tên một nên nó sẽ thoát ra cái vòng lập tên một và tên hai đó. Nó sẽ ko 
				 * thực hiện câu lệnh của cái vòng lập thứ hai vì vòng lập một đã thoát rồi 
				 * 
				 */
		}
		System.out.println("bên trong vòng lặp out: out = " + out + ", in = " + in);
	}
	System.out.println("bên ngoài vòng lặp out: out = " + out + ", in = " + in);
}
}

