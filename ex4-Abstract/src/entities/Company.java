package entities;

public class Company extends TaxPayer{
	
	private int numberOfEmployees;
	public Company() {
		super();
	}
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override
	public double tax() {
		double total;
		if(numberOfEmployees>10) {
			total=getAnualIncome()*0.14;
			return total;
		}else {
			total=getAnualIncome()*0.16;
			return total;
		}
	}

}
