/**
 * 
 */
package fr.gtm.proxibanquesi.metier;

/**
 * @author sign00
 *
 */
public class CurrentAccount extends BasicAccount {

	/**
	 * Default authorizedOverdraft is 1000 Euros
	 */
	private float authorizedOverdraft = 1000.f;
	
	/**
	 * @param ACCOUNT_TYPE
	 * Account type must be a Constant - enterprise or personal
	 * Defaults to personal account type
	 * 
	 * @param creationDate
	 * Creation date format "YYYY-MM-DD" (no check performed)
	 * Defaults to Constants.DEFAULT_CREATION_DATE if left empty
	 */
	public CurrentAccount(String ACCOUNT_TYPE, String creationDate) {
		super(ACCOUNT_TYPE, creationDate);		
	}

	public float getAuthorizedOverdraft() {
		return authorizedOverdraft;
	}

	public void setAuthorizedOverdraft(float authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}
	
}
