public class Test {
   public static void main(String[] args) {
	Hoadoncafe hd= new Hoadoncafe("TrungNguyen", 600.000, 1.5);
	System.out.println("tong tien: "+hd.tinhTongtien()+"d");
	System.out.println("kiem tra khoi luong > 2kg: "+hd.Kiemtrakhoiluonglonhon(2));
	System.out.println("kiem tra khoi luong > 1kg: "+hd.Kiemtrakhoiluonglonhon(1));
	System.out.println("Kiem tra gia tien > 200.000 dong: "+hd.kiemtragiatienlonhon(200.000));
	System.out.println("kiem tra gia tien > 99.000 dong: "+hd.kiemtragiatienlonhon(99.000));
	System.out.println("giam gia:"+hd.GiamGia(10)+" dong");
	System.out.println("tien tra lai sau khi giam gia: "+hd.Tientralaikhigiamgia(10));
}
}
