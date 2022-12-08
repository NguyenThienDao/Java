package model;

public class LastButtonmodel {
	private int value;
	private int giatri;

	public LastButtonmodel() {
		this.value = 1;
		this.giatri=0;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public void setValue_1() {
		this.setValue(1);
	}
	public void setValue_2() {
		this.setValue(2);
	}
	public void setValue_3() {
		this.setValue(3);
	}
	public void setValue_4() {
		this.setValue(4);
	}

	public int getGiatri() {
		return giatri;
	}

	public void setGiatri(int giatri) {
		this.giatri = giatri;
	}
	public int tang() {
		return giatri++/2+1;
	}

}
