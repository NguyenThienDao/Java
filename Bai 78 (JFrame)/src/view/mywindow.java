package view;

import javax.swing.JFrame;

public class mywindow extends JFrame {
	public mywindow() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void showchishow() {
		this.setVisible(true);
	}
	public void showcanten(String ten) {
		this.setTitle(ten);
		this.setVisible(true);
	}
	public void showcantenvatoado(String ten, int y, int x) {
		this.setTitle(ten);
		this.setSize(y, x);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		mywindow my1= new mywindow();
		my1.showchishow();
		
		mywindow my2= new mywindow();
		my2.showcanten("Vi du");
		
		mywindow my3= new mywindow();
		my3.showcantenvatoado("vidu", 450,250);
	}

}
