package view;

import javax.swing.JFrame;

public class vidu {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		// Gắn tên
		jf.setTitle("Ví Dụ JFrame");
		// Gán kích cỡ
		jf.setSize(600,400);
		
		// Gán vị trí hiển thị
		jf.setLocation(450, 250);
		
	    // Thoát ra khỏi chương trình khi đóng cửa sổ JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Cho phép hiển thị
		jf.setVisible(true);

	}

}
