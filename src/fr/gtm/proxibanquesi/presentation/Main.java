/**
 * 
 */
package fr.gtm.proxibanquesi.presentation;

import fr.gtm.proxibanquesi.metier.Accounts;
import fr.gtm.proxibanquesi.metier.BasicAccount;
import fr.gtm.proxibanquesi.metier.Client;
import fr.gtm.proxibanquesi.metier.Constants;
import fr.gtm.proxibanquesi.metier.CurrentAccount;
import fr.gtm.proxibanquesi.metier.SavingsAccount;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;


/**
 * @author SEBASTIENM
 *
 */
public class Main {

	public static Accounts accounts;
	/**
	 * Default constructor does nothing
	 */
	public Main() {
		
	}

	public static void AccountCreation(Scanner keyboard) {
		
		if(keyboard == null)
			return;
		
		boolean exit = false;
		String text = "";
		int numero = 0;
		
		String surName = "", firstName = "", address = "", zipCode = "", city = "", telephone = "";
		
		Client c = null;
		
		do {			
			// Last Name
/*			System.out.println("Saisissez votre nom de famille puis appuyez sur la touche entrée pour valider");
			System.out.println("ou sur '*' à tout moment pour revenir au menu principal: ");
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			surName = text;
			System.out.println("Nom:......................" + text);
			
			// First Name
			System.out.println("Saisissez votre prénom puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
				
			firstName = text;
			System.out.println("Prénom:......................" + text);
			
			// City
			System.out.println("Saisissez votre ville puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
				
			city = text;
			System.out.println("Ville:......................" + text);
			
			// Zip code
			System.out.println("Saisissez votre code postal puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			zipCode = text;
			System.out.println("Code postal:......................" + text);
			
			// Address
			System.out.println("Saisissez votre adresse puis appuyez sur la touche espace et 'plus' (+)  pour valider\n");			
			
			text = "";
			do {				
				String k = keyboard.next();
								
				if(k.startsWith("*")) {
					System.out.println("Retour au menu principal\n");
					return;
				} 
				
				String t = " " + k;
				if(k.endsWith("+")) {
					//System.out.println("Fin adresse\n");
					keyboard.nextLine();
					break;
				} 

				text = text + " " + k;					
				
			} while(keyboard.hasNext());
					
			address = text;
			System.out.println("Adresse:......................" + text);
			
			// Telephone
			System.out.println("Saisissez votre numéro de téléphone puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			telephone = text;
			System.out.println("Téléphone:......................" + text);
			
			c = new Client(surName, firstName, address, zipCode, city, telephone);
*/
			c = new Client("Malbranche", "Sébastien", "Place St Etienne", "31000", "Toulouse", "0612345678");
						
			ArrayList<BasicAccount> alist = new ArrayList<BasicAccount>();
			BasicAccount ba = null;
			
			do {				
				// Account type
				System.out.println("Saisissez '1' pour un compte personnel ou '2' pour un compte d'entreprise ou '*' pour terminer la création de comptes ");
				
				String accountType = Constants.ACCOUNT_TYPE_PERSONAL;
				text = keyboard.next();
				
				if(text.startsWith("1")) {
					
					System.out.println("Création de compte personnel\n");
					accountType = Constants.ACCOUNT_TYPE_PERSONAL;
									
				} else if(text.startsWith("2")) {
					
					System.out.println("Création de compte d'entreprise\n");
					accountType = Constants.ACCOUNT_TYPE_ENTERPRISE;
				} 
				else if(text.startsWith("*")) {
					System.out.println("Retour au menu principal\n");
					return;
				}				
				
				do {
					System.out.println("Saisissez 3 pour un compte courant ou 4 pour un compte d'épargne ou 0 pour revenir au menu précédent");
				
					text = keyboard.next();
					if(text.startsWith("3")) {
											
						ba = new CurrentAccount(accountType, "2017-08-01");
						alist.add(ba);					
						System.out.println("Création de " + ba.getAccountType() + " no. " + ba.getAccountNumber());
						
										
					} else if(text.startsWith("4")) {
						
						ba = new SavingsAccount(accountType, "2017-08-01");
						alist.add(ba);
						System.out.println("Création de " + ba.getAccountType() + " no. " + ba.getAccountNumber());
						
					} else if(text.startsWith("0")) {
						
						if(c != null && alist != null)
							if(alist.isEmpty() == false)
								accounts.put(c, alist);
						
						System.out.println("Fin de création de comptes\n");
						break;				
					} 
					else if(text.startsWith("*")){
						
						if(c != null && alist != null)
							if(alist.isEmpty() == false)
								accounts.put(c, alist);
						
						System.out.println("Retour au menu principal\n");
						return;
					}								
					
				} while (text.startsWith("0") == false);
											
			} while(text.startsWith("*") == false);
			
		} while(text.startsWith("*") == false);
	}
	
public static void MakeTransfer(Scanner keyboard) {
		
		if(keyboard == null)
			return;
		
		boolean exit = false;
		String text = "";
		int numero = 0;
		
		String surName = "", firstName = "";
		String originAccountNumber = "", targetAccountNumber = "";//, address = "", zipCode = "", city = "", telephone = "";
		BasicAccount originAccount = null, targetAccount = null;
				
		do {			
			// Last Name
			System.out.println("Saisissez votre nom de famille puis appuyez sur la touche entrée pour valider");
			System.out.println("ou sur '*' à tout moment pour revenir au menu principal: ");
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			surName = text;
			System.out.println("Nom:......................" + text);
			
			// First Name
			System.out.println("Saisissez votre prénom puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
				
			firstName = text;
			System.out.println("Prénom:......................" + text);
						
			if(accounts != null) {
				
				Enumeration<ArrayList<BasicAccount>> elements = accounts.elements();
				Enumeration<Client> keys = accounts.keys();
				
				BasicAccount ba = null;
				
				while(keys.hasMoreElements()) {
					
					Client e = keys.nextElement();
					ArrayList<BasicAccount> l = elements.nextElement();					
					
					Iterator<BasicAccount> i = l.iterator();
					while(i.hasNext()) {
						
						ba = i.next();
						
						if(e.getSurName().compareTo(surName) == 0 && e.getFirstName().compareTo(firstName) == 0) {
							System.out.println("\nVeuillez valider le compte débiteur suivant 'y' ou affichez le compte suivant 'n'\n");
							System.out.println(surName + " " + firstName);
							System.out.println(ba.getAccountType() + " " + ba.getAccountNumber() + "\n");
							
							text = keyboard.next();
							if(text.equals("y")) 
								break;
						}
					}
				}
			}
			  
			
/*			
			// Origin account
			System.out.println("Saisissez le numéro de compte débiteur puis appuyez sur la touche entrée pour valider");
			System.out.println("ou sur '*' à tout moment pour revenir au menu principal: ");
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			originAccountNumber = text;
			
			
			
			System.out.println("Numéro de compte débiteur:......................" + text);
			
			
			
			// Target account
			System.out.println("Saisissez le numéro de compte bénéficiaire puis appuyez sur la touche entrée pour valider");
			System.out.println("ou sur '*' à tout moment pour revenir au menu principal: ");
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			targetAccountNumber = text;
			System.out.println("Numéro de compte débiteur:......................" + text);
			
			// City
			System.out.println("Saisissez votre ville puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
				
			city = text;
			System.out.println("Ville:......................" + text);
			
			// Zip code
			System.out.println("Saisissez votre code postal puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			zipCode = text;
			System.out.println("Code postal:......................" + text);
			
			// Address
			System.out.println("Saisissez votre adresse puis appuyez sur la touche espace et 'plus' (+)  pour valider\n");			
			
			text = "";
			do {				
				String k = keyboard.next();
								
				if(k.startsWith("*")) {
					System.out.println("Retour au menu principal\n");
					return;
				} 
				
				String t = " " + k;
				if(k.endsWith("+")) {
					//System.out.println("Fin adresse\n");
					keyboard.nextLine();
					break;
				} 

				text = text + " " + k;					
				
			} while(keyboard.hasNext());
					
			address = text;
			System.out.println("Adresse:......................" + text);
			
			// Telephone
			System.out.println("Saisissez votre numéro de téléphone puis appuyez sur la touche entrée pour valider\n");			
			
			text = keyboard.next();
			if(text.startsWith("*")) {
				System.out.println("Retour au menu principal\n");
				return;
			}
					
			telephone = text;
			System.out.println("Téléphone:......................" + text);
			
			c = new Client(surName, firstName, address, zipCode, city, telephone);

			Client c = new Client("Malbranche", "Sébastien", "Place St Etienne", "31000", "Toulouse", "0612345678");
			
			// Account type
			System.out.println("Saisissez 1 pour un compte personnel ou 2 pour un compte d'entreprise");			
			
			String accountType = Constants.ACCOUNT_TYPE_PERSONAL;
			text = keyboard.next();
			
			if(text.startsWith("1")) {
				
				System.out.println("Création de compte personnel\n");
				accountType = Constants.ACCOUNT_TYPE_PERSONAL;
								
			} else if(text.startsWith("2")) {
				
				System.out.println("Création de compte d'entreprise\n");
				accountType = Constants.ACCOUNT_TYPE_ENTERPRISE;
			} 
			else {
				System.out.println("Retour au menu principal\n");
				return;
			}
							
			BasicAccount ba = null;
			System.out.println("Saisissez 1 pour un compte courant ou 2 pour un compte d'épargne");
			text = keyboard.next();
			if(text.startsWith("1")) {
				
				System.out.println("Création de compte courant\n");
				ba = new CurrentAccount(accountType, "2017-08-01");
								
			} else if(text.startsWith("2")) {
				
				System.out.println("Création de compte d'épargne\n");
				ba = new SavingsAccount(accountType, "2017-08-01");				
			} 
			else {
				System.out.println("Retour au menu principal\n");
				return;
			}			
					
			if(c != null && ba != null)
				accounts.put(c, ba);
			*/
			exit = true;
		
		} while(exit == false);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
					
		accounts = new Accounts();
		
		boolean exit = false;
		int numero = 0;
		
		Scanner keyboard = new Scanner(System.in);			
		
		do {
			
			if(numero == 0) {
				
				System.out.println("Créer un compte......................1");
				System.out.println("Effectuer un virement................2");
				System.out.println("Terminer.............................3");
			}
						
			numero = keyboard.nextInt();
			
				switch(numero) {
				
				case 1:
					System.out.println("Création de compte......................");
					Main.AccountCreation(keyboard);
					numero = 0;					
					break;
				case 2:
					System.out.println("Virement.....................");
					Main.MakeTransfer(keyboard);
					numero = 0;		
					break;
				case 3:
					System.out.println("Fin des opérations................");
					keyboard.close();
					return;
				default:
					numero = 0;
					break;				
				}
		
		} while(exit == false);
		
		keyboard.close();
/*		
		System.out.print("Donner le solde du compte: ");
		float solde = keyboard.nextFloat();
		Compte compte = new Compte();
		compte.setCode(numero);
		compte.setSolde(solde);
		System.out.println(compte);
		keyboard.close(); 
		
		
		
		Client c1 = new Client("Dupont", "Jean", "Place Saint Michel", "31000", "Toulouse", "0612345678");
		Client c2 = new Client("Dubois", "Paul", "Place du Capitole", "31000", "Toulouse", "0634567890");
		
		CurrentAccount ca1 = new CurrentAccount(Constants.ACCOUNT_TYPE_PERSONAL, "2017-08-01");
		ca1.setAccounts(accounts);
		ca1.setAccountBalance(2000.f);
		
		
		CurrentAccount ca2 = new CurrentAccount(Constants.ACCOUNT_TYPE_PERSONAL, "2017-08-01");
		ca2.setAccounts(accounts);
		ca1.setAccountBalance(1500.f);
		
		accounts.add(ca1);
		accounts.add(ca2);
		
		ca1.transferMoney("2", 200.f);
		*/
	/*	Client c1 = new Client(), c2 = new Client(), c3 = new Client();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3); 
		*/
	}

}
