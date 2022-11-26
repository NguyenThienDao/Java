import java.util.Arrays;

import vidu.Sinhvien;

public class Test2 {
		public static void main(String[] args) {
			Sinhvien sv1 =new Sinhvien(150, "Tran Van Thanh", "Lop 1", 9);
			Sinhvien sv2 =new Sinhvien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
			Sinhvien sv3 =new Sinhvien(199, "Nguyen Van An", "Lop 2", 8);
			
			System.out.println(sv1.compareTo(sv2));
			System.out.println(sv3.compareTo(sv1));
			
		    Sinhvien[] a_sv= {sv1, sv2, sv3};
		    
		  //a_sv ban dau 
			System.out.println("a_sv: "+Arrays.toString(a_sv));
			//ham sap xep tang dan 
			Arrays.sort(a_sv);
			System.out.println("a_sv sau khi sap xep: "+Arrays.toString(a_sv));
			//tim kiem 
			System.out.println("tim kiem An: "+Arrays.binarySearch(a_sv,sv1));
			
		}

}
