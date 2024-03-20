package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		boolean vendeurReconnu = (controlLibererEtal.isVendeur(nomVendeur) != null);
		
		if (vendeurReconnu == false) {
			System.out.println("Mais vous n'êtes pas inscrit sur notre marché aujourd'hui !");
		}else
		{
			String [] donnesEtal = controlLibererEtal.libererEtal(nomVendeur);
			String EstOccupeEtal = donnesEtal[0];
			if (Boolean.parseBoolean(EstOccupeEtal)) {
				String produit = donnesEtal[2];
				String quantiteInitial = donnesEtal[3];
				String quantiteVendu = donnesEtal [4];
				System.out.println("Vous avez vendu"+quantiteVendu+" sur "+quantiteInitial+" "+produit+".");
				System.out.println("En revoir" + nomVendeur + ", passez une bonne journée");
			}
		}
	}
}
