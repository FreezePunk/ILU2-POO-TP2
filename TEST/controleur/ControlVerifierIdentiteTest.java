package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	
	private Village village;
	private Chef abraracourcix;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Initialisation...");
		village = new Village("le village des irr�ductibles", 10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testVerifierIdentite() {
		ControlVerifierIdentite  controlVerifierIdentite = new ControlVerifierIdentite(village);
		assertNotNull(controlVerifierIdentite,"Constructeur ne renvoie pas NULL");
	}
	
	@Test
	void testControlVerifierIdentite() {
		ControlVerifierIdentite controlVerifierIdentite= new ControlVerifierIdentite(village);
		Gaulois asterix = new Gaulois("Asterix", 10);
		village.ajouterHabitant(asterix);
		assertTrue(controlVerifierIdentite.verifierIdentite("Asterix"));
		assertFalse(controlVerifierIdentite.verifierIdentite("Test"));
	}	
}
