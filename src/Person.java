/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * The person class will be the person entity that can be taxed which will
 * implement the Taxable interface.
 * 
 * @author Steve Tolvaj
 *
 */

public class Person implements Taxable {

	private String fName;
	private String lName;
	private double income;
	private final int TYPE = 1;

	/**
	 * No-Arg constructor.
	 */
	public Person() {
	}

	/**
	 * Constructor.
	 * 
	 * @param fName  The first name.
	 * @param lName  The last name.
	 * @param income The income.
	 */
	public Person(String fName, String lName, double income) {
		this.setfName(fName);
		this.setlName(lName);
		this.income = income;
	}

	/**
	 * The getIncome method.
	 * 
	 * @return The income.
	 */
	@Override
	public double getIncome() {
		return income;
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
	 * The getfName method.
	 * 
	 * @return The first name.
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * The setFName method.
	 * 
	 * @param fName The first name.
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * The getLName method.
	 * 
	 * @return The last name.
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * The setlName method.
	 * 
	 * @param lName The last name.
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * The toString method.
	 */
	@Override
	public String toString() {
		return "Person [First Name=" + fName + ", Last Name=" + lName + ", Income=" + income + ", TYPE=" + TYPE + "]";
	}

}
