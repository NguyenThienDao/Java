public class Test {
     public static void main(String[] args) {
		MyDate md1 = new MyDate(6, 7, 2022);
		MyDate md2 = new MyDate(6, 7, 2022);
		MyDate md3 = new MyDate(3, 8, 2022);
		//---------------------------------------------------------------------------------------
		System.out.println(md1.toString());
	    System.out.println(md2.toString());
	    System.out.println(md3.toString());
		System.out.println("md1= md2: "+md1.equals(md2));
		System.out.println("md1= md3: "+md1.equals(md3));
		System.out.println("md2= md3: "+md2.equals(md3));
	    //---------------------------------------------------------------------------------------
	    System.out.println("hashcode md1: "+md1.hashCode());
	    System.out.println("hashcode md2: "+md2.hashCode());
	    System.out.println("hashcode md3: "+md3.hashCode());
	}
}
