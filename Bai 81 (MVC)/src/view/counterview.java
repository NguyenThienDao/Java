package view;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controler.counterlistener;
import model.countermodel;

public class counterview extends JFrame {
	private countermodel countermodel;
	private JButton JB_up;
	private JButton JB_down;
	private JLabel LB_Center;
	private JButton JB_reset;
	
	public counterview() {
		this.countermodel= new countermodel();
		this.init();
		this.setVisible(true);
	}
	public void init() {
		this.setTitle("Đếm Số");
		this.setSize(300,300);
		this.setLocale(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		counterlistener ac = new counterlistener(this);
		
		JB_up = new JButton("Tăng");
		JB_up.addActionListener(ac);
		JB_down = new JButton("Giảm");
		JB_down.addActionListener(ac);
		LB_Center = new JLabel(this.countermodel.getValue()+"",JLabel.CENTER);
		JB_reset = new JButton("Cài lại");
		JB_reset.addActionListener(ac);
		JPanel JP = new JPanel();
		JP.setLayout(new BorderLayout());
		JP.add(JB_up,BorderLayout.EAST);
		JP.add(JB_down,BorderLayout.WEST);
		JP.add(LB_Center,BorderLayout.CENTER);
		JP.add(JB_reset,BorderLayout.SOUTH);
		
		this.setLayout(new BorderLayout());
		this.add(JP,BorderLayout.CENTER);
		
	}
	public void tang() {
		//tang
		this.countermodel.tang();
		//roi lay gia tri
		this.LB_Center.setText(this.countermodel.getValue()+"");
	}
	public void giam() {
		//giamz
		this.countermodel.giam();
		//roi lay gia tri
		this.LB_Center.setText(this.countermodel.getValue()+"");
	}
	public void cailai() {
		this.countermodel.reset();
		this.LB_Center.setText(this.countermodel.getValue()+"");
	}
}
