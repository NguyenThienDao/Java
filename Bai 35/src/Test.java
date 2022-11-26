public class Test {
public static void main(String[] args) {
	Ngay ngay1= new Ngay(11,11, 2009);
	Ngay ngay2= new Ngay(11,11, 2009);
	Ngay ngay3= new Ngay(11,11, 2009);
	
	Tacgia tg1 = new Tacgia("Nguyen Thien Dao", ngay1);
	Tacgia tg2 = new Tacgia("Hieu kia", ngay2);
	Tacgia tg3 = new Tacgia("Do Dat", ngay3);
	
	Sach s1= new Sach("Lap trinh java", 15000,2022, tg1);
	Sach s2= new Sach("cach lam hai ", 1500000,2021, tg2);
	Sach s3= new Sach("cach lam khuon mat hai", 1500000,2021, tg3);
	
	System.out.println("so sanh nam xuat ban s1 va s3: "+s1.sosanhnamxuatban(s2));
	System.out.println("giam gia"+s1.giamgia(10));
	
	
	
	
}
}
