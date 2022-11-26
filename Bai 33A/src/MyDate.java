public class MyDate {
    private int day;
    private int month;
    private int year;
	public MyDate(int d, int m, int y) {
		if(d>= 1 && d<=31) {
			this.day= d;
		}else {
			this.day=1;}
		if(m>= 1 && m<=12) {
			this.month= m;
		}else {
			this.month=1;}
		if(y>= 0) {
			this.year= y;
		}else {
			this.day=1;}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int da) {
		if(da>= 1 && da<=31) {
			this.day= da;
		}else {
			this.day= this.day;}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int mth) {
		if(mth>= 1 && mth<=12) {
			this.month= mth;
		}else {
			this.month= this.month;}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y>=0) {
			this.year= y;
		}else {
			this.year= this.year;
		}
		
	}
@Override
public String toString() {
	return this.day+"/"+this.month+"/"+this.year;
	
}
}
