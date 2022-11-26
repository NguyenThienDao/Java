public class test {
   public static void main(String[] args) {
	MaytinhcasioFX500 mt1=  new MaytinhcasioFX500();
	Maytinhvinacal500 mt2= new Maytinhvinacal500();
	
	System.out.println("150+2079= "+mt1.cong(150, 2079));
	System.out.println("150*2079= "+mt1.nhan(150, 2079));
	System.out.println("150/2079= "+mt1.chia(150, 0));
	
	double[] arr = new double[] {5,1,3,4,5,8,0};
	double[] arr2 = new double[] {6,2,7,9,2,4,5};
	Sapxepchen sxchen = new Sapxepchen();
	Sapxepchon sxchon = new Sapxepchon();
	sxchen.sapxeptang(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"; ");
	}
	System.out.println();
	sxchon.sapxepgiam(arr2);
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+"; ");
	}
	System.out.println();
	System.out.println("Test câu c:");
	Phanmemmaytinh pmmt =new Phanmemmaytinh();
	System.out.println("3+5=" + pmmt.cong(3, 5));
	double[] arr3 = new double[] {6,2,7,9,2,4,5};
	pmmt.sapxeptang(arr3);
	for (int i = 0; i < arr3.length; i++) {
		System.out.print(arr3[i]+" ");
	}
}
}
