import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class vidu_Gridlayout extends JFrame{
	public vidu_Gridlayout() {
		this.setTitle("vidu_Gridlayout");
		this.setSize(600,400);
		//can giua chuong trinh.
		this.setLocationRelativeTo(null);
		
		//setlayout
		GridLayout Gl = new GridLayout();
		// hien thi 4 hang 4 o
		GridLayout Gl2= new GridLayout(4, 4 );
		// hien thi 4 hang 4 o, va jhang cach cac o la 25 line 
		GridLayout Gl3= new GridLayout(4, 4 , 25, 25);
		
		for (int i = 0; i < 12; i++) {
		     JButton jb= new JButton(i+"");
		     this.add(jb);
		}
		 
		 this.setLayout(Gl3);
		 
		 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new vidu_Gridlayout();
	}

}
