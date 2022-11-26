public class Test {
public static void main(String[] args) {
	Hangsanxuat hsx1= new Hangsanxuat("hondabay","My");
	Hangsanxuat hsx2= new Hangsanxuat("hondachay","Nga");
	Hangsanxuat hsx3= new Hangsanxuat("hondachienthan","An Do");
	System.out.println("-------------------------CAC LOAI PHUONG TIEN NHAF TUI CO-------------------------");
    maybay mb= new maybay("may bay ", hsx1, "dau");
    System.out.println("phuong tien: "+mb.loaiphuongtien);
    System.out.println("hang san xuat: "+mb.laytenhangsanxuat());
    mb.batdau();mb.tangtoc(); mb.dunglai();mb.layvantoc();
    System.out.println("----------------------------------------------------------------------------------");
    xeoto xeoto= new xeoto("xe oto ", hsx2, "xang");
    System.out.println("phuong tien: "+xeoto.loaiphuongtien);
    System.out.println("hang san xuat"+xeoto.laytenhangsanxuat());
    mb.batdau();mb.tangtoc();mb.dunglai();mb.layvantoc();
    System.out.println("----------------------------------------------------------------------------------");
    xedap xd= new xedap("chay bang com ", hsx3);
    System.out.println("phuong tien: "+xd.loaiphuongtien);
    System.out.println("hang san xuat: "+xd.laytenhangsanxuat());
    mb.batdau();mb.tangtoc(); mb.dunglai();mb.layvantoc();
    
   
    
}
}
