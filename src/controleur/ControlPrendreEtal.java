package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		boolean resteEtal= village.rechercherEtalVide();
		return resteEtal;
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		int numeroEtal = -1;
		Gaulois vendeur = village.trouverHabitant(produit);
		numeroEtal = village.installerVendeur(vendeur, produit, nbProduit);
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		return controlVerifierIdentite.verifierIdentite(nomVendeur);
	}
}
