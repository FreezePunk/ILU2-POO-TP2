package controleur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Gaulois;
import villagegaulois.Village;

class ControlAfficherMarcheTest {

	private ControlAfficherMarche controlAfficherMarche;
    private Village village;
	
	@BeforeEach
	void setUp() throws Exception {
        village = new Village("NomDuVillage", 10, 1); 
        controlAfficherMarche = new ControlAfficherMarche(village);
	}

	@Test
	void testControlAfficherMarche() {
        String[] etatMarche = controlAfficherMarche.donnerEtatMarche();
	}

	@Test
	void testDonnerEtatMarche() {
        String[] etatMarche = controlAfficherMarche.donnerEtatMarche();
        assertNotNull(etatMarche);
        assertEquals(0, etatMarche.length);
        village.installerVendeur(new Gaulois("Vendeur1", 30), "Produit1", 10); // Installation d'un vendeur à l'étal
        village.installerVendeur(new Gaulois("Vendeur2", 25), "Produit2", 8); // Installation d'un autre vendeur à un autre étal
        etatMarche = controlAfficherMarche.donnerEtatMarche();
        assertNotNull(etatMarche);
	}

}
