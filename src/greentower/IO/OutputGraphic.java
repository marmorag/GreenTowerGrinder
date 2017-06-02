package greentower.IO;

import javax.swing.JFrame;
import greentower.ihm.MainWindow;
import greentower.stage.choice.Answers;
import greentower.stage.choice.Dialog;
import greentower.stage.minigames.MiniGame;
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
		this.mainWindow.console.setOutput(dialog.toString());
	}

	@Override
	public void showText(String str) {
		this.mainWindow.console.setOutput(str);
	}

	
	
	
	
	/* ******************************* THE FOLLOWING METHODS SHOULDN'T BE IMPLEMENTED ******************************* */
	
	// PENDU
	@Override
	public void notifyWin(int nbCoups, String motATrouver) {
		String str = "Felicitations vous avez réussi en : "+ nbCoups +"coups\n"+"Le mot était :"+motATrouver+"\n";		
		this.mainWindow.console.setOutput(str);
	}

	@Override
	public void erreurLettre() {
		this.mainWindow.console.setOutput("\nLa lettre n'est pas contenu dans le mot!\n");
		
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
		String str = "***************************************************\n"
					+"------------- ENTREE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------\n"
					+"***************************************************" ;
		this.mainWindow.console.setOutput(str);
		
	}

	@Override
	public void showStageEnd(int stageIndex) {
		String str = "***************************************************\n"
				+"------------- SORTIE DANS L'ETAGE N°" + (stageIndex + 1) + " -------------\n"
				+"***************************************************" ;
	this.mainWindow.console.setOutput(str);
		
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
		System.err.println(str);
		this.mainWindow.console.setOutput("\n\n"+str);
		
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
		String str = OutputConsole.gotN(2);
		if (result == MiniGame.RESULT_VICTORY)
		{
			str = str +"\nFéliciations tu as gagné le mini-jeu.";
		}
		else
		{
			str = str + "\nDommage, tu as perdu";
		}
		str = str + "\nRendez-vous au prochain étage";
		
		this.mainWindow.console.setOutput(str);		
	}

	@Override
	public void showPrompt()
	{
		this.mainWindow.console.setOutput("\n> ");
	}

	@Override
	public void showAnswers(Answers answers) {
		this.mainWindow.console.setOutput(answers.toString());
		
	}

	@Override
	public void showRushHourBoard(GameBoard board) {
		// TODO Auto-generated method stub
		
	}
	
	//GamblingMachine

}
