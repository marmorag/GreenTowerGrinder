package greentower.IO;

import javax.swing.JFrame;
import greentower.ihm.MainWindow;
import greentower.stage.choice.Answers;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.rushhour.GameBoard;
import greentower.stage.minigames.shifumi.Sign;

/**
 * @author Guillaume
 *
 */
public class OutputGraphic implements Output{

	/**
	 * 
	 */
	protected MainWindow mainWindow;
	
	public OutputGraphic()
	{
		this.mainWindow = new MainWindow();
	}
	
	@Override
	public void showDialog(Dialog dialog) {
		//Ecrire les dialogues
		//Utiliser jp
		this.mainWindow.console.setOutput(dialog.toString());
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
	public void showPendu(int nbErreur, String motAAfficher) {
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

	@Override
	public void showRushHourBoard(GameBoard board) {
		// TODO Auto-generated method stub
		
	}
	
	//GamblingMachine

}
