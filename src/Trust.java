/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * The Trust class will either be created on its own or will be used by the company or
 * person classes as they can also have a trust.
 * 
 * @author Steve Tolvaj
 *
 */

public class Trust implements Taxable {

	private String fName;
	private String lName;
	private String trustID;
	private double trustAmount = 0;
	private final int TYPE = 2;

	/**
	 * No-Arg Constructor.
	 */
	public Trust() {
	}

	/**
	 * Constructor.
	 * 
	 * @param fName       The first name.
	 * @param lName       The last name.
	 * @param trustID     The trust ID.
	 * @param trustAmount The trust amount.
	 */
	public Trust(String fName, String lName, String trustID, double trustAmount) {
		this.fName = fName;
		this.lName = lName;
		this.setTrustID(trustID);
		this.trustAmount = trustAmount;
	}

	/**
	 * The getTrustAmount method. Will return 0 since the get trust amount method
	 * will only be used if a trust is inherited to a person or company.
	 * Use getIncome for a trust only scenario.
	 * @return The trust amount.
	 */

	public double getTrustAmount() {
		return 0;
	}

	/**
	 * The getIncome method.
	 * Used when trust created on its own.
	 * 
	 * @return The total income.
	 */
	@Override
	public double getIncome() {
		return trustAmount;
	}

	/**
	 * The getType method.
	 * 
	 * @return The type of tax to pay.
	 */
	@Override
	public int getType() {
		return TYPE;
	}

	/**
	 * The getTrustID method.
	 * 
	 * @return The trust ID.
	 */
	public String getTrustID() {
		return trustID;
	}

	/**
	 * The setTrustID method.
	 * 
	 * @param trustID The trust ID.
	 */
	public void setTrustID(String trustID) {
		this.trustID = trustID;
	}

	/**
	 * The getfName method.
	 * 
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * The setfName method.
	 * 
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * The getlName method.
	 * 
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * The setlName method.
	 * 
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * The setTrustAmount method.
	 * 
	 * @param trustAmount the trustAmount to set
	 */
	public void setTrustAmount(double trustAmount) {
		this.trustAmount = trustAmount;
	}

	/**
	 * The toString method.
	 */

	@Override
	public String toString() {
		String str = String.format("%-12s %-10s %-10s $%-15.2f %-8d", "Trustee:", lName, trustID, trustAmount, TYPE);
		return str;
	}

}
