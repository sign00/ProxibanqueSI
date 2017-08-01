package fr.gtm.proxibanquesi.metier;

public class BankExecutive {
	private final String execID;
	
	public BankExecutive(String execID) {
		super();
		
	if(execID == null)
		this.execID = Constants.DEFAULT_EXEC_ID;
	//si pas de saisie, juste ""//
	else if(execID.isEmpty())
		this.execID = Constants.DEFAULT_EXEC_ID;
	else 
		this.execID = execID;
	
	}

	public String getExecID() {
		return execID;
	}

}
