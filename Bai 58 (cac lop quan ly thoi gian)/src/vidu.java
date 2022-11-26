import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.text.SimpleAttributeSet;

public class vidu {
	public static void main(String[] args) {
		//ham lay thoi gian hien tai 
		long t1= System.currentTimeMillis();
		for (int i = 0; i < 1; i++) {
			System.out.println(i+". Test");
		}
		long t2= System.currentTimeMillis();
		System.out.println("truoc khi chay for: "+t1);
		System.out.println("sau khi chay for: "+t2);
		System.out.println("thoi gian chay: "+(t2-t1)+"mls");
		System.out.println("thoi gian chay: "+(t2-t1)/1000+"s");// chia cho 100 de tinh giay con ko chia thi la tinh mili giay
		
		//TimeUnit
		System.out.println("3000 nam: "+TimeUnit.DAYS.toDays(3000*365)+"d");
		System.out.println("25h : "+TimeUnit.DAYS.toDays(25/24)+"d");
		
		// ham Date 
		Date d= new Date(System.currentTimeMillis());
		System.out.println("hom nay la ngay: "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
		
		// calendar 
		Calendar c= Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		// cai nay ngoai le 
		c.add(Calendar.HOUR,30);
		System.out.println("sau khi cong them 30h: "+c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
		
		// DateFormat
		DateFormat df= new SimpleDateFormat();
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(df.format(d));
	}

}