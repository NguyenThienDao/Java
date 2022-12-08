package test;

import javax.swing.UIManager;


import model.LastButtonmodel;
import view.LastButtonView;

public class test {
	public static void main(String[] args) {
		new LastButtonView();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new test();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
		
	}
}
