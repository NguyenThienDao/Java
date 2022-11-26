public class xeoto extends phuongtiendichuyen {
    private String loainhienlieu;
	public xeoto(String loaiphuongtien, Hangsanxuat hangsanxuat, String loainhienlieu) {
		super(loaiphuongtien, hangsanxuat);
		// TODO Auto-generated constructor stub
		this.loainhienlieu= loainhienlieu;
	}

	@Override
	public void batdau() {
		// TODO Auto-generated method stub
		System.out.println("khoi dong may mat 1p");
	}

	@Override
	public void tangtoc() {
		// TODO Auto-generated method stub
		System.out.println("tang 100km/h trong 3 p");
	}

	@Override
	public void dunglai() {
		// TODO Auto-generated method stub
		System.out.println("dung lai mat 2 p ");
	}

	@Override
	public double layvantoc() {
		// TODO Auto-generated method stub
		return 350;
	}

}
