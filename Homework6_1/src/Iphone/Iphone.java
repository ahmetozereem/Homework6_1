package Iphone;

public class Iphone {
	
	public int fiyat;
	public String model;
	public double ekranBoyutu;
	


	public Iphone() {
		super();
	}
	
	
	public Iphone(int fiyat) {
		super();
		this.fiyat = fiyat;
		this.model="iPhone 12";
		this.ekranBoyutu= 5.6;
	}
	
	public Iphone(String model) {
		super();
		this.model = model;
		this.fiyat=300;
		this.ekranBoyutu = 5;
	}
	

	public Iphone(double ekranBoyutu) {
		super();
		this.ekranBoyutu = ekranBoyutu;
		this.model = "iPhone 12";
		this.fiyat=250;
	}


	public Iphone(int fiyat, String model, double ekranBoyutu) {
		super();
		this.fiyat = fiyat;
		this.model = model;
		this.ekranBoyutu = ekranBoyutu;
	}
	

}
