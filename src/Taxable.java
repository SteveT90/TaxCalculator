/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * The Taxable interface will require each Taxable object to have a getIncome
 * and getType method and will also help mark them as taxable. These two methods
 * are required to use the static methods in the PayTax class.
 * 
 * @author Steve Tolvaj
 *
 */
public interface Taxable {
	
	/**
	 * The getIncome method.
	 * 
	 * @return The total income of the taxable entity.
	 */
	public double getIncome();

	/**
	 * The getType method.
	 * @return The type and rate of tax that will be payed.
	 */
	public int getType();
	
	/**
	 * The getTrust method.
	 * return The amount of the trust.
	 */
	
}
