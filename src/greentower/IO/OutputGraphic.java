package greentower.IO;

import javax.swing.JFrame;
import javax.swing.JPanel;

import greentower.core.Dialog;

/**
 * @author Guillaume
 *
 */
@SuppressWarnings("serial")
public class OutputGraphic extends JFrame implements Output{

	/**
	 * 
	 */
	protected JPanel jp;
	
	@Override
	public void showDialog(Dialog dialog) {
		//Ecrire les dialogues
		//Utiliser jp
		
	}

	@Override
	public void showText(String str) {
		// Afficher le texte passé en paramètre
		// Utiliser jp
		
	}

	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void erreurLettre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyLoose(String motATrouver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void demanderCaractere() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afficherPendu(int nbErreur, String motAAfficher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnswers(String[] answers) {
		// TODO Auto-generated method stub
		
	}

}
