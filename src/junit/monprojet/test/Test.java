package junit.monprojet.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

/**
 * 
 */
class Test {
    SommeArgent m12CHF = new SommeArgent(12, "CHF");
    SommeArgent m14CHF = new SommeArgent(14, "CHF");
	

	//@org.junit.jupiter.api.Test
	/*
	 * public void testAdditionSommeArgent() { // (1) Créer deux sommes d'argent
	 * SommeArgent m12CHF = new SommeArgent(12, "CHF"); SommeArgent m14CHF = new
	 * SommeArgent(14, "CHF");
	 * 
	 * // (2) Résultat attendu SommeArgent expected = new SommeArgent(26, "CHF");
	 * 
	 * // (3) Additionner les deux sommes SommeArgent result = m12CHF.add(m14CHF);
	 * 
	 * // (4) Vérifier que le résultat est correct
	 * assertTrue(expected.equals(result),
	 * "La somme de 12CHF et 14CHF devrait être 26CHF"); }
	 * 
	 * @org.junit.jupiter.api.Test
	 */

	/*public void testEqualsSommeArgent() {
	    SommeArgent m12CHF = new SommeArgent(12, "CHF");
	    SommeArgent m14CHF = new SommeArgent(14, "CHF");
	    SommeArgent m14USD = new SommeArgent(14, "USD");

	    // (1) Vérifie que l'objet n'est pas égal à null
	    assertTrue(!m12CHF.equals(null));

	    // (2) Vérifie que l'objet est égal à lui-même
	    assertEquals(m12CHF, m12CHF);

	    // (3) Vérifie que deux objets avec les mêmes valeurs sont égaux
	    assertEquals(m12CHF, new SommeArgent(12, "CHF"));

	    // (4) Vérifie que deux objets avec des quantités différentes ne sont pas égaux
	    assertTrue(!m12CHF.equals(m14CHF));

	    // (5) Vérifie que deux objets avec des unités différentes ne sont pas égaux
	    assertTrue(!m14USD.equals(m14CHF));*/
	//}  
	
	/*
	 * private static int testCount = 1;
	 * 
	 * // Code à exécuter avant chaque méthode de test
	 * 
	 * @BeforeEach public void beforeEachTest() { System.out.println(testCount +
	 * "ime passage avant exécution d'une méthode de test"); }
	 * 
	 * // Code à exécuter après chaque méthode de test
	 * 
	 * @AfterEach public void afterEachTest() { System.out.println(testCount +
	 * "ime passage APRES exécution d'une méthode de test"); testCount++; }
	 * 
	 * @org.junit.jupiter.api.Test
	 * 
	 * public void testEquality() { SommeArgent m12CHF = new SommeArgent(12, "CHF");
	 * assertEquals(m12CHF, new SommeArgent(12, "CHF")); }
	 * 
	 * @org.junit.jupiter.api.Test public void testInequality() { SommeArgent m12CHF
	 * = new SommeArgent(12, "CHF"); SommeArgent m14CHF = new SommeArgent(14,
	 * "CHF"); assertTrue(!m12CHF.equals(m14CHF)); }
	 */
	
	
	
		/*
		 * public void testAddWithDifferentUnits() { // (1) Créer deux objets
		 * SommeArgent avec des unités différentes SommeArgent m12CHF = new
		 * SommeArgent(12, "CHF"); SommeArgent m14USD = new SommeArgent(14, "USD");
		 * 
		 * // (2) Vérifier que l'exception est levée Exception exception =
		 * assertThrows(UniteDistincteException.class, () -> { // (3) Tenter d'ajouter
		 * deux sommes avec des unités différentes m12CHF.add(m14USD); });
		 * 
		 * // (4) Vérifier le message de l'exception String expectedMessage =
		 * "Unité distincte : CHF != USD"; String actualMessage = exception.toString();
		 * 
		 * assertTrue(actualMessage.contains(expectedMessage)); }
		 */
	  // Test d'addition avec des unités différentes
   //// private SommeArgent m12CHF = new SommeArgent(12, "CHF");
    //private SommeArgent m14CHF = new SommeArgent(14, "CHF");

		/*
		 * @org.junit.jupiter.api.Test public void testAddSameUnit() throws
		 * UniteDistincteException { SommeArgent expected = new SommeArgent(26, "CHF");
		 * SommeArgent result = m12CHF.add(m14CHF); assertEquals(expected, result); //
		 * Vérification de l'addition avec la même unité }
		 */
  //  private SommeArgent m12CHF = new SommeArgent(12, "CHF");
   // private SommeArgent m14CHF = new SommeArgent(14, "CHF");
    /**
     * 
     */
	/*
	 * private SommeArgent m12USD = new SommeArgent(12, "USD");
	 * 
	 * @org.junit.jupiter.api.Test
	 * 
	 * void testAddDifferentUnitThrowsException() { UniteDistincteException thrown =
	 * assertThrows(UniteDistincteException.class, () -> { m12CHF.add(m12USD); //
	 * Tentative d'ajout avec des unités différentes });
	 * assertEquals("Unité distincte : CHF != USD", thrown.toString()); //
	 * Vérification du message d'erreur }
	 */
   // private SommeArgent m12CHF = new SommeArgent(12, "CHF");
    //private SommeArgent m14CHF = new SommeArgent(14, "CHF");
	/*
	 * private SommeArgent m12USD = new SommeArgent(12, "USD");
	 * 
	 * @org.junit.jupiter.api.Test public void testAddSameUnit() throws
	 * UniteDistincteException { SommeArgent expected = new SommeArgent(26, "CHF");
	 * SommeArgent result = m12CHF.add(m14CHF); assertEquals(expected, result); //
	 * Vérification de l'addition avec la même unité }
	 */
	/*
	 * @org.junit.jupiter.api.Test public void testAddDifferentUnit() {
	 * UniteDistincteException thrown = assertThrows(UniteDistincteException.class,
	 * () -> { m12CHF.add(m12USD); }); assertEquals("Unité distincte : CHF != USD",
	 * thrown.toString()); // Vérification du message d'erreur }
	 */
    @org.junit.jupiter.api.Test
    public void testAjouteSomme() {
        PorteMonnaie pm1 = new PorteMonnaie();
        PorteMonnaie pm2 = new PorteMonnaie();
        
        pm1.ajouteSomme(new SommeArgent(5, "EUR"));
        pm1.ajouteSomme(new SommeArgent(5, "EUR"));
        
        pm2.ajouteSomme(new SommeArgent(10, "EUR"));
        
        assertTrue(pm1.equals(pm2)); // Vérifie que pm1 et pm2 sont égaux
    }
    

    
}
