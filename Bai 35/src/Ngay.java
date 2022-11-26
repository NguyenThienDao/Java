public class Ngay {
	private int day;
	private int month;
	private int year;
	public Ngay(int d, int m, int y) {
		if(d>= 1 && d<=31) {
			this.day = d;
		}else {
			this.day= this.day;}
		if(m>= 1 && m<=12) {
			this.month = m;
		}else {
			this.month = this.month ;}
		if(y>= 0) {
			this.year = y;
		}else {
			this.year = this.year;}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int d) {
		if(d>= 1 && d<=31) {
			this.day = d;
		}else {
			this.day= this.day;}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int m) {
		if(m>= 1 && m<=12) {
			this.month = m;
		}else {
			this.month = this.month ;}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y>= 0) {
			this.year = y;
		}else {
			this.year = this.year;}
	}
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
		
	}
	}
	

