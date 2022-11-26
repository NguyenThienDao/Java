
public class Mymath {
public int timmin(int a, int b ) {
	if(a<b) {
		return a;
	}else {return b;}
}
public double timmin(double a, double b ) {
	if(a<b) {
		return a;
	}else {return b;}
}
public double tinhtong(double a, double b) {
	return a+b;
}
public double tinhtong(double[] arr) {
	double tong=0;
	for (int i = 0; i < arr.length; i++) {
	tong= tong+arr[i];
	}
	return tong;
}
}
