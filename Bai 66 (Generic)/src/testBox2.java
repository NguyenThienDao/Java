public class testBox2 {
	public static void main(String[] args) {
		Box2 b1= new Box2<Integer>(15);
		System.out.println("gia tri: "+b1.getValue());
		
		Box2 b2= new Box2<String>("Muoi lam");
		System.out.println("gia tri: "+b2.getValue());
		
		Box2 b3= new Box2<Double>(15.5);
		System.out.println("gia tri: "+b3.getValue());
		
	}

}
