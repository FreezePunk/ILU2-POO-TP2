package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;
import personnages.Chef;
import personnages.Gaulois;

class ControlAfficherVillageTest {

	private Village village;
    private ControlAfficherVillage controlAfficherVillage;
	
	@BeforeEach
	void setUp() throws Exception {
		village = new Village("Le village des irréductibles", 5, 3);
        controlAfficherVillage = new ControlAfficherVillage(village);

        Chef chef = new Chef("Abraracourcix", 50, village);
        village.setChef(chef);

        Gaulois asterix = new Gaulois("Asterix", 30);
        Gaulois obelix = new Gaulois("Obelix", 35);
        village.ajouterHabitant(asterix);
        village.ajouterHabitant(obelix);
	}
	
	
	@Test
	void testDonnerNomsVillageois() {
        String[] nomsVillageois = controlAfficherVillage.donnerNomsVillageois();
        assertTrue(nomsVillageois.length == 3);
        assertTrue(nomsVillageois[0].equals("Abraracourcix"));
        assertTrue(nomsVillageois[1].equals("Asterix"));
        assertTrue(nomsVillageois[2].equals("Obelix"));
    }

	@Test
	void testDonnerNomVillage() {
        String nomVillage = controlAfficherVillage.donnerNomVillage();
        assertEquals("Le village des irréductibles", nomVillage);
    }

	@Test
	void testDonnerNbEtals() {
		int nbEtals = controlAfficherVillage.donnerNbEtals();
        assertEquals(3, nbEtals);
	}

}
