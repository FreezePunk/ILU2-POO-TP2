package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlPrendreEtalTest {

	private Village village;
	private Chef abraracourcix;
	ControlVerifierIdentite controlVerifierIdentite;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println ("Initialisation...");
		village = new Village ("Le village des irréductibles", 2, 1);
		abraracourcix =  new Chef ("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlPrendreEtal() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);
		assertNotNull(controlPrendreEtal,"Le constructeur ne renvoie pas null");
	}
	
	@Test
	void testResteEtals(){
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);
		assertTrue(controlPrendreEtal.resteEtals());
		Gaulois asterix = new Gaulois("Asterix", 10);
		village.installerVendeur(asterix, "produit", 1);
		assertFalse(controlPrendreEtal.resteEtals());
	}
	
	@Test
	void testPrendreEtals() {
		ControlPrendreEtal controlPrendreEtal = new ControlPrendreEtal(controlVerifierIdentite, village);
		Gaulois obelix = new Gaulois("Gaulois", 15);
		village.ajouterHabitant(obelix);
	    int numeroEtal = controlPrendreEtal.prendreEtal("Gaulois", "produit", 1);
	}
	
	@Test
	void testverifierIdentite() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		Gaulois asterix = new Gaulois("Asterix", 10);
		village.ajouterHabitant(asterix);
		assertTrue(controlVerifierIdentite.verifierIdentite("Asterix"));
		assertFalse(controlVerifierIdentite.verifierIdentite("Cesar"));
	}

}
