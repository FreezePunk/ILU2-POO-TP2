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
        village = new Village ("Le village des irr�ductibles", 2, 5);
        village.ajouterHabitant(new Gaulois("Bonemine", 10));
        village.ajouterHabitant(new Gaulois("Ast�rix", 12));
        village.ajouterHabitant(new Gaulois("Ob�lix", 15));
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
