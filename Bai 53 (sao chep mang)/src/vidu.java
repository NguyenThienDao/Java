import java.util.Arrays;

public class vidu {
	public static void main(String[] args) {
// kieu du lieu nguyen thuy 
		int[] mang1= {1,2,3};
		
// copy mang bang dau "=" => neu thay doi du lieu cua 1 trong hai mang thi mang kia cung thay doi theo
		int[] mang1_a= mang1;
		mang1_a[0]=100;
		System.out.println("mang1: "+Arrays.toString(mang1));
		System.out.println("mang1_a: "+Arrays.toString(mang1_a));
		
// copy mang bang ham clone =. khi thay doi gia tri cua 1 mnag bat ki thi mang kia se ko thay doi theo 
		int[] mang1_b= mang1.clone();
		mang1_a[0]=50;
		System.out.println("mang1: "+Arrays.toString(mang1));
		System.out.println("mang1_b: "+Arrays.toString(mang1_b));
		
// copy mang bang ham System.arraycopy =. khi thay doi gia tri cua 1 mnag bat ki thi mang kia se ko thay doi theo 
	    int[] mang1_c= new int[mang1.length];
	    System.arraycopy(mang1, 0, mang1_c, 0, mang1.length);
	    mang1_c[0]= 500;
	    System.out.println("mang1_c: "+Arrays.toString(mang1_c));
	    
	    System.out.println("-------------------------------------------------------------------------------");
	    // kieu du lieu doi tuong String 
	    String[] doituong1= {"Nguyen"," Thien"," Dao"};
// copy mang bang dau "=" => neu thay doi du lieu cua 1 trong hai mang thi mang kia cung thay doi theo
	 		String[] doituong1_a= doituong1;
	 		doituong1_a[0]="8A3";
	 		System.out.println("doituong1: "+Arrays.toString(doituong1));
	 		System.out.println("doituong1_a: "+Arrays.toString(doituong1_a));
	 		
// copy mang bang ham clone =. khi thay doi gia tri cua 1 mnag bat ki thi mang kia se ko thay doi theo 
	 		String[] doituong1_b= doituong1.clone();
	 		doituong1_a[0]="9A3";
	 		System.out.println("doituong1: "+Arrays.toString(doituong1));
	 		System.out.println("doituong1_b: "+Arrays.toString(doituong1_b));
	 		
// copy mang bang ham System.arraycopy =. khi thay doi gia tri cua 1 mnag bat ki thi mang kia se ko thay doi theo 
	 	    String[] doituong1_c= new String[doituong1.length];
	 	    System.arraycopy(doituong1, 0, doituong1_c, 0, doituong1.length);
	 	   doituong1_c[0]= "10A3";
	 	    System.out.println("doituong1_c: "+Arrays.toString(doituong1_c));
	 	    
	    
	}

}
