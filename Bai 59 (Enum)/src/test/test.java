package test;

public class test {
	public static void main(String[] args) {
		thoikhoabieu tkb1= new thoikhoabieu(day.monday,"toan, ly, hoa");
		thoikhoabieu tkb2= new thoikhoabieu(day.tuesday,"tin, hoa");
		thoikhoabieu tkb3= new thoikhoabieu(day.wednesday,"sinh, su dia");
		System.out.println(tkb1);
		
		int x= Thang.thang_mot.songay();
		System.out.println(x);
		
		
	}

}
