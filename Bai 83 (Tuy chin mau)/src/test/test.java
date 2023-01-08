package test;

import javax.swing.UIManager;

import model.mycolormodel;
import view.MyColorView;

public class test {
	public static void main(String[] args) {
		new MyColorView();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new test();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}

}
