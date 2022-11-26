import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Stack<String> Stackchuoi= new Stack<String>();
		
		// stackchuoi.push("giatri") => đưa giá trị vào stack
		// stackchuoi.pop() => lấy giá trị ra, xóa khỏi stack
		// stackchuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
		// stackchuoi.clear(); => xóa tất cả phần tử trong stack
		// stackchuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
		// stackchuoi.size() => độ lớn của stack
		
		//dao nguoc choi
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		// TITV
		for(int i=0; i<s.length(); i++) {
			Stackchuoi.push(s.charAt(i)+"");
		}
		System.out.println("Chuoi dao nguoc: ");
		for(int i=0; i<s.length(); i++) {
			System.out.print(Stackchuoi.pop());
		}
		
		Stack<String> stacksodu= new Stack<String>();
		//vi du chuyen asng he nhi phan 
		System.out.println("nhap mot so nguyen duong tu ban phim: ");
		int x= sc.nextInt();
		while(x>0) {
			int sodu= x%2;
			System.out.println(sodu);
			stacksodu.push(sodu+"");
			x= x/2; 
		}
		System.out.println("so nhi phan la: ");
		int n= stacksodu.size();
		for (int i = 0; i < n; i++) {
			System.out.print(stacksodu.pop());
		}
	}

}
