
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatLate;
	public static double expenseRate;
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatLate = 0.1;
		expenseRate = 0.3;
		
		print();
		
		
	}

	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend1 : "+getDividend1());
		System.out.println("Dividend2 : "+getDividend2());
		System.out.println("Dividend3 : "+getDividend3());
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply - getExpense();
	}

	private static double getExpense() {
		return valueOfSupply*expenseRate;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	private static double getVAT() {
		return valueOfSupply*vatLate;
	}

}
