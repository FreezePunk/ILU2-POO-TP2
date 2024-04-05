package controleur;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

class ControlLibererEtalTest {

	private Village village;
	private Chef abraracourcix;
	private ControlLibererEtal controlLibererEtal;
	private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println ("Initialisation...");
		village = new Village ("Le village des irréductibles", 2, 5);
		abraracourcix =  new Chef ("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		Gaulois vendeur = new Gaulois("VendeurExistant", 30);
		village.ajouterHabitant(vendeur);
		village.installerVendeur(vendeur, "Produit", 1);
	}

	@Test
	void testControlLibererEtal() {
		
	}

	@Test
	void testIsVendeur() {
        Etal etal = controlLibererEtal.isVendeur("VendeurExistant");
        assertNotNull(etal);
        etal = controlLibererEtal.isVendeur("VendeurInexistant");
        assertNull(etal);
	}

	@Test
	void testLibererEtal() {
		fail("Not yet implemented");
	}

}
