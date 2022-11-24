package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC)
 * 
 * @author DIGINAMIC
 */
public class CompteCourant extends Compte {

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert = 100;

	/**
	 * Ce constructeur est utilisé pour créer un compte courant
	 * 
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteCourant(String type, double solde, double montant, double decouvert) {
		super(decouvert, type, montant);
		this.decouvert = decouvert;
		this.montant = montant;
		this.solde = solde;
	}

	/**
	 * Ajoute un montant au solde
	 * 
	 * @param montant
	 */
	public void ajouterMontant(double montant) {
		this.solde += montant;
	}

	/**
	 * Debiter un montant au solde
	 * 
	 * @param montant
	 */
	public void debiterMontant(double montant) {
		if (this.solde - montant > decouvert) {
			this.solde = solde - montant;
		}
		

	}

	/**
	 * Getter for solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Getter for decouvert
	 * 
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/**
	 * Setter
	 * 
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

//	/** Getter for tauxRemuneration
//	 * @return the tauxRemuneration
//	 */
//	public double getTauxRemuneration() {
//		return tauxRemuneration;
//	}
//	/** Setter
//	 * @param tauxRemuneration the tauxRemuneration to set
//	 */
//	public void setTauxRemuneration(double tauxRemuneration) {
//		this.tauxRemuneration = tauxRemuneration;
//	}
//	/** Getter for type
//	 * @return the type
//	 */
//	public String getType() {
//		return type;
//	}
//	/** Setter
//	 * @param type the type to set
//	 */
//	public void setType(String type) {
//		this.type = type;
//	}
}
