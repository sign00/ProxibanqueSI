/**
 * 
 */
package fr.gtm.proxibanquesi.metier;

/**
 * @author SEBASTIENM
 *
 */
public class Client {

	private int clientID;

	private static int nextAvailableClientID;
	
	private String surName;
	private String firstName;
	private String address;
	private String zipCode;
	private String city;
	private String telephone;
	
	/**
	 * Default constructor only initializes client ID
	 */
	public Client() {
		
		setClientID();
	}

	/**
	 * Constructor
	 * @param surName
	 */
	public Client(String surName) {
		super();
		
		setClientID();
		this.surName = surName;
	}
		
	/**
	 * Constructor
	 * @param surName
	 * @param firstName
	 * @param address
	 * @param zipCode
	 * @param city
	 * @param telephone
	 */
	public Client(String surName, String firstName, String address, String zipCode, String city, String telephone) {
		super();
		
		setClientID();
		this.surName = surName;
		this.firstName = firstName;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.telephone = telephone;
	}
	
	/**
	 * @return the nextAvailableClientID
	 */
	public static int getNextAvailableClientID() {
		return nextAvailableClientID;
	}	

	/**
	 * @return the clientID
	 */
	public int getClientID() {
		return clientID;
	}

	/**
	 * clientID must be set in Constructors
	 */
	public void setClientID() {

		if(Client.nextAvailableClientID < 0)
			clientID = Client.nextAvailableClientID = 0;
		else
			clientID = Client.nextAvailableClientID++;

	}	
	
	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [clientID=" + clientID + ", surName=" + surName + ", firstName=" + firstName + ", address="
				+ address + ", zipCode=" + zipCode + ", city=" + city + ", telephone=" + telephone + "]";
	}


	
}
