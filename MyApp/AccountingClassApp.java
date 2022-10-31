class Accounting{
	public double valueOfSupply;
	public double vatLate;
	public double expenseRate;
	public void print() {
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend1 : "+getDividend1());
		System.out.println("Dividend2 : "+getDividend2());
		System.out.println("Dividend3 : "+getDividend3());
	}

	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}

	public double getIncome() {
		return valueOfSupply - getExpense();
	}

	private double getExpense() {
		return valueOfSupply*expenseRate;
	}

	private double getTotal() {
		return valueOfSupply + getVAT();
	}

	private double getVAT() {
		return valueOfSupply*vatLate;
	}
}
	
public class AccountingClassApp {
	
	public static void main(String[] args) {
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatLate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();

		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatLate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
	}

}
