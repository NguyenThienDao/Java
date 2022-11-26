import java.util.Objects;

public class Sach {
      private String tensach;
      private double giaban;
      private int namxuatban;
      private Tacgia tacgia;
	public Sach(String tensach, double giaban, int namxuatban, Tacgia tacgia) {
		this.tensach = tensach;
		this.giaban = giaban;
		this.namxuatban = namxuatban;
		this.tacgia = tacgia;
	}
	public String getTensach() {
		return tensach;
	}
	public void setTensach(String tensach) {
		this.tensach = tensach;
	}
	public double getGiaban() {
		return giaban;
	}
	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}
	public int getNamxuatban() {
		return namxuatban;
	}
	public void setNamxuatban(int namxuatban) {
		this.namxuatban = namxuatban;
	}
	public Tacgia getTacgia() {
		return tacgia;
	}
	public void setTacgia(Tacgia tacgia) {
		this.tacgia = tacgia;
	}
      public void intensach() {
    	  System.out.println(this.tensach);
      }

public boolean sosanhnamxuatban(Sach sachkhac) {
	if(this.namxuatban== sachkhac.namxuatban) {
		return true;
	}else {
		return false;
	}
	
}
public double giamgia(double x) {
	return this.giaban*(x/100);
}
}
		
	
      

