package greentower.minigames.gamblingmachine;

import greentower.IO.Output;
import greentower.core.Dialog;

public class OutputGraphicGamblingMachine implements Output {

	@Override
	public void showDialog(Dialog dialog) {
		// TODO Auto-generated method stub

	}

	@Override
	public void showText(String str) {
		// TODO Auto-generated method stub

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
