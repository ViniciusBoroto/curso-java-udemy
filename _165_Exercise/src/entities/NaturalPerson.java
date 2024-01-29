package entities;

public class NaturalPerson extends Person {
	private double healthExpenditures;

	public NaturalPerson(String name, double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthSpending() {
		return healthExpenditures;
	}

	public void setHealthSpending(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		Double taxRate = 0.15;
		if (annualIncome > 20000) { taxRate = 0.25; }
		return (annualIncome * taxRate) - (healthExpenditures * 0.5);
	}
	
}
