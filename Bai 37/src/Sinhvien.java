public class Sinhvien {
private String masinhvien;
private String hovaten;
private Ngay ngaysinh;
private double diemtrungbinh;
private Lop lop;
public Sinhvien(String msv, String hvat, Ngay ns, double dtb, Lop l) {
	super();
	this.masinhvien = msv;
	this.hovaten = hvat;
	this.ngaysinh = ns;
	this.diemtrungbinh = dtb;
	this.lop = l;
}
public String getMasinhvien() {
	return masinhvien;
}
public void setMasinhvien(String masinhvien) {
	this.masinhvien = masinhvien;
}
public String getHovaten() {
	return hovaten;
}
public void setHovaten(String hovaten) {
	this.hovaten = hovaten;
}
public Ngay getNgaysinh() {
	return ngaysinh;
}
public void setNgaysinh(Ngay ngaysinh) {
	this.ngaysinh = ngaysinh;
}
public double getDiemtrungbinh() {
	return diemtrungbinh;
}
public void setDiemtrungbinh(double diemtrungbinh) {
	this.diemtrungbinh = diemtrungbinh;
}
public Lop getLop() {
	return lop;
}
public void setLop(Lop lop) {
	this.lop = lop;
}
public String laytenkhoa() {
	return this.lop.getTenkhoa();
}
public boolean kiemtrathidat() {
	if( this.getDiemtrungbinh()>= 5) {
		return true;
	}else {return false;}
}
public boolean kiemtracungngaysinh(Sinhvien svk) {
	if(this.ngaysinh.equals(svk)== svk.ngaysinh.equals(svk)) {
		return true;
	}else {return false;}
}
}
