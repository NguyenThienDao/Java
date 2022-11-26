public class Hangsanxuat {
private String tenhangsanxuat;
private Quocgia quocgia;
public Hangsanxuat(String thsx, Quocgia qg) {
	this.tenhangsanxuat = thsx;
	this.quocgia = qg;
}
public String getTenhangsanxuat() {
	return tenhangsanxuat;
}
public void setTenhangsanxuat(String tenhangsanxuat) {
	this.tenhangsanxuat = tenhangsanxuat;
}
public Quocgia getQuocgia() {
	return quocgia;
}
public void setQuocgia(Quocgia quocgia) {
	this.quocgia = quocgia;
}
public String laytenquocgia() {
	// TODO Auto-generated method stub
	return this.quocgia.getTenquocgia();
}

}
