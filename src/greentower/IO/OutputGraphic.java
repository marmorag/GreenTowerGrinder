package greentower.IO;

import javax.swing.JFrame;
import javax.swing.JPanel;

import greentower.core.Answers;
import greentower.core.Dialog;
import greentower.minigames.shifumi.Sign;

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
	public void showStageIntroduction(int stageIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showStageEnd(int stageIndex) {
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
	public void showError(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gambling(int[] grid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void HeadsOrTails(int face) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LessOrMore(int number) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShiFuMi(Sign player, Sign random) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Suite(int nb1, int nb2, int nb3, int nb4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TicTacToe(int[][] grid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showMiniGameResult(int result)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showPrompt()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showAnswers(Answers answers) {
		// TODO Auto-generated method stub
		
	}
	
	//GamblingMachine

}
