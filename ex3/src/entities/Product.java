package entities;

import exceptions.ProductException;

public class Product {
	private String name;
	private Double price;
	
	public Product () {	
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public double totalValue() {
		return price;
	}
	public String priceTag() {
		String c = name+ " $ "+price;
		return c;
	}
	public void validateProduct(Double price) {
		if(price<=0) {
			throw new ProductException("Price invalid");
		}
	
	}
}
