public class vidu {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";
		
		String s3= s1+s2;// cach thuong 
		//ham concat=> gan them du lieu cho mot chuoi
		String s4 =s1.concat(s2);// pro pho lay o 
		System.out.println("s3: "+s3);
		System.out.println("s4: "+s4);
		
		// Hàm replaceAll => thay thế,vidu 1
		String s5 = s1.replace("tItv", "Dao").concat(s2);
		System.out.println(s5);
		
		// Hàm replaceAll => thay thế, vidu 2
		String s6 = "Tung.vn";
		String s7 = s6.replaceAll("Tung","TITV");
		System.out.println("s7 = " + s7);
		
		// toLowerCase => chuyển về viết thường
		// toUpperCase => chuyển về viết hoa
		String s8 = s3.toLowerCase();
		String s9 = s3.toUpperCase();
		System.out.println("s8 = " + s8);
		System.out.println("s9 = " + s9);
		
		// trim() => xóa khoảng trắng dư thừa ở đầu chuỗi
		String s15 = "  Xin chào các bạn, mình là TITV.vn    ";
		System.out.println(s15.trim());
		
		/// subString => cắt chuỗi con
		String s10 = "Xin chào các bạn, mình là TITV.vn";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println("s11 = " + s11);
		System.out.println("s12 = " + s12);
		
	}
}
