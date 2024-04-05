package controleur;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;


class ControlTrouverEtalVendeurTest {

	private Village village;
	private Chef abraracourcix;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println ("Initialisation...");
		village = new Village ("Le village des irréductibles", 2, 1);
		abraracourcix =  new Chef ("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlTrouverEtalVendeur() {
		Gaulois asterix = new Gaulois("Asterix", 10);
        village.ajouterHabitant(asterix);
        Etal etal = new Etal();
        etal.occuperEtal(asterix, "baguette", 5);
    }

	@Test
	void testTrouverEtalVendeur() {
		fail("Not yet implemented");
	}

}
