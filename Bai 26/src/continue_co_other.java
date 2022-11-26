public class continue_co_other {
	public static void main(String[] args) {
	outer: for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(i<5)
					continue outer;
				System.out.println(i+" x "+j +" = "+(i*j));
			}
			System.out.println("---");
		}
	}

}
