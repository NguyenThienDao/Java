public class Bophim {
    private String tenphim;
    private int namxuatban;
    private Hangsanxuat hangsanxuat;
    private double giave;
    private Ngay ngaychieu;
    public Bophim(String tp, int nxb, Hangsanxuat hsx,double gv, Ngay ngc) {
	this.tenphim = tp;
	this.namxuatban = nxb;
	this.hangsanxuat = hsx;
	this.giave = gv;
	this.ngaychieu = ngc;
	
}
	public String getTenphim() {
		return tenphim;
	}
	public void setTenphim(String tenphim) {
		this.tenphim = tenphim;
	}
	public int getNamxuatban() {
		return namxuatban;
	}
	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}
	public Hangsanxuat getHangsanxuat() {
		return hangsanxuat;
	}
	public void setHangsanxuat(Hangsanxuat hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}
	public double getGiave() {
		return giave;
	}
	public void setGiave(double giave) {
		this.giave = giave;
	}
	public Ngay getNgaychieu() {
		return ngaychieu;
	}
	public void setNgaychieu(Ngay ngaychieu) {
		this.ngaychieu = ngaychieu;
	}
public boolean kiemtragiavecobang(Bophim giave) {
	if(this.giave== giave.giave) {
		return true;
	}else {return false;}
}
public String laytenhangsanxuat() {
	return this.hangsanxuat.getTenhsx();
}
public double giamgia(double x) {
	return this.giave * (x/100);
}
public double Tienkhaccantra(double x) {
	return this.giave -this.giave * (x/100);
	
}
}
