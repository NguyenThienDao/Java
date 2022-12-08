package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener {
	private LastButtonView lastButtonView;

	public LastButtonListener(LastButtonView lastButtonView) {
		this.lastButtonView = lastButtonView;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sukien= e.getActionCommand();
		if (sukien=="1") {
			this.lastButtonView.changto1();
		}else if (sukien=="2") {
			this.lastButtonView.changto2();
		}else if (sukien=="3") {
			this.lastButtonView.changto3();
	    }else if (sukien=="4") {
			this.lastButtonView.changto4();
	    }
	}
}
