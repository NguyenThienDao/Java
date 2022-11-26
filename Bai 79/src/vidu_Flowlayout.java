import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class vidu_Flowlayout extends JFrame {
	public vidu_Flowlayout() {
		this.setTitle("vidu_Flowlayout");
		this.setSize(600,400);
		//can giua chuong trinh.
		this.setLocationRelativeTo(null);
		
		//setlayout
		FlowLayout fl = new FlowLayout();
		//o giua va cac nut cach nhau 50 line 
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,50,50);
		FlowLayout f3 = new FlowLayout(FlowLayout.RIGHT);
		 JButton JB1 = new JButton("1");
		 JButton JB2 = new JButton("2");
		 JButton JB3 = new JButton("3");
		  //add thanh phan
		 //this.setLayout(fl);
		 this.setLayout(f2);
		 this.add(JB1);
		 this.add(JB2);
		 this.add(JB3);
		 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new vidu_Flowlayout();
	}

}
