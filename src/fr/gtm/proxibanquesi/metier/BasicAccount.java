/**
 * 
 */
package fr.gtm.proxibanquesi.metier;

/**
 * @author SEBASTIENM
 *
 */
public class BasicAccount {

	private static int nextAvailableAccountNumber;
	
	protected final String accountNumber;	
	protected final String creationDate;	
	protected final String accountType;
	protected float accountBalance;
	
	/**
	 * @param ACCOUNT_TYPE
	 * Account type must be a Constant - enterprise or personal
	 * Defaults to personal account type
	 * 
	 * @param creationDate
	 * Creation date format "YYYY-MM-DD" (no check performed)
	 * Defaults to Constants.DEFAULT_CREATION_DATE if left empty
	 */
	public BasicAccount(String ACCOUNT_TYPE, String creationDate) {
		super();
		
		if(BasicAccount.nextAvailableAccountNumber < 0)
			BasicAccount.nextAvailableAccountNumber = 0;
		
		// Concatenation with "" necessary in order to create String and cast int
		accountNumber = "" + BasicAccount.nextAvailableAccountNumber++;
				
		if(ACCOUNT_TYPE == null)
			accountType = Constants.ACCOUNT_TYPE_PERSONAL;
		else if(ACCOUNT_TYPE == Constants.ACCOUNT_TYPE_ENTERPRISE)
			accountType = Constants.ACCOUNT_TYPE_ENTERPRISE;
		else
			accountType = Constants.ACCOUNT_TYPE_PERSONAL;
		
		if(creationDate == null)
			this.creationDate = Constants.DEFAULT_CREATION_DATE;
		//si pas de saisie, juste ""//
		else if(creationDate.isEmpty())
			this.creationDate = Constants.DEFAULT_CREATION_DATE;
		else 
			this.creationDate = creationDate;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}	

	/**
	 * @return the accountBalance
	 */
	public float getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}


	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}	
	
	
}
