package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import greentower.stage.minigames.mastermind.MasterMind;

public class TestMasterMind {

	@Test
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
		
		//test n°4
	}

}