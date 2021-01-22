/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * The PayTax class uses static methods to calculate the taxable amount for each
 * taxable entity.
 * 
 * @author Steve Tolvaj
 *
 */
public final class PayTax {

	private static final double CORPORATE_RATE = 0.21D;
//
//	private static final double PERSON_RATE = 0.37D;
//	
//	private static final double TRUST_RATE = 0.39D;

	/*
	 * Tax types are 0 for corporate. 1 for person. 2 for trust. They are final
	 * variables within those objects, use getType to retrieve.
	 */

	// Prevent accidental construction
	private PayTax() {
	}

	/**
	 * The getType method return the type of tax for the corporation.
	 * 
	 * @param t The entity to be taxed.
	 * @return the type
	 */
	public static int getType(Taxable t) {
		return t.getType();
	}

	/**
	 * The taxableAmount method will determine the amount of tax to be payed.
	 * 
	 * @param t The taxable entity.
	 * @return The amount to be taxed.
	 */
	public static double taxableAmount(Taxable t) {
		int type = t.getType();
		double income = t.getIncome();
		switch (type) {
		case 0:
			return income * CORPORATE_RATE;
		case 1:
			return singleFilerTax(income);
		case 2:
			return trusteeTax(income);
		default:
			System.out.println("Check taxpayer types!");
			throw new IllegalArgumentException();
		}
	} // extortCash

	/**
	 * The singleFilerTax method will determine how much tax needs to be paid for a
	 * single filer.
	 * 
	 * @param income The income to tax.
	 * @return The amount of tax to pay.
	 */
	public static double singleFilerTax(double income) {

		double rate;

		if (income <= 9525) {
			rate = 0.1;
		} else if (income <= 38700) {
			rate = 0.12;
		} else if (income <= 82500) {
			rate = 0.22;
		} else if (income <= 157500) {
			rate = 0.24;
		} else if (income <= 200000) {
			rate = 0.32;
		} else if (income <= 500000) {
			rate = 0.35;
		} else {
			rate = 0.37;
		}

		return income * rate;
	}

	/**
	 * The trusteeTax method will calculate the tax to pay for a trustee.
	 * 
	 * @param income The income to tax.
	 * @return The tax to pay.
	 */
	public static double trusteeTax(double income) {
		double tax;
		double excess;

		if (income <= 2550) {
			tax = income * 0.1;
		} else if (income <= 9150) {
			excess = income - 2550;
			tax = (excess * 0.24) + 255;
		} else if (income <= 12500) {
			excess = income - 9150;
			tax = (excess * 0.35) + 1839;
		} else {
			excess = income - 12500;
			tax = (excess * 0.37) + 3011.50;
		}
		return tax;
	}

}
