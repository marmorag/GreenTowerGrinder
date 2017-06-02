package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import greentower.stage.minigames.mastermind.MasterMind;

/**
 * Tests the MasterMind class
 * 
 * @author Axelle Delomez
 *
 */
public class TestMasterMind {

/**
 * Tests the method stringChecker(String str)
 */
	public void testStringChecker()
	{
		boolean res;
		String code;
		
		
		//test n°1		
		code = "RRRR";
		res = true; //on sait que R,R,R,R est une combinaison valide
		
		assertEquals("ERREUR : R,R,R,R devrait être une combination valide ",res,MasterMind.stringChecker(code));
		
		//test n°2
		code = "RBBB";
		res = true; //on sait que R,B,B,B est une combinaison valide
		
		assertEquals("ERREUR : R,B,B,B devrait être une combination valide ",res,MasterMind.stringChecker(code));
			
		//test n°3 - le code n'est pas une combinaison valide
		code ="AAAA";
		res = false;
		
		assertEquals("ERREUR : A,A,A,A ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
		//test n°4 - la longueur de la combinaison est invalide
		code = "RRRRR";
		res = false;
		
		assertEquals("ERREUR : CHAINE TROP LONGUE R,R,R,R,R ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
		//test n°5 - la longueur de la combinaison est invalide
		code = "RRR";
		res = false;
		
		assertEquals("ERREUR : CHAINE TROP COURTE R,R,R ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
		//test n°6 - la combinaison contient des espaces
		code = "R RR";
		res = false;
		
		assertEquals("ERREUR : R, ,R,R ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
		// !--CAS LIMITES--!
		
		//test n°7 - la combinaison est vide
		code = (" ");
		res = false;
		
		assertEquals("ERREUR : la combinaison vide ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
		//test n°8 - la combinaison ne contient pas de lettre
		code = ("1234");
		res = false;
		
		assertEquals("ERREUR : 1,2,3,4 ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
		//test n°9 - la combinaison contient des caractères spéciaux
		code = ("&RRR");
		res = false;
		
		assertEquals("ERREUR : &,R,R,R ne devrait pas être une combination valide ",res,MasterMind.stringChecker(code));
		
	}

}