/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * The Company class will be any corporation entity and will pay that tax rate.
 * Also implements Taxable interface.
 * 
 * @author Steve Tolvaj
 *
 */
public class Company implements Taxable {

	private String id;
	private double income;
	private final int TYPE = 0;

	/**
	 * No-arg Constructor.
	 */
	public Company() {
	}

	/**
	 * Constructor.
	 * 
	 * @param id The company ID.
	 * @param income The amount of income.
	 */
	public Company(String id, double income) {
		this.setId(id);
		this.income = income;
	}

	/**
	 * The getTotalIncome method.
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
	 * The getID method.
	 * 
	 * @return The Company ID.
	 */
	public String getId() {
		return id;
	}

	/**
	 * The setID method.
	 * 
	 * @param id The company ID.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * The toString method.
	 */
	@Override
	public String toString() {
		return "Company [ID=" + id + ", Income=" + income + ", TYPE=" + TYPE + "]";
	}

}
