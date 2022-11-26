package test;

public class thoikhoabieu {
	private day thu;
	private String cacmonhoc;
	public thoikhoabieu(day thu, String cacmonhoc) {
		this.thu = thu;
		this.cacmonhoc = cacmonhoc;
	}
	public day getThu() {
		return thu;
	}
	public void setThu(day thu) {
		this.thu = thu;
	}
	public String getCacmonhoc() {
		return cacmonhoc;
	}
	public void setMonhoc(String monhoc) {
		this.cacmonhoc = monhoc;
	}
	@Override
	public String toString() {
		return "thoikhoabieu [thu=" + thu + ", cacmonhoc=" + cacmonhoc + "]";
	}
	
	
	
	

}
