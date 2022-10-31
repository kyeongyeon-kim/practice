
public class AccountingIFUnder10000App {

	public static void main(String[] args) {
		
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatLate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply*vatLate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1 = income*1;
		double dividend2 = income*0;
		double dividend3 = income*0;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend1 : "+dividend1);
		System.out.println("Dividend2 : "+dividend2);
		System.out.println("Dividend3 : "+dividend3);
		
		
	}

}
