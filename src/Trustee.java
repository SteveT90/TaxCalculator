/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * The Trustee class extends Person class since a person may have other income
 * and only a person can be a trustee.
 * 
 * @author Steve Tolvaj
 *
 */

public class Trustee extends Person {

	private String trustID;
	private double trustAmount;
	private final int TYPE = 2;

	/**
	 * No-Arg Constructor.
	 */
	public Trustee() {
	}

	/**
	 * Constructor.
	 * 
	 * @param fName       The first name.
	 * @param lName       The last name.
	 * @param income      The income.
	 * @param trustID     The trust ID.
	 * @param trustAmount The trust amount.
	 */
	public Trustee(String fName, String lName, double income, String trustID, double trustAmount) {
		super(fName, lName, income);
		this.setTrustID(trustID);
		this.trustAmount = trustAmount;
	}

	/**
	 * The getTrustAmount method.
	 * 
	 * @return The trust amount.
	 */
	public double getTrustAmount() {
		return trustAmount;
	}

	/**
	 * The getTotalIncome method.
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

	@Override
	public String toString() {
		return "Trustee [First Name=" + getfName() + ", Last Name=" + getlName() + ", Trust ID=" + trustID + ", Trust Amount=" + trustAmount + ", TYPE=" + TYPE +  "]";
	}

}
