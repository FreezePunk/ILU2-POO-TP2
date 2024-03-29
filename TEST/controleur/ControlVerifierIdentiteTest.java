package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	
	private Village village;
    private ControlVerifierIdentite control;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println ("Initialisation...");
        village = new Village ("Le village des irréductibles", 2, 5);
        village.ajouterHabitant(new Gaulois("Bonemine", 10));
        village.ajouterHabitant(new Gaulois("Astérix", 12));
        village.ajouterHabitant(new Gaulois("Obélix", 15));
        ControlVerifierIdentite = new ControlVerifierIdentite(village);
	}

	@Test
	void testVerifierIdentite() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		 assertTrue(ControlVerifierIdentite.verifierIdentite("Bonemine"));
	}
	
	@Test
	void testControlVerifierIdentite() {
        assertNotNull(control);
	}

	

}
