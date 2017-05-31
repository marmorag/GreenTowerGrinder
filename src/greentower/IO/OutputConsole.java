package greentower.IO;

import greentower.core.Dialog;

/**
 * Implementation of Output to display in console mode
 * @author gavinr
 * 
 */
public class OutputConsole implements Output{

	@Override
	public void showDialog(Dialog dialog) {
		System.out.println(dialog);
	}
	
	@Override
	public void showText(String str) {
		System.out.println(str);
		
	}
	
	@Override
	public void showAnswers(String[] answers) {
		for(int i = 0; i < answers.length; i++)
		{
			System.out.println(answers[i]);
		}
		
	}
	
	
	/* ******************************* THE FOLLOWING METHODS SHOULDN'T BE IMPLEMENTED ******************************* */
	
	
	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void erreurLettre() {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void notifyLoose(String motATrouver) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void demanderCaractere() {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	@Override
	public void afficherPendu(int nbErreur, String motAAfficher) {
		// VOID FOR NON USED METHOD AT THIS STAGE
	}

	


	

}
