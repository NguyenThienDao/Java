import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int d, int m, int y) {
		if(d>=1 && d<=31) {
			this.day= d;
		}else {
			this.day= 1;}
		//--------------------
		if(m>=1 && m<=12) {
			this.month= m;
		}else {
			this.month= m;}
		//--------------------
		if(y>=0) {
			this.year= y;}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int da) {
		if(da>=1 && da<=31) {
			this.day= da;
		}else {
			this.day= day;}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int mont) {
		if(mont>=1 && mont<=12) {
			this.month= mont;
		}else {
			this.month= month;}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		if(y>=0) {
			this.year= year;}
	}
	@Override
	public String toString() {
		return this.day+"/"+this.month+"/"+this.year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if(day == other.day && month == other.month && year == other.year) {
			return true;
		}else {
			return false;
		}
	}

}	

