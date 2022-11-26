import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class vidu_Borderlayout extends JFrame {
	public vidu_Borderlayout() {
		this.setTitle("vidu_Borderlayout");
		this.setSize(600,400);
		//can giua chuong trinh.
		this.setLocationRelativeTo(null);
		
		//setlayout
		BorderLayout Bl = new BorderLayout();
		//khoang cach giua cac thanh phan
		BorderLayout Bl2= new BorderLayout(50,50);
		 JButton JB1 = new JButton("1");
		 JButton JB2 = new JButton("2");
		 JButton JB3 = new JButton("3");
		 JButton JB4 = new JButton("4");
		 JButton JB5 = new JButton("5");
		  //add thanh phan
		 //this.setLayout(fl);
		 this.setLayout(Bl2);
		 this.add(JB1,BorderLayout.NORTH);
		 this.add(JB2,BorderLayout.SOUTH);
		 this.add(JB3,BorderLayout.EAST);
		 this.add(JB4,BorderLayout.WEST);
		 this.add(JB5,BorderLayout.CENTER);
		 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new vidu_Borderlayout();
	}

}
