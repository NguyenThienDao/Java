public class Hoadoncafe {
   private String tenLoaiCafe;
   private double giaTien1kg;
   private double khoiLuong;
   
   public Hoadoncafe(String tlcf, double gt, double kl) {
	   this.tenLoaiCafe= tlcf;
	   this.giaTien1kg= gt;
	   this.khoiLuong= kl;
   }
   public double tinhTongtien() {
	   return this.giaTien1kg * this.khoiLuong;
   }
   public boolean Kiemtrakhoiluonglonhon(double kl) {
	   if(this.khoiLuong > kl) {
		   return true;
	   }else {
		   return false;
	   }
	   //hoặc có thể viết là" return this.khoiluong>kl;"
   }
   public boolean kiemtragiatienlonhon(double giatien) {
  return this.giaTien1kg> giatien;
}
  public double GiamGia(double x) {
	  if(this.tinhTongtien()>500.000) {
		  return (x/100)*this.tinhTongtien();
	  }else {
		  return 0;
	  }
  }
  public double Tientralaikhigiamgia(double x) {
	  return this.tinhTongtien()-this.GiamGia(x);
  }
}

   
