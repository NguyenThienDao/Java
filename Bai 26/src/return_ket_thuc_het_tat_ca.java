public class return_ket_thuc_het_tat_ca extends continue_ko_co_other {
	public static void main(String[] args) {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=10; j++) {
				if(j>5)
					return;// đúng điều kiện thì ngưng hết tất cả, kể cả hàm main 
					
				System.out.println(i+" x "+j +" = "+(i*j));
			}
			System.out.println("---");
		}
		System.out.println("ABC");
	}
}



