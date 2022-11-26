public abstract class Hinh {
      protected Toado td;

	public Hinh(Toado td) {
		this.td = td;
	}

	public Toado getTd() {
		return td;
	}

	public void setTd(Toado td) {
		this.td = td;
	}
	public abstract double tinhdientich();
}
