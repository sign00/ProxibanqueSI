/**
 * 
 */
package fr.gtm.proxibanquesi.metier;

/**
 * @author sign00
 *
 */
public class SavingsAccount extends BasicAccount {

	private float savingsRate;
	
	/**
	 * @param ACCOUNT_TYPE
	 * Account type must be a Constant - enterprise or personal
	 * Defaults to personal account type
	 * 
	 * @param creationDate
	 * Creation date format "YYYY-MM-DD" (no check performed)
	 * Defaults to Constants.DEFAULT_CREATION_DATE if left empty
	 */
	public SavingsAccount(String ACCOUNT_TYPE, String creationDate) {
		super(ACCOUNT_TYPE, creationDate);		
	}

	/**
	 * @return savingsRate (percentage) as a decimal lesser than 1.
	 */
	public float getSavingsRate() {
		return savingsRate;
	}

	/**
	 * @param savingsRate (percentage) is a decimal lesser than 1.
	 */
	public void setSavingsRate(float savingsRate) {
		this.savingsRate = savingsRate;
	}
}
