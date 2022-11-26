public class Test {
	public static void main(String[] args) {
    Ngay ngay1= new Ngay(11, 11, 2009);
    Ngay ngay2= new Ngay(11, 11, 2009);
    Ngay ngay3= new Ngay(7, 7, 2009);
    //------------------------------------------------------------------------
    Lop lop1= new Lop("Lop 8A3","Khoa tin ");
    Lop lop2= new Lop("Lop 9A3","Khoa tin ");
    Lop lop3= new Lop("Lop 10A3","Khoa tin ");
    //------------------------------------------------------------------------
    Sinhvien sv1= new Sinhvien("hello","Nguyen Thien Dao", ngay1, 8, lop1);
    Sinhvien sv2= new Sinhvien("hello","Nguyen van A", ngay2, 8, lop2);
    Sinhvien sv3= new Sinhvien("hello","Nguyen Van B", ngay3, 4, lop3);
    //------------------------------------------------------------------------
    System.out.println("kiem tra ngay sinh sv1 voi sv2: "+sv1.kiemtracungngaysinh(sv2));
    
}
}