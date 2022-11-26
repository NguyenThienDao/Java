import java.util.Arrays;

public class Test {
	public static int[] reverse(int[] x) {
		int[] rs= new int[x.length];
		int index=0;
		for (int i =x.length-1; i >=0; i--) {
			rs[index]=x[i];
			index++;
		}
		return rs;
	}
	public static void main(String[] args) {
		int[] a= new int[] {1,6,90,100,3,4,2,8};
		int[] b= new int[15];
		
		//a ban dau 
		System.out.println("a: "+Arrays.toString(a));
		//ham sap xep tang dan Arrays.sort(a)
		Arrays.sort(a);
		System.out.println("a sau khi sap xep: "+Arrays.toString(a));
		//ham tim kiem=> tim kiem vi tri cua so trong mang nhung ham nay sap xep roi moi tim duoc. Arrays.binarySearch(a, 4)
		System.out.println(Arrays.binarySearch(a, 4));
		System.out.println(Arrays.binarySearch(a, -1));
		
		//ham dien gia tri Arrays.fill(b, 5)
		Arrays.fill(b, 5);
		System.out.println("mang b sau khi gan gia tri la 5: "+Arrays.toString(b));
		
		//ham sap xep giam dan 
		Arrays.sort(a);
		a= Test.reverse(a);
		System.out.println("a sau khi sap xep giam dan: "+Arrays.toString(a));
	}

}
