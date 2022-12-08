package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonmodel;

public class LastButtonView extends JFrame{
	private LastButtonmodel lastButtonModel;
	private JLabel jLabel;
	private JLabel jLabel2;
	private JLabel jlay;
	public LastButtonView() {
		this.lastButtonModel = new LastButtonmodel();
		this.init();
	}
	private void init() {
		this.setTitle("Last Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		
		
		JPanel jpanel_Center = new JPanel();
		jpanel_Center.setLayout(new GridLayout(2,2));
		
		//Tao lastButtonListener
		LastButtonListener ls = new LastButtonListener(this);//this la cua so chuong trinh nay 
		//Tao font chu
		Font font= new Font("Arial", Font.BOLD, 15);//lop font chu
		
		//gan font chu
		JButton JB1= new JButton("1");
		JB1.setFont(font);
		JB1.addActionListener(ls);
		
		JButton JB2= new JButton("2");
	    JB2.setFont(font);
	    JB2.addActionListener(ls);
	    
		JButton JB3= new JButton("3");
		JB3.setFont(font);	
		JB3.addActionListener(ls);
		
		JButton JB4= new JButton("4");
		JB4.setFont(font);
		JB4.addActionListener(ls);
		
		jpanel_Center.add(JB1);
		jpanel_Center.add(JB2);
		jpanel_Center.add(JB3);
		jpanel_Center.add(JB4);
		
		
		
		JPanel jpanel_Footer = new JPanel();
	    jlay = new JLabel("------");// khac voi JLabel 'ten' vi khi co jLabel ko thi moi thay doi duoc gia tri
		jlay.setFont(font);
		jpanel_Footer.add(jlay);
		
		JPanel JPup = new JPanel();
		jLabel2 = new JLabel("       ");
		jLabel2.setFont(font);
		JPup.add(jLabel2);
		
		this.setLayout(new BorderLayout());
		
		this.add(jpanel_Center, BorderLayout.CENTER);
		this.add(jpanel_Footer, BorderLayout.SOUTH);
		this.add(JPup, BorderLayout.NORTH);
		
		this.setVisible(true);
	}
	
	public void changto1() {
		this.lastButtonModel.setValue_1();
		jlay.setText("Nút nhất mà bạn vừa nhấn là: "+this.lastButtonModel.getValue());
		this.lastButtonModel.tang();
		jLabel2.setText("Bạn đã nhấn được "+this.lastButtonModel.tang()+" lần.");
	}
	public void changto2() {
		this.lastButtonModel.setValue_2();
		jlay.setText("Nút nhất mà bạn vừa nhấn là: "+this.lastButtonModel.getValue());
		this.lastButtonModel.tang();
		jLabel2.setText("Bạn đã nhấn được "+this.lastButtonModel.tang()+" lần.");
	}
	public void changto3() {
		this.lastButtonModel.setValue_3();
		jlay.setText("Nút nhất mà bạn vừa nhấn là: "+this.lastButtonModel.getValue());
		this.lastButtonModel.tang();
		jLabel2.setText("Bạn đã nhấn được "+this.lastButtonModel.tang()+" lần.");
	}
	public void changto4() {
		this.lastButtonModel.setValue_4();
		jlay.setText("Nút nhất mà bạn vừa nhấn là: "+this.lastButtonModel.getValue());
		this.lastButtonModel.tang();
		jLabel2.setText("Bạn đã nhấn được "+this.lastButtonModel.tang()+" lần.");
	}
	
}
