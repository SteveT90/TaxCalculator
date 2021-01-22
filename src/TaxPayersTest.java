/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/12/2020
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Steve Tolvaj
 * IRS Tax Assignment
 * CISC-213
 * 04/20/2020
 */

/**
 * The TaxTest class test class reads some taxable entities from a file and
 * prints the details with the amount to be taxed.
 * 
 * @author Steve Tolvaj
 *
 */

public class TaxPayersTest {

	/**
	 * Main method
	 * 
	 * @param args Command line args.
	 */
	public static void main(String[] args) {
		TaxPayersTest test = new TaxPayersTest();
		test.loadFile("taxpayers.csv");
		System.out.println(test.toString());

	}

	// List to store taxpayers from file.
	List<Taxable> taxPayer;

	/**
	 * The loadFile method loads the tax payer file into the list.
	 * 
	 * @param file The file name.
	 */
	public void loadFile(String file) {
		taxPayer = new ArrayList<>();
		try {
			Scanner inputFile = new Scanner(new File(file));
			String temp;
			int type;

			while (inputFile.hasNextLine()) {
				temp = inputFile.nextLine();
				type = Integer.parseInt(temp.substring(0, temp.indexOf(",")));
				// Check what type of taxpayer(depends on first number of each line in file).
				if (type == 0) {
					addCompany(temp);
				} else if (type == 1) {
					addPerson(temp);
				} else if (type == 2) {
					addTrustee(temp);
				} else {
					System.out.println("This type of taxpayer is not supported yet!");
				}
			}
			inputFile.close();

		} catch (FileNotFoundException e) {
			System.out.println("File was not found.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("One or more of the taxpayer type fields are not a valid integer.");
		}
	}

	/**
	 * The addPerson method adds a person type object to the list.
	 * 
	 * @param str The line from the file that needs to be split up.
	 */
	public void addPerson(String str) {
		String[] temp = str.split(",");
		try {
			Taxable person = new Person(temp[1], temp[2], Double.parseDouble(temp[3]));
			taxPayer.add(person);
		} catch (NumberFormatException e) {
			System.out.println("The income for " + temp[1] + " " + temp[2] + " is not a valid number.");
		}
	}

	/**
	 * The addTrustee method adds a trustee type object to the list.
	 * 
	 * @param str The line from the file that needs to be split up.
	 */
	public void addTrustee(String str) {
		String[] temp = str.split(",");
		try {
			Taxable trustee = new Trustee(temp[1], temp[2], Double.parseDouble(temp[3]), temp[4],
					Double.parseDouble(temp[5]));
			taxPayer.add(trustee);
		} catch (NumberFormatException e) {
			System.out.println("The income for " + temp[1] + " " + temp[2] + " is not a valid number.");
		}
	}

	/**
	 * The addCompany method adds a company type object to the list.
	 * 
	 * @param str The line from the file that needs to be split up.
	 */
	public void addCompany(String str) {
		String[] temp = str.split(",");
		try {
			Taxable company = new Company(temp[1], Double.parseDouble(temp[2]));
			taxPayer.add(company);
		} catch (NumberFormatException e) {
			System.out.println("The income for " + temp[1] + " is not a valid number.");
		}
	}

	/**
	 * The toString method.
	 */
	@Override
	public String toString() {
		// Iterate through and print the details.
		ListIterator<Taxable> iterator = taxPayer.listIterator();
		StringBuilder str = new StringBuilder();
		while (iterator.hasNext()) {
			Taxable t = iterator.next();
			str.append(t + " Tax to pay = ");
			str.append(PayTax.taxableAmount(t) + "\n");
		}
		return str.toString();
	}

}
