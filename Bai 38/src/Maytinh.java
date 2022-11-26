public class Maytinh {
private Hangsanxuat hsx;
private Ngay ngaysx;
private double giaban;
private double thoigianbaohanh;
public Maytinh(Hangsanxuat hsx, Ngay ngaysx, double giaban, double thoigianbaohanh) {
	super();
	this.hsx = hsx;
	this.ngaysx = ngaysx;
	this.giaban = giaban;
	this.thoigianbaohanh = thoigianbaohanh;
}
public Hangsanxuat getHsx() {
	return hsx;
}
public void setHsx(Hangsanxuat hsx) {
	this.hsx = hsx;
}
public Ngay getNgaysx() {
	return ngaysx;
}
public void setNgaysx(Ngay ngaysx) {
	this.ngaysx = ngaysx;
}
public double getGiaban() {
	return giaban;
}
public void setGiaban(double giaban) {
	this.giaban = giaban;
}
public double getThoigianbaohanh() {
	return thoigianbaohanh;
}
public void setThoigianbaohanh(double thoigianbaohanh) {
	this.thoigianbaohanh = thoigianbaohanh;
}
public boolean kiemtragiathaphon(Maytinh mtk) {
	return this.giaban> mtk.giaban;
}
public String laytenquocgia() {
	return this.hsx.laytenquocgia();
}
}


