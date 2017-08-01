/**
 * 
 */
package fr.gtm.proxibanquesi.metier;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author Adminl
 *
 */
public class Accounts extends Hashtable<Client, ArrayList<BasicAccount>> {

/*	
	public BasicAccount findAccount(String accountNumber) {
		
		BasicAccount ba = null;
		
		if(accountNumber == null)
			return null;
		
		if(accountNumber.isEmpty())
			return null;
		
		Iterator<BasicAccount> i = this.iterator();
		while(i.hasNext()) {
			ba = i.next();
			
			if(ba.getAccountNumber() == accountNumber)
				return ba;			
		}
		
		return null;
	}
	
	public Accounts() {
		super();
	}
	*/
}
