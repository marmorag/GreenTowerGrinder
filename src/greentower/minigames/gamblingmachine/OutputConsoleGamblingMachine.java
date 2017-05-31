package greentower.minigames.gamblingmachine;

import greentower.IO.Output;
import greentower.core.Dialog;

/**
 * This class implements Output interface, it display anything in console mode
 *
 */
public class OutputConsoleGamblingMachine implements Output {

	@Override
	public void showDialog(Dialog dialog) {
		System.out.println(dialog);

	}
	
	
	public void showText(String str)
	{
		System.out.println(str);
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
