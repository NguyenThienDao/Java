import java.util.Random;
import java.util.Scanner;

public class Game_tai_xiu {
	public static void main(String[] args) {
		double taikhoannguoichoi=5000;
		Scanner sc= new Scanner(System.in);
		int luachon=1;
		
		do {
			System.out.println("-------Moi Ban Lua Chon-------");
			System.out.println("chon 1 de tiep tuc choi. ");
			System.out.println("chon phim bat ki de thoat. ");
			luachon= sc.nextInt();
			if(luachon==1) {
			System.out.println("**** Bat Dau Choi.");
			System.out.println("*****Tai khoan hien tai cua ban la: "+taikhoannguoichoi+" Ban muon cuoc bao nhieu");
		   
			// dat cuoc
			double datcuoc;
			do {
				System.out.println("****Dat Cuoc.(0, so tien cuoc<= "+taikhoannguoichoi+":");
			datcuoc=sc.nextDouble();
			} while (datcuoc <= 0 || datcuoc > taikhoannguoichoi);
			
			//lua chon tai xiu
			int luachontaixiu= 0;
			do {
				System.out.println("****Chon: 1 la Tai, 2 la xiu");
				luachontaixiu= sc.nextInt();
				
			} while (luachontaixiu!= 1&&luachontaixiu!=2);
			
			//tung xuc xac
			Random xx1= new Random();
			Random xx2= new Random();
			Random xx3= new Random();
			
			int giatri1=xx1.nextInt(5)+1;
			int giatri2=xx1.nextInt(5)+1;
			int giatri3=xx1.nextInt(5)+1;
			int tong= giatri1+giatri2+giatri3;
			//ketqua
			System.out.println("****ket qua: "+giatri1+"-"+giatri2+"_"+giatri3);
			if(tong==3 || tong==18 ) {
				taikhoannguoichoi= taikhoannguoichoi-datcuoc;
				System.out.println("****Ket qua: "+tong+" ban da thua, nha cai an het ");
			    System.out.println("tai khoan hien tai la: "+taikhoannguoichoi); 
			    }else(tong>=4 && tong<= 10) {
			    	System.out.println("****ket qua: "+tong+" =>Xiu");}
			    if(luachontaixiu == 2) {
			    	taikhoannguoichoi+= datcuoc;
			    	System.out.println("****Ban da thang!");
			    	System.out.println("****tai khoan hien tai la: "+taikhoannguoichoi);
			    }else(luachontaixiu == 1){
			    	taikhoannguoichoi-= datcuoc;
			    	System.out.println("****Ban da thua!");
			    	System.out.println("****tai khoan hien tai la: "+taikhoannguoichoi);
			    }
			    

		}
		} while (luachon!=1);
		
		
		
		}
	}


