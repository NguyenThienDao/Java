public class Test {
public static void main(String[] args) {
	Ngay ngay1 = new Ngay(27, 6, 2022);
	Ngay ngay2 = new Ngay(2, 7, 2022);
	Ngay ngay3 = new Ngay(28, 8, 2022);
	//------------------------------------------------------------------------------------------------------
	Quocgia quocgia1 = new Quocgia("hello","My");
	Quocgia quocgia2 = new Quocgia("hello","Anh");
	Quocgia quocgia3 = new Quocgia("hello","Nhat Ban ");
	//------------------------------------------------------------------------------------------------------
	Hangsanxuat hxs1 = new Hangsanxuat("DELL", quocgia1);
	Hangsanxuat hxs2 = new Hangsanxuat("ASUS", quocgia2);
	Hangsanxuat hxs3 = new Hangsanxuat("LeNOVO", quocgia3);
	//------------------------------------------------------------------------------------------------------
	Maytinh mt1 = new Maytinh(hxs1, ngay1, 15000000, 2);
	Maytinh mt2 = new Maytinh(hxs2, ngay2, 17000000, 3);
	Maytinh mt3 = new Maytinh(hxs3, ngay3, 18900000, 3);
	//------------------------------------------------------------------------------------------------------
	//System.out.println("kiem tra mat tinh 1 co mat hon may tinh 2 ko: "+mt1.kiemtragiathaphon(mt2));
	//System.out.println("kiem tra mat tinh 2 co mat hon may tinh 3 ko: "+mt2.kiemtragiathaphon(mt3));
	//System.out.println("kiem tra mat tinh 3 co mat hon may tinh 1 ko: "+mt3.kiemtragiathaphon(mt1));
	//------------------------------------------------------------------------------------------------------
	//System.out.println("thoi gian bao hanh: "+mt1.getThoigianbaohanh()+" nam");
	//System.out.println("thoi gian bao hanh: "+mt2.getThoigianbaohanh()+" nam");
	//System.out.println("thoi gian bao hanh: "+mt3.getThoigianbaohanh()+" nam");
	//------------------------------------------------------------------------------------------------------
	System.out.println("mt1: "+mt1.laytenquocgia());
	System.out.println("mt2: "+mt2.laytenquocgia());
	System.out.println("mt3: "+mt3.laytenquocgia());
	
	
}
}
