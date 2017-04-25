package core;

public class CD extends Item {
	
	private String band;
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public CD(String title, double price, String band) {
		super(title, price);
		this.band = band;
	}


	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String toString() {
		return "CD [title=" + getTitle() + ", price=" + getPrice() + ", band=" + band + "]";
	}
	
	

}
