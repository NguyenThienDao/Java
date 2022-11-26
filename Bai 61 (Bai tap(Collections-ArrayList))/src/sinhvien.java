import java.util.Objects;

public class sinhvien implements Comparable<sinhvien> {
	private String masinhvien;
	private String hovaten;
	private int namsinh;
	private double diemtrungbinh;
	public sinhvien(String masinhvien, String hovaten, int namsinh, double diemtrungbinh) {
		this.masinhvien = masinhvien;
		this.hovaten = hovaten;
		this.namsinh = namsinh;
		this.diemtrungbinh = diemtrungbinh;
	}
	@Override
	public String toString() {
		return "sinhvien [masinhvien=" + masinhvien + ", hovaten=" + hovaten + ", namsinh=" + namsinh
				+ ", diemtrungbinh=" + diemtrungbinh + "]";
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
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
	public double getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(double diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	@Override
	public int compareTo(sinhvien o) {
		// TODO Auto-generated method stub
		return this.masinhvien.compareTo(o.masinhvien);
	}
	public sinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(diemtrungbinh);
	}
	
}
