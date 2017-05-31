package greentower.IO;

import greentower.core.Dialog;

/**
 * Implementation of Output to display in console mode
 * @author gavinr
 * 
 */
public class OutputConsole implements Output{

	@Override
	public void showText(Dialog dialog) {
		System.out.println(dialog);
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
