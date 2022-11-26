public class Test {
public static void main(String[] args) {
	Ngay ngay1= new Ngay(12, 3, 2021);
	Ngay ngay2= new Ngay( 8, 6, 2021);
	Ngay ngay3= new Ngay(24, 8, 2022);
	
	Hangsanxuat hsx1= new Hangsanxuat("Hang A", "Viet Nam");
	Hangsanxuat hsx2= new Hangsanxuat("Hang B", "My");
	Hangsanxuat hsx3= new Hangsanxuat("Hang C", "Nhat Ban");
	
	Bophim bp1= new Bophim("Bo gia", 2021, hsx1, 150.000, ngay1);
	Bophim bp2= new Bophim("Gorilla vs kingkong", 2021, hsx2, 200.000, ngay2);
	Bophim bp3= new Bophim("Dgaron ball super super heros", 2022, hsx3, 200.000, ngay3);
	
	System.out.println("bo phim 1 gia ve co bang bo phim 3 ko: "+bp1.kiemtragiavecobang(bp3));
	System.out.println("bo phim 2 gia ve co bang bo phim 3 ko: "+bp2.kiemtragiavecobang(bp3));
	System.out.println("bo phim 1 gia ve co bang bo phim 2 ko: "+bp1.kiemtragiavecobang(bp2));
	
	System.out.println("giam gia 10% bophim1: "+bp1.giamgia(10));
	System.out.println("Tien khach can tra: "+bp1.Tienkhaccantra(10));
}
}
