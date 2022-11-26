import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
		String s1= "nguyen thien dao";
		String s2= "Nguyen Thien Dao";
		String s3= "nguyen thien dao";
		// Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt Hoa Thường
		System.out.println("s1 equals s2: "+ s1.equals(s2));
		System.out.println("s1 equals s3: "+ s1.equals(s3));
		
		// Hàm equalsIgnoreCase, so sánh 2 chuỗi giống nhau, ko phân biệt hoa thường
	    System.out.println("s1 equalsIgnoreCase s2: "+ s1.equalsIgnoreCase(s2));
	    System.out.println("s1 equalsIgnoreCase s3: "+ s1.equalsIgnoreCase(s3));
	    
	 /*Hàm compareTo => so sánh (>; <; =). Cai ham nay kieu dung de so sanh danh sach lop, nhu so sanh so
	  * thu tu cua tung nguoi de sap xep lai cho dung a */
	    String sv3 = "Nguyễn Văn";
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv4 = "Nguyễn Văn A";
		
		System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+ sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: "+ sv1.compareTo(sv4));
		System.out.println("sv2 compareTo sv3: "+ sv2.compareTo(sv3));
	    
		// Hàm compareToIgnoreCase => Tường tự hàm compareTo, không biệt chữ hoa chữ thường
		System.out.println("sv1 compareToIgnoreCase sv2: "+ sv1.compareToIgnoreCase(sv1));
		System.out.println("sv1 compareToIgnoreCase sv3: "+ sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compareToIgnoreCase sv4: "+ sv1.compareToIgnoreCase(sv3));
		System.out.println("sv2 compareToIgnoreCase sv3: "+ sv1.compareToIgnoreCase(sv4));
		
		// Hàm regionMatches => so sánh một đoạn. vd so sanh tinh cua bien so xe hat do dien thoai,....
		String r1 = "TITV.vn";
		String r2 = "TV.V";
		boolean check = r1.regionMatches(2, r2, 0, 4);/*2 co nghia la so sanh tu ki tu 2 cua r1, r2 la 
		cai thk so sanh, 0 la vi tri bat dau so sanh cua r2, 4 la so sanh 4 ki tu  */
		System.out.println(check);
		System.out.println(r2.regionMatches(true,0, r1, 2, 4));//co true la se so sanh ko phan biet viet hoa hay thuong 
		//vd
		// 0937 456 789
	    // 0937 455 765
		System.out.println("----------------------------------------------------------------------------");
		// Hàm startWith => Hàm kiểm tra chuỗi bắt đầu bằng ....
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		System.out.println(sdt.startsWith("038"));
		
		// Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
			String tenFile = "I love you.JPG";
			String tenFile2 = "Hoc Java.PDF";
				
			if (tenFile.endsWith(".JPG")) {
				System.out.println("File 1 là hình ảnh!");
			}else if (tenFile.endsWith(".PDF")) {
				System.out.println("File 1 là file PDF!");
			}
				
			if (tenFile2.endsWith(".JPG")) {
				System.out.println("File 2 là hình ảnh!");
			}else if (tenFile2.endsWith(".PDF")) {
				System.out.println("File 2 là file PDF!");
	
}
	}
}
