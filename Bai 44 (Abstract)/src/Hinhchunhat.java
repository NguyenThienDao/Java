public class Hinhchunhat extends Hinh{
     private double chieurong;
     private double chieucao;
	public Hinhchunhat(Toado td, double chieurong, double chieucao) {
		super(td);
		// TODO Auto-generated constructor stub
		this.chieurong= chieurong;
		this.chieucao= chieucao;
		
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}
	public double getChieucao() {
		return chieucao;
	}
	public void setChieucao(double chieucao) {
		this.chieucao = chieucao;
	}
	@Override
	public double tinhdientich() {
		// TODO Auto-generated method stub
		return this.chieurong*this.chieucao;
	}

}
