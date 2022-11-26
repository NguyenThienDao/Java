package test;

import javax.swing.UIManager;

import model.countermodel;
import view.counterview;

public class test {
	public static void main(String[] args) {
		countermodel ct= new countermodel();
		ct.tang();
		ct.tang();
		ct.tang();
		System.out.println(ct.getValue());
		ct.giam();
		System.out.println(ct.getValue());
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new counterview();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}

}
