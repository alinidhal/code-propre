package ex2;

/**
 * Représente un compte bancaire
 * 
 * @author nidhal
 *
 */
public class Compte {

	/** solde : solde du compte */
	protected double solde;

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	protected String type;
	
	protected double montant;

	/** Construction d'un compte
	 * 
	 * @param solde
	 * @param type
	 */
	public Compte(double solde, String type, double montant) {
		super();
		this.solde = solde;
		this.type = type;
		this.montant = montant;
	}
	
	
	
	@Override
	public String toString() {
		return "Compte [type = " + type + ", solde = " + solde + " €"+ ", Montant = "+ montant+" €"+"]";
	}

	
	
	/**
	 * Getter pour le solde
	 * 
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter pour solde
	 * 
	 * @return solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter pourr type
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter pour type
	 * 
	 * @return type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Setter pour montant
	 * 
	 * @return type
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter pour montant
	 * 
	 * @return type
	 */

	public void setMontant(double montant) {
		this.montant = montant;
	}



	public void appliquerRemuAnnuelle() {
		
	}

}
