public class Test {
public static void main(String[] args) {
	MyDate md= new MyDate(31, 1, 2021);
	System.out.println("Day: "+md.getDay());
	md.setDay(8);
	System.out.println("Day: "+md.getDay());
	
	System.out.println("Month: "+md.getMonth());
	md.setMonth(3);
	System.out.println("Month: "+md.getMonth());
	
	System.out.println("Year: "+md.getYear());
	md.setYear(2009);
	System.out.println("Year: "+md.getYear());
}
}
