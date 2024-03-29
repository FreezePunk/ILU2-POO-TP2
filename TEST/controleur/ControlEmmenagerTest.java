package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourcix;

	ControlEmmenager control;
	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println ("Initialisation...");
		village = new Village ("Le village des irréductibles", 2, 5);
		abraracourcix =  new Chef ("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
	}

	@Test
	void testControlEmmenager() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager, "Constructeur ne renvoie pas null");
	}
	
	@Test
	void testisHabitant() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois ("Bonemine", 10);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
		assertTrue(controlEmmenager.isHabitant("Abraracourcix"));
		controlEmmenager.ajouterGaulois ("Autre", 10);
		assertFalse(controlEmmenager.isHabitant("Autre"));
		assertFalse(controlEmmenager.isHabitant("Existe pas"));
		
	}
	
	@Test
	void testajouterDruide() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterDruide("Druide", 1, 10, 20);
		assertTrue(controlEmmenager.isHabitant("Druide"));
	}
	
	@Test
	void testajouterGaulois() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		controlEmmenager.ajouterGaulois ("Bonemine", 10);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));

	}
	
}
