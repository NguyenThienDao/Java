public class testBox {
	public static void main(String[] args) {
		Box box= new Box(15);
		
		System.out.println("Gia tri: "+box.getValue());
		
		//Bos box= new Box(15.5);=> bao loi
		//Bos box= new Box("muoi lam");=> bao loi
	}

}
