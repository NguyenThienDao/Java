public abstract class phuongtiendichuyen {
      protected String loaiphuongtien;
      protected Hangsanxuat hangsanxuat;
	public phuongtiendichuyen(String loaiphuongtien, Hangsanxuat hangsanxuat) {
		this.loaiphuongtien = loaiphuongtien;
		this.hangsanxuat = hangsanxuat;
	}
	public String getLoaiphuongtien() {
		return loaiphuongtien;
	}
	public void setLoaiphuongtien(String loaiphuongtien) {
		this.loaiphuongtien = loaiphuongtien;
	}
	public Hangsanxuat getHangsanxuat() {
		return hangsanxuat;
	}
	public void setHangsanxuat(Hangsanxuat hangsanxuat) {
		this.hangsanxuat = hangsanxuat;
	}
    public String laytenhangsanxuat() {
    	return this.hangsanxuat.getTenhangsanxuat();
    }
    public abstract void batdau();
    public abstract void tangtoc();
    public abstract void dunglai();
    public abstract double layvantoc();
    
}


