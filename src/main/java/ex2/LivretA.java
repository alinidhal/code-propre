package ex2;

/**
 * Représente un compte bancaire de type Livret A
 * 
 * @author nidhal
 *
 */
public class LivretA extends Compte {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param type             = LA
	 * @param solde            représente le solde du compte
	 * @param decouvert        représente le découvert autorisé
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 * @return
	 * 
	 */

	public LivretA(String type, double solde, double montant, double tauxRemuneration) {
		super(tauxRemuneration, type, montant);
		this.type = type;
		this.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {
		if (type.equals("LA")) {
			this.solde = solde + solde * tauxRemuneration / 100;
		}
	}

	/**
	 * Getter pour tauxRemuneration
	 * 
	 * @return tauxRemuneration
	 */

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter pour tauxRemuneration
	 * 
	 * @return tauxRemuneration
	 */

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
