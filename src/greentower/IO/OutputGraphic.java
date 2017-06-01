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

	
	
	
	
	/* ******************************* THE FOLLOWING METHODS SHOULDN'T BE IMPLEMENTED ******************************* */
	
	// PENDU
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


	@Override
	public void showAnswers(String[] answers) {
		// VOID FOR NON USED METHOD AT THIS STAGE
		
	}

	@Override
	public void showStageIntroduction(int stageIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStageEnd(int stageIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void win() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gambling() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HeadsOrTails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LessOrMore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MasterMind() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Othello() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShiFuMi() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Suite() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TicTacToe() {
		// TODO Auto-generated method stub
		
	}
	
	//GamblingMachine

}
