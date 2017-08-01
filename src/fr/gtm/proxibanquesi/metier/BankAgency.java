package fr.gtm.proxibanquesi.metier;

public class BankAgency {
	
	private final String agencyID;
	private final String creationDate;
	private BankExecutive agencyManager;
	
	public BankAgency(String agencyID, String creationDate, BankExecutive agencyManager) {
		super();
		
		if(agencyID == null)
			this.agencyID = Constants.DEFAULT_AGENCY_ID;
		//si pas de saisie, juste ""//
		else if(agencyID.isEmpty())
			this.agencyID = Constants.DEFAULT_AGENCY_ID;
		else 
			this.agencyID = agencyID;
		
		if(creationDate == null)
			this.creationDate = Constants.DEFAULT_CREATION_DATE_AGENCY;
		//si pas de saisie, juste ""//
		else if(creationDate.isEmpty())
			this.creationDate = Constants.DEFAULT_CREATION_DATE_AGENCY;
		else 
			this.creationDate = creationDate;
		
		this.agencyManager = agencyManager;
	}
	
	
	
	
	
	
	
	
	

}
