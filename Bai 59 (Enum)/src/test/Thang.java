package test;

public enum Thang {
	thang_mot(31),
	thang_hai(29),
	thang_ba(31),
	thang_tu(30),
	thang_nam(31),
	thang_sau(30),
	thang_bay(31),
	thang_tam(31),
	thang_chin(30),
	thang_muoi(31),
	thang_muoi_mot(30),
	thang_muoi_hai(31);
	
    private final int songay;
	Thang(int songay){
		this.songay= songay;
	}
	public int songay() {
		return songay;
	}
		
	}





