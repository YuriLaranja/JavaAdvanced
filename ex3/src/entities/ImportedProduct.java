package entities;

public class ImportedProduct extends Product{
	private double customsFee;
	public ImportedProduct() {
		super();
	}
	public ImportedProduct(String name, Double price, double customsFee) {
		super(name,price);
		this.customsFee = customsFee;
	}
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee=customsFee;
	}
	@Override
	public double totalValue() {
		return getPrice()+customsFee;
	}
	@Override
	public String priceTag() {
		String c = super.getName()+ " $ "+totalValue()+" (Customs fee: $ "+customsFee+")";
		return c;
	}
}
