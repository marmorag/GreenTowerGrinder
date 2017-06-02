package test;
import static org.junit.Assert.*;

import org.junit.Test;

import greentower.IO.InputConsole;
import greentower.IO.OutputConsole;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.pendu.Pendu;

/**
 * Test the pendu class
 * 
 * @author Axelle Delomez
 *
 */
public class TestPendu {

/**
 * Test the method verifierLettre(char lettreEntree)
 */
	@Test
	public void testVerifierLettre()
	{
		//fail("Not yet implemented");
		Pendu pendu = new Pendu(new OutputConsole(), new InputConsole(), Dialog.DIALOG_STAGE1, 1);
		pendu.setMotATrouver("AAB"); // = Mot
		boolean res;
		char lettre;
		
		//test n�1
		lettre = 'A';
		res = true; //on sait que 'A' appartient � Mot
		
		assertEquals("ERREUR : A devrait appartenir � AAB ",res,pendu.verifierLettre(lettre));
	
		//test n�2
		lettre = 'B';
		res = true; //B appartient � Mot
		
		assertEquals("ERREUR : B devrait appartenir � AAB ",res,pendu.verifierLettre(lettre));
		
		//test n�3 - les minuscules
		lettre = 'b'; 
		res = true;
		
		assertEquals("ERREUR : b devrait appartenir � AAB ",res,pendu.verifierLettre(lettre));
		
		//test n�4
		lettre = 'C';
		res = false; //C n'appartient pas � Mot
		
		assertEquals("ERREUR : C ne devrait pas appartenir � AAB ",res,pendu.verifierLettre(lettre));
	
		// !--CAS LIMITES--!
		
		//test n�5 -le caract�re vide
		lettre = ' ';
		res = false;
		
		assertEquals("ERREUR : ' ' ne devrait pas appartenir � AAB ",res,pendu.verifierLettre(lettre));
		
		//test n�6
		lettre = ' ';
		pendu.setMotATrouver(" "); // = Mot
		res = true;
		
		assertEquals("ERREUR : ' ' devrait appartenir � \" \" ",res,pendu.verifierLettre(lettre));
		
		//test n�7
		lettre = 'A';
		res = false;
		
	}

}
