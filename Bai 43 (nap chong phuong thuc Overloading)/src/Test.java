public class Test {
public static void main(String[] args) {
	Mymath mm = new Mymath();
	System.out.println("tim min: "+mm.timmin(2, 3));
	System.out.println("tim min: "+mm.timmin(2.1, 3.4));
	System.out.println("tin tong (5,6)= "+mm.tinhtong(5, 6));
	double arr[] = new double [] {1,2,3,4,5,6,7,8,9};
	System.out.println("tinh tong mang arr: "+mm.tinhtong(arr));
}
}
