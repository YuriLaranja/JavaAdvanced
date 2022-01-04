package entities;

import java.util.Date;

public class UsedProduct extends Product {
	private String date;
	public UsedProduct() {
		super();
	}
	public UsedProduct(String name, Double price, String date) {
		super(name,price);
		this.date=date;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	@Override
	public String priceTag() {
		String c = this.getName()+ " (used) $ "+this.getPrice()+"(Manufacture date "+date+")";
		return c;
	}
}
