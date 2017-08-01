/**
 * 
 */
package fr.gtm.proxibanquesi.metier;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author SEBASTIENM
 *
 */
public class BasicAccountTest {

	/**
	 * Test method for {@link fr.gtm.proxibanquesi.metier.BasicAccount#BasicAccount(java.lang.String)}.
	 */
	@Test
	public void testBasicAccount() {
		//fail("Not yet implemented");
		
		BasicAccount ba1 = new BasicAccount(Constants.ACCOUNT_TYPE_ENTERPRISE, null),
				ba2 = new BasicAccount(Constants.ACCOUNT_TYPE_PERSONAL, "2017-07-31"),
				ba3 = new BasicAccount("ACCOUNT_TYPE_UNDEFINED",""),
				ba4 = new BasicAccount(null, "");

		String result = "";
		
		result = ba1.accountType;
		Assert.assertEquals("ERROR BASIC ACCOUNT TYPE", Constants.ACCOUNT_TYPE_ENTERPRISE, result);
		
		result = "" + ba1.accountNumber;
		Assert.assertEquals("ERROR BASIC ACCOUNT NUMBER", "0", result);		
		
		result = ba2.accountType;
		Assert.assertEquals("ERROR BASIC ACCOUNT TYPE", Constants.ACCOUNT_TYPE_PERSONAL, result);
		
		result = "" + ba2.accountNumber;
		Assert.assertEquals("ERROR BASIC ACCOUNT NUMBER", "1", result);		

		result = ba3.accountType;
		Assert.assertEquals("ERROR BASIC ACCOUNT TYPE", Constants.ACCOUNT_TYPE_PERSONAL, result);

		result = "" + ba3.accountNumber;
		Assert.assertEquals("ERROR BASIC ACCOUNT NUMBER", "2", result);		
		
		result = ba4.accountType;
		Assert.assertEquals("ERROR BASIC ACCOUNT TYPE", Constants.ACCOUNT_TYPE_PERSONAL, result); 

		result = "" + ba4.accountNumber;
		Assert.assertEquals("ERROR BASIC ACCOUNT NUMBER", "3", result);		

		result = ba1.creationDate;
		Assert.assertEquals("ERROR BASIC ACCOUNT CREATION DATE", Constants.DEFAULT_CREATION_DATE, result);

		result = ba2.creationDate;
		Assert.assertEquals("ERROR BASIC ACCOUNT CREATION DATE", "2017-07-31", result);

		result = ba3.creationDate;
		Assert.assertEquals("ERROR BASIC ACCOUNT CREATION DATE", Constants.DEFAULT_CREATION_DATE, result);
		
	}

}
