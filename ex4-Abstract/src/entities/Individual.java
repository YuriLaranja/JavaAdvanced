package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditues;
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditues) {
		super(name, anualIncome);
		this.healthExpenditues = healthExpenditues;
	}
	
	public Double getHealthExpenditues() {
		return healthExpenditues;
	}

	public void setHealthExpenditues(Double healthExpenditues) {
		this.healthExpenditues = healthExpenditues;
	}
	@Override
	public double tax() {
		double total;
		if(getAnualIncome()<20000.00) {
			total= (getAnualIncome()*0.15)-(healthExpenditues*0.5);
			return total;
		}else{
			total = (getAnualIncome()*0.25)-(healthExpenditues*0.5);
			return total;
		}
	
	}

}
