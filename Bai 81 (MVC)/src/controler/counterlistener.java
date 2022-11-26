package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counterview;

public class counterlistener implements ActionListener {
	private counterview ctv;
	public counterlistener(counterview ctv) {
		this.ctv  = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nut = e.getActionCommand();
		if (nut=="Tăng") {
			this.ctv.tang();
		}else if (nut=="Giảm") {
			this.ctv.giam();
		}else if (nut=="Cài lại") {
			this.ctv.cailai();
		}
		
	}
	
}
