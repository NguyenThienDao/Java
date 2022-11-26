public class ViDu1 {
	public static void main(String[] args) {
		String s1= "Xin chao co chu, xin chao cac ban, Xin chao";
		String s2= "Xin chao";
		String s3= "xin choa 123";
		char c1= 'o';
//ham indexOf=> tim kiem chuoi nay co trong chuoi khac ko 
		System.out.println("vi tri cua s2 trong s1 la: "+s1.indexOf(s2));
		System.out.println("vi tri cua s3 trong s1 la: "+s1.indexOf(s3));
		
//Su dung vi tri bat dau, so 2 la vi tri bat dau tim kiem. ket qua se ra 35 do la vi tri cua Xin chao
		System.out.println("vi tri cua s2 trong s1 la: "+s1.indexOf(s2,2));
		
// Tìm kiếm char
		System.out.println("Vị trí của c1 trong s1 là: "+ s1.indexOf(c1));
		System.out.println("Vị trí của c1 trong s1 là: "+ s1.indexOf(c1, 20));
				
// Hàm lastIndexof => tìm kiếm từ phải sang trái
		System.out.println("Vị trí của s2 trong s1 (từ phải sang trái) là: "+ s1.lastIndexOf(s2));
		
		
		
		
	}

}