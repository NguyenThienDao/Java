import java.util.Iterator;
import java.util.Scanner;

public class Ham_length {
	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		String s= "hello";
		System.out.println("nhap vao chuoi: ");
		s= sc.nextLine();
		System.out.println("---------------------");
		// ham length> lay do dai cua chuoi 
		System.out.println(s.length());
		
		
	//-------------------------------------------------------------------------------------------------------
		
		
		//int dodai= s.length();
		
		//ham charAt(vi tri) => lay ra mot ki tu tai mot vi tri bat ki 
		//for(int i=0; i<dodai;i++) {
			//System.out.println("Vi tri "+i+"la "+s.charAt(i));
			
			// ham getChars(vi tri bat dau, vi tri ket thuc, mang luu du lieu, vi tri bat da luu cua mang)
		// char [] arr = new char[100];
		// s.getChars(2, 6, arr, 0);
		 //for (int i=0; i < arr.length; i++) {
			//System.out.println("gia tri cua mang tai vi tri "+i+"la: "+arr[i]);}		
            
		 // ham getBytes => co 3 cach lay ra ky tu 
		 
		// byte[] arrayBytes= s.getBytes();
		// for (byte b : arrayBytes) {
			//System.out.println(b);
		//}
  }	
}

