import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator extends JFrame {
	public Calculator() {
		// TODO Auto-generated constructor stub
		this.setTitle("Máy Tính");
		this.setSize(300,400);
		this.setLocale(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField JT= new JTextField(100);
		JPanel JP = new JPanel();
		JP.setLayout(new BorderLayout());
		JP.add(JT, BorderLayout.CENTER);
	
		JButton JB0 = new JButton("0");
		JButton JB1 = new JButton("1");
		JButton JB2 = new JButton("2");
		JButton JB3 = new JButton("3");
		JButton JB4 = new JButton("4");
		JButton JB5 = new JButton("5");
		JButton JB6 = new JButton("6");
		JButton JB7 = new JButton("7");
		JButton JB8 = new JButton("8");
		JButton JB9 = new JButton("9");
		JButton JB_cong = new JButton("+");
		JButton JB_tru = new JButton("-");
		JButton JB_nhan = new JButton("*");
		JButton JB_chia = new JButton("/");
		JButton JB_bang = new JButton("=");
		JPanel JPN = new JPanel();
		JPN.setLayout(new GridLayout(5,5));
		JPN.add(JB0);
		JPN.add(JB1);
	    JPN.add(JB2);
		JPN.add(JB3);
		JPN.add(JB4);
		JPN.add(JB5);
		JPN.add(JB6);
		JPN.add(JB7);
		JPN.add(JB8);
		JPN.add(JB9);
		JPN.add(JB_cong);
		JPN.add(JB_tru);
		JPN.add(JB_nhan);
		JPN.add(JB_chia);
		JPN.add(JB_bang);
		
		this.setLayout(new BorderLayout());
		this.add(JP, BorderLayout.NORTH);
		this.add(JPN,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		try {
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new Calculator();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
		
	}
}