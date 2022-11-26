public class maybay extends phuongtiendichuyen{
    private String loainhieulieu;
	public maybay(String loaiphuongtien, Hangsanxuat hangsanxuat, String loainhienlieu) {
		super(loaiphuongtien, hangsanxuat);
		// TODO Auto-generated constructor stub
		this.loainhieulieu= loainhienlieu;
	}

	@Override
	public void batdau() {
		// TODO Auto-generated method stub
		System.out.println("cat canh mat 7 p");
	}

	@Override
	public void tangtoc() {
		// TODO Auto-generated method stub
		System.out.println("tang toc len 1000km/h mat 15 phut ");
	}

	@Override
	public void dunglai() {
		// TODO Auto-generated method stub
		System.out.println("dung lai mat 10 p");
	}

	@Override
	public double layvantoc() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
