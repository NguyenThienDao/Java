import java.util.Arrays;

public class vidu {
	public static void main(String[] args) {
		String s= "Xin chao cac ban, tui la Peter ";
		
		String[] a= s.split(" ");
		System.out.println(Arrays.toString(a));
		
		String[] b= s.split(",");
		System.out.println(Arrays.toString(b));
		
		String s2= "Xin chao cac ban, minh la Peter. Minh la lap trinh vien.";
		String[]c= s2.split("//.|//,");
		System.out.println(Arrays.toString(c));
		
		String s3 = "Nguyen Thien Dao";
		String[] d= s3.split(" ");
		System.out.println(Arrays.toString(d));
		System.out.println("Ten: "+d[d.length-1]);
		System.out.println("Ten Dem: "+d[d.length-2]);
		System.out.println("Ho: "+d[d.length-3]);
	}
}

