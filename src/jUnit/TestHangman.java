package jUnit;

import org.junit.Test;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.hangman.Hangman;
import junit.framework.TestCase;

/**
 * Test the pendu class
 * 
 * @author Axelle Delomez
 *
 */
public class TestHangman extends TestCase{
	
/**
 * Creates a test of Pendu with the given name
 * 
 * @param name
 */
	public TestHangman(String name)
	{
		super(name);
	}

/**
 * Test the method testCheckLetter(char inputLetter)
 */
	@Test
	public void testCheckLetter()
	{
		//fail("Not yet implemented");
		Hangman pendu = new Hangman(Dialog.DIALOG_STAGE1, 1);
		pendu.setWordToFind("AAB"); // = Word
		boolean res;
		char letter;
		
		//test n�1
		letter = 'A';
		res = true; //A belongs to B
		
		assertEquals("ERREUR : A devrait appartenir � AAB ",res,pendu.checkLetter(letter));
	
		//test n�2
		letter = 'B';
		res = true; //B belongs to Word
		
		assertEquals("ERREUR : B devrait appartenir � AAB ",res,pendu.checkLetter(letter));
		
		//test n�3 - lowercases
		letter = 'b'; 
		res = true;
		
		assertEquals("ERREUR : b devrait appartenir � AAB ",res,pendu.checkLetter(letter));
		
		//test n�4
		letter = 'C';
		res = false; //C doesn't belong to Word
		
		assertEquals("ERREUR : C ne devrait pas appartenir � AAB ",res,pendu.checkLetter(letter));
	
		// !--LIMIT CASES--!
		
		//test n�5 - empty char
		letter = ' ';
		res = false;
		
		assertEquals("ERREUR : ' ' ne devrait pas appartenir � AAB ",res,pendu.checkLetter(letter));
		
		//test n�6
		letter = ' ';
		pendu.setWordToFind(" "); // = Word
		res = true;
		
		assertEquals("ERREUR : ' ' devrait appartenir � \" \" ",res,pendu.checkLetter(letter));
		
		//test n�7
		letter = 'A';
		res = false;
		
	}

}
